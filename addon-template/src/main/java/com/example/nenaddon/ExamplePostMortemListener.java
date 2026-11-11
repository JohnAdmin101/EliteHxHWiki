package com.example.nenaddon;

import com.johnadmin.elitehxh.api.event.NenPostMortemEvent;

import net.neoforged.neoforge.common.NeoForge;

/**
 * An addon reacting to a counted death: it removes the haunted-ground effect of any victim carrying the scoreboard tag
 * {@value #SPARED_TAG}. {@link NenPostMortemEvent.Counted#effects()} is the set of effects that will run; removing one stops
 * just that one, and every other effect, and the death's record, are left alone. Victims without the tag are not touched.
 */
public final class ExamplePostMortemListener {
    public static final String SPARED_TAG = "example_spared";

    private ExamplePostMortemListener() {}

    public static void register() {
        NeoForge.EVENT_BUS.addListener(ExamplePostMortemListener::onCounted);
    }

    private static void onCounted(NenPostMortemEvent.Counted event) {
        if (event.victim().entityTags().contains(SPARED_TAG)) {
            event.effects().remove(NenPostMortemEvent.Effect.HAUNTED_GROUND);
        }
    }
}
