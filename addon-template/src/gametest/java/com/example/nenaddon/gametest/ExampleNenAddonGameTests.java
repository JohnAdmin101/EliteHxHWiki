package com.example.nenaddon.gametest;

import java.util.function.Consumer;

import com.example.nenaddon.ExampleAbilities;
import com.example.nenaddon.ExampleIds;
import com.example.nenaddon.ExampleVows;
import com.johnadmin.elitehxh.api.NenApi;
import com.johnadmin.elitehxh.api.nen.NenAbilityTags;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.gametest.framework.FunctionGameTestInstance;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.gametest.framework.TestData;
import net.minecraft.gametest.framework.TestEnvironmentDefinition;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Rotation;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.OnDatapackSyncEvent;
import net.neoforged.neoforge.event.RegisterGameTestsEvent;
import net.neoforged.neoforge.network.registration.ChannelAttributes;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * This addon's game tests (./gradlew runGameTestServer). Dev only: the gametest source set is part of the mod in dev runs
 * and never in the jar. The one test here proves the addon loads beside Elite HxH; add your own beside it.
 */
@Mod(ExampleIds.MODID)
public final class ExampleNenAddonGameTests {
    private static final DeferredRegister<Consumer<GameTestHelper>> FUNCTIONS =
            DeferredRegister.create(Registries.TEST_FUNCTION, ExampleIds.MODID);
    private static final Identifier SPARK_FIST_IS_READY = ExampleIds.id("spark_fist_is_registered_and_learnable");

    public ExampleNenAddonGameTests(IEventBus modEventBus) {
        Consumer<GameTestHelper> body = ExampleNenAddonGameTests::sparkFistIsReady;
        FUNCTIONS.register(SPARK_FIST_IS_READY.getPath(), () -> body);
        FUNCTIONS.register(modEventBus);
        modEventBus.addListener(ExampleNenAddonGameTests::onRegisterGameTests);
        // Elite HxH requires Curios, which sends its sync payloads to every player a datapack sync reaches without checking
        // the connection. A mock player's connection has no negotiated channels, so declare Curios' ones ad hoc first.
        NeoForge.EVENT_BUS.addListener(EventPriority.HIGHEST, ExampleNenAddonGameTests::declareCuriosChannels);
    }

    private static void declareCuriosChannels(OnDatapackSyncEvent event) {
        event.getRelevantPlayers().forEach(player -> {
            if (player.connection != null) {
                var channels = ChannelAttributes.getOrCreateAdHocChannels(player.connection.getConnection());
                for (String path : new String[] {"sync_data", "sync_curios", "sync_modifiers", "sync_render", "sync_stack",
                        "sync_active", "break", "grabbed_item", "server_page", "quick_move"}) {
                    channels.add(Identifier.fromNamespaceAndPath("curios", path));
                }
            }
        });
    }

    // makeMockServerPlayerInLevel is marked for removal in 26.3 but is still the game tests' way to get a server player.
    @SuppressWarnings("removal")
    private static void sparkFistIsReady(GameTestHelper helper) {
        helper.assertTrue(ExampleAbilities.SPARK_FIST.isBound(), "Spark Fist is registered");
        helper.assertTrue(ExampleVows.SPARK_OFFERING.isBound(), "Spark Offering is registered");
        helper.assertTrue(ExampleAbilities.SPARK_FIST.is(NenAbilityTags.MANUAL_POOL), "manuals can teach Spark Fist");
        ServerPlayer player = helper.makeMockServerPlayerInLevel();
        helper.assertFalse(NenApi.user(player).isAwakened(), "Elite HxH runs: a new player has not awakened");
        helper.succeed();
    }

    private static void onRegisterGameTests(RegisterGameTestsEvent event) {
        Holder<TestEnvironmentDefinition<?>> environment = event.registerEnvironment(ExampleIds.id("default"));
        event.registerTest(SPARK_FIST_IS_READY, new FunctionGameTestInstance(
                ResourceKey.create(Registries.TEST_FUNCTION, SPARK_FIST_IS_READY),
                new TestData<>(environment, Level.OVERWORLD, Identifier.withDefaultNamespace("empty"), 100, 0, true,
                        Rotation.NONE, false, 1, 1, false, 0)));
    }
}
