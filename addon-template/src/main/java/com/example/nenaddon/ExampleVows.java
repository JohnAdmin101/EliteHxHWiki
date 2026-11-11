package com.example.nenaddon;

import com.johnadmin.elitehxh.api.nen.ItemCostVow;
import com.johnadmin.elitehxh.api.nen.NenVow;
import com.johnadmin.elitehxh.api.registry.NenRegistries;

import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/** The addon's vows, built from the API's vow base classes. Names come from the lang file (nen_vow.<namespace>.<path> and its .desc). */
public final class ExampleVows {
    public static final DeferredRegister<NenVow> VOWS = DeferredRegister.create(NenRegistries.NEN_VOW, ExampleIds.MODID);

    /**
     * Spark Offering, on Spark Fist only: each use costs one glowstone dust, for x1.2 potency and x0.9 cost. A use without
     * the dust is refused and breaks the vow: the first time is a warning, then it takes 10% of the aura and seals Spark
     * Fist for 30 seconds.
     */
    public static final DeferredHolder<NenVow, ItemCostVow> SPARK_OFFERING = VOWS.register("spark_offering",
            () -> new ItemCostVow(NenVow.Properties.create().appliesTo(ExampleAbilities.SPARK_FIST).severity(1)
                    .bonus(NenVow.Bonus.none().potency(1.2f).cost(0.9f))
                    .penalty(NenVow.Penalty.none().auraLoss(0.1f).seal(600)), Items.GLOWSTONE_DUST, 1));

    private ExampleVows() {}
}
