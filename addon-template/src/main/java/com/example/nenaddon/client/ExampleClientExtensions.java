package com.example.nenaddon.client;

import com.johnadmin.elitehxh.api.client.AbilityClientExtension;
import com.johnadmin.elitehxh.api.client.ActiveFrame;
import com.johnadmin.elitehxh.api.client.RegisterNenClientExtensionsEvent;
import com.johnadmin.elitehxh.api.client.fx.FxCanvas;
import com.johnadmin.elitehxh.api.client.fx.FxFrame;
import com.johnadmin.elitehxh.api.client.fx.FxTime;
import com.johnadmin.elitehxh.api.client.fx.RegisterFxVisualsEvent;
import com.johnadmin.elitehxh.api.fx.FxParams;
import com.example.nenaddon.ExampleAbilities;
import com.example.nenaddon.ExampleFxKinds;

import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;

/**
 * How Spark Fist looks and sounds on every client, and how the spark effect is painted. Client only: registered from the
 * client entrypoint, never referenced by common code.
 */
public final class ExampleClientExtensions {
    private ExampleClientExtensions() {}

    /** Spark Fist's icon, its cast sound and spark, a spark where each hit lands, and its rings while it runs. */
    public static void onRegisterExtensions(RegisterNenClientExtensionsEvent event) {
        event.register(ExampleAbilities.SPARK_FIST.getId(), AbilityClientExtension.builder()
                // Draw icons white or grey: the ability bar tints them with the type color. This reuses one of Elite HxH's
                // icons; ship your own as assets/<namespace>/textures/ability/<path>.png.
                .icon(Identifier.fromNamespaceAndPath("elitehxh", "textures/ability/hardened_strike.png"))
                .sound(() -> SoundEvents.AMETHYST_BLOCK_CHIME, 1.0f, 1.2f)
                .onCast(cue -> cue.spawnFx(ExampleFxKinds.SPARK, cue.position(),
                        FxParams.builder().color(cue.typeColor()).radius(1.5f).build()))
                .onImpact(cue -> cue.spawnFx(ExampleFxKinds.SPARK, cue.position(),
                        FxParams.builder().color(cue.typeColor()).radius(0.6f).lifeTicks(8).build()))
                // The render hook: painted every frame while a use runs, around the user.
                .whileActive(ExampleClientExtensions::paintAura)
                .build());
        // A charge ability: onRelease plays when the charge fires (released or full), never when it is cancelled.
        event.register(ExampleAbilities.SPARK_BURST.getId(), AbilityClientExtension.builder()
                .icon(Identifier.fromNamespaceAndPath("elitehxh", "textures/ability/hardened_strike.png"))
                .onRelease(cue -> cue.spawnFx(ExampleFxKinds.SPARK, cue.position(),
                        FxParams.builder().color(cue.typeColor()).radius(3.0f).build()))
                .build());
    }

    public static void onRegisterVisuals(RegisterFxVisualsEvent event) {
        event.register(ExampleFxKinds.SPARK.getId(), ExampleClientExtensions::paintSpark);
    }

    /** The spark: a ring that grows over the effect's life and a small glowing ball, both fading in and out. */
    static void paintSpark(FxCanvas canvas, FxFrame frame) {
        float fade = frame.envelope(2f, 6f);
        if (!(fade > 0f)) {
            return;
        }
        int rgb = frame.rgb(0xFFFFFF);
        float grow = 0.5f + 0.5f * FxTime.easeOutCubic(frame.lifeFraction());
        canvas.ring(frame.radius() * grow, 0.05f, 0.12f, rgb, fade, canvas.seg(24));
        canvas.sphere(0f, 0.3f, 0f, 0.15f * frame.radius(), rgb, 0.6f * fade, false);
    }

    /**
     * Spark Fist while it runs: a ring at the user's feet and a fainter one at the chest, pulsing once a second. It fades in
     * over 6 ticks when the use starts, and shows at once for a use met already running.
     */
    static void paintAura(ActiveFrame frame, FxCanvas canvas) {
        int rgb = frame.typeColor();
        float fadeIn = frame.resumed() ? 1f : FxTime.ramp(frame.age(), 0f, 6f);
        float pulse = 0.75f + 0.25f * FxTime.pulse(frame.age(), 20f);
        canvas.ring(0.9f, 0.1f, 0.12f, rgb, 0.7f * fadeIn * pulse, canvas.seg(32));
        canvas.ring(0.6f, 1.1f, 0.08f, rgb, 0.4f * fadeIn * pulse, canvas.seg(24));
    }
}
