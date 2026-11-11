package com.example.nenaddon;

import com.johnadmin.elitehxh.api.context.ImprintContext;
import com.johnadmin.elitehxh.api.event.NenInfusionEvent;
import com.johnadmin.elitehxh.api.nen.ImprintModifiers;
import com.johnadmin.elitehxh.api.nen.NenImprint;
import com.johnadmin.elitehxh.api.registry.NenRegistries;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * The addon's imprints. An imprint is what a piece of gear does once a Nen user has poured their Nen into it: it adds
 * attribute modifiers on every scan and may react to hits, blows and time. Its name and description are the translation keys
 * {@code nen_imprint.ns.path} and {@code nen_imprint.ns.path.desc}. Its numbers are tunables, which server config can override
 * in {@code abilities.toml}. The ritual picks a built-in imprint by the maker's type; an addon's imprint is chosen by a
 * listener, as {@link #register()} shows.
 */
public final class ExampleImprints {
    public static final DeferredRegister<NenImprint> IMPRINTS = DeferredRegister.create(NenRegistries.NEN_IMPRINT, ExampleIds.MODID);

    /** Armor that makes its wearer a little faster for every grade. No home type, so its glow is white. */
    public static final DeferredHolder<NenImprint, NenImprint> MARKED = IMPRINTS.register("marked", MarkedImprint::new);

    private ExampleImprints() {}

    /** Gives every golden helmet the marked imprint when it is first infused, whatever the maker's type. */
    public static void register() {
        NeoForge.EVENT_BUS.addListener(ExampleImprints::onInfuse);
    }

    private static void onInfuse(NenInfusionEvent.Infuse event) {
        if (event.isFirst() && event.getStack().is(Items.GOLDEN_HELMET)) {
            event.setImprint(MARKED.getId());
        }
    }

    private static final class MarkedImprint extends NenImprint {
        MarkedImprint() {
            super(NenImprint.untyped().tunable("speedPerGrade", 0.01, 0, 1));
        }

        @Override
        public void modifiers(ImprintContext context, ImprintModifiers modifiers) {
            if (context.armor()) {
                modifiers.add(Attributes.MOVEMENT_SPEED, AttributeModifier.Operation.ADD_MULTIPLIED_BASE,
                        context.perGrade(context.tunable("speedPerGrade")));
            }
        }
    }
}
