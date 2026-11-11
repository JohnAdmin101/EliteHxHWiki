package com.example.nenaddon;

import java.util.Set;

import com.johnadmin.elitehxh.api.nen.GeasContext;
import com.johnadmin.elitehxh.api.nen.GeasTerm;
import com.johnadmin.elitehxh.api.nen.GeasTrigger;
import com.johnadmin.elitehxh.api.registry.NenRegistries;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * The addon's Geas terms. A term is the one thing a player bound by Binding Word must not do: it lists the triggers it
 * listens to and answers whether the action behind one of them breaks it. The mod stops the action, warns on the first
 * attempt and strikes on the second. Its name and description are the translation keys {@code nen_geas_term.ns.path} and
 * {@code nen_geas_term.ns.path.desc}.
 */
public final class ExampleGeasTerms {
    public static final DeferredRegister<GeasTerm> TERMS = DeferredRegister.create(NenRegistries.NEN_GEAS_TERM, ExampleIds.MODID);

    /** The bound player may not sprint. A TICK term undoes the action itself in {@code refuse}. */
    public static final DeferredHolder<GeasTerm, GeasTerm> NO_SPRINT = TERMS.register("no_sprint", NoSprintTerm::new);

    private ExampleGeasTerms() {}

    private static final class NoSprintTerm extends GeasTerm {
        @Override
        public Set<GeasTrigger> triggers() {
            return Set.of(GeasTrigger.TICK);
        }

        @Override
        public boolean breaks(GeasTrigger trigger, GeasContext context) {
            return context.bound().isSprinting();
        }

        @Override
        public void refuse(GeasTrigger trigger, GeasContext context) {
            context.bound().setSprinting(false);
        }
    }
}
