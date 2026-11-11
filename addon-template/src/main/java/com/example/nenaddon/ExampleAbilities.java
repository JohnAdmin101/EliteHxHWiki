package com.example.nenaddon;

import com.johnadmin.elitehxh.api.context.NenAbilityContext;
import com.johnadmin.elitehxh.api.nen.ActivationMode;
import com.johnadmin.elitehxh.api.nen.BeastAbility;
import com.johnadmin.elitehxh.api.nen.BeastRole;
import com.johnadmin.elitehxh.api.nen.MeleeRiderAbility;
import com.johnadmin.elitehxh.api.nen.NenAbility;
import com.johnadmin.elitehxh.api.nen.NenTypes;
import com.johnadmin.elitehxh.api.registry.NenRegistries;

import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * The addon's abilities: Java classes registered in Elite HxH's ability registry with a DeferredRegister, like any other
 * registry entry. Their names come from the lang file (nen_ability.<namespace>.<path> and its .desc). Manuals can teach an
 * ability once it is in its type's ability tag (data/elitehxh/tags/elitehxh/nen_ability/enhancement.json). Server owners
 * can rebalance every number in config/elitehxh/abilities.toml.
 */
public final class ExampleAbilities {
    public static final DeferredRegister<NenAbility> ABILITIES = DeferredRegister.create(NenRegistries.NEN_ABILITY, ExampleIds.MODID);

    /**
     * Spark Fist: an Enhancement rider. For 10 seconds, or until 3 hits land, each melee hit adds the {@code damage} tunable
     * as Nen damage. Needs Ten, like most abilities (the default). One vow may be sworn on it.
     */
    public static final DeferredHolder<NenAbility, SparkFist> SPARK_FIST = ABILITIES.register("spark_fist",
            () -> new SparkFist(NenAbility.properties(NenTypes.ENHANCEMENT).auraCost(20).cooldownTicks(200).vowSlots(1)
                    .tunable("damage", 3.0, 0.5, 50.0)));

    /**
     * Spark Burst: an Enhancement charge. Hold to charge for 1.5 seconds; letting go (or a full charge) hurts everything near
     * you, harder the longer you held. Its client extension plays a cue when the charge fires.
     */
    public static final DeferredHolder<NenAbility, SparkBurst> SPARK_BURST = ABILITIES.register("spark_burst",
            () -> new SparkBurst(NenAbility.properties(NenTypes.ENHANCEMENT).activation(ActivationMode.CHARGE).chargeTicks(30)
                    .auraCost(15).cooldownTicks(120).tunable("damage", 6.0, 0.5, 50.0)));

    /**
     * Spark Hound: an Enhancement beast. The first press summons a fast hound of aura in the addon's own wisp body, a second
     * press dismisses it, and it ends itself after 30 seconds. {@code requiredTechniques()} with no arguments means dropping
     * Ten does not dismiss it. The beast's health, hit, speed and potency cap are tunables that come from its role (HOUND).
     */
    public static final DeferredHolder<NenAbility, SparkHound> SPARK_HOUND = ABILITIES.register("spark_hound",
            () -> new SparkHound(NenAbility.properties(NenTypes.ENHANCEMENT).auraCost(25).cooldownTicks(300).durationTicks(600)
                    .requiredTechniques()));

    private ExampleAbilities() {}

    /** A beast ability built on the API's BeastAbility base class: the role and the body are all it chooses. */
    public static final class SparkHound extends BeastAbility {
        SparkHound(Properties properties) {
            super(properties, BeastRole.HOUND, ExampleBeastBodies.WISP.getId());
        }
    }

    /** A charge ability: onActivate runs once, on release or at full charge, with {@code context.charge()} from 0 to 1. */
    public static final class SparkBurst extends NenAbility {
        SparkBurst(Properties properties) {
            super(properties);
        }

        @Override
        public void onActivate(NenAbilityContext context) {
            float damage = (float) context.tunable("damage") * context.charge();
            for (LivingEntity target : context.livingAround(context.player().position(), 4.0)) {
                context.damage(target, damage);
            }
        }
    }

    /** A rider built on the API's MeleeRiderAbility base class: only the hit is new. */
    public static final class SparkFist extends MeleeRiderAbility {
        SparkFist(Properties properties) {
            super(properties, 10, 3);
        }

        @Override
        protected void onRiderHit(NenAbilityContext context, LivingEntity target, float damage) {
            context.damage(target, (float) context.tunable("damage"));
        }
    }
}
