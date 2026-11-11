package com.example.nenaddon;

import com.johnadmin.elitehxh.api.nen.HatsuComponent;
import com.johnadmin.elitehxh.api.nen.HatsuModifier;
import com.johnadmin.elitehxh.api.nen.HatsuStat;
import com.johnadmin.elitehxh.api.nen.NenTypes;
import com.johnadmin.elitehxh.api.registry.NenRegistries;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * The addon's Hatsu modifiers. A modifier is a component a player stacks on a stage of their signature Hatsu to change one
 * number of it. It needs no hooks: you name the stat, how many times it may stack and three tunables (how much one stack
 * changes the stat, what it multiplies the aura cost by, how much potency it adds). The forms that honour the stat do the
 * rest, and a form that does not (see {@code HatsuForm#supports}) greys the modifier out in the builder. Its name and
 * description are the translation keys {@code nen_hatsu_component.ns.path} and {@code nen_hatsu_component.ns.path.desc}.
 */
public final class ExampleModifiers {
    public static final DeferredRegister<HatsuComponent> COMPONENTS =
            DeferredRegister.create(NenRegistries.NEN_HATSU_COMPONENT, ExampleIds.MODID);

    /** One stack makes a form's range 1.5 times longer (Range is a percent stat: base times 1 plus stacks times amount). */
    public static final DeferredHolder<HatsuComponent, HatsuComponent> LONG_REACH = COMPONENTS.register("long_reach", LongReach::new);

    private ExampleModifiers() {}

    private static final class LongReach extends HatsuModifier {
        LongReach() {
            super(HatsuComponent.properties(NenTypes.EMISSION).capacityCost(1), HatsuStat.RANGE, 1, 0.5, 1.1, 0.0);
        }
    }
}
