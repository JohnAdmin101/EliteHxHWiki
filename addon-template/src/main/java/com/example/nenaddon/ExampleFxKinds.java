package com.example.nenaddon;

import com.johnadmin.elitehxh.api.fx.FxKind;
import com.johnadmin.elitehxh.api.registry.NenRegistries;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * The addon's effect kinds. A kind only says how long an effect lives, what it costs the client's effect budget and how far
 * it reaches; the client paints it (client/ExampleClientExtensions registers its visual). The server spawns kinds with
 * NenAbilityContext#spawnFx; ability cues spawn them on each client.
 */
public final class ExampleFxKinds {
    public static final DeferredRegister<FxKind> KINDS = DeferredRegister.create(NenRegistries.NEN_FX_KIND, ExampleIds.MODID);

    /** A small ring with a glowing core: 12 ticks, cost 1, drawn within 2 blocks of its origin. */
    public static final DeferredHolder<FxKind, FxKind> SPARK = KINDS.register("spark",
            () -> new FxKind(FxKind.properties().lifeTicks(12).cost(1).boundsRadius(2f)));

    private ExampleFxKinds() {}
}
