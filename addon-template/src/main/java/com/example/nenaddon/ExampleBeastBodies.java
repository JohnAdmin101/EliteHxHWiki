package com.example.nenaddon;

import com.johnadmin.elitehxh.api.nen.BeastBody;
import com.johnadmin.elitehxh.api.registry.NenRegistries;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * The addon's beast bodies. A body is only what a Nen beast looks like: the ability's role decides how the beast plays. The
 * body {@code ns:path} is drawn from the files named after its id, all client assets: the GeckoLib model
 * {@code assets/ns/geckolib/models/entity/beast/path.geo.json}, the animations
 * {@code assets/ns/geckolib/animations/entity/beast/path.animation.json} (idle, walk, attack, summon and dissolve, named
 * {@code animation.beast.*}) and one greyscale texture {@code assets/ns/textures/entity/beast/path.png}, which the client
 * tints with the beast's colour. A client that lacks a body's files draws Elite HxH's default body instead.
 */
public final class ExampleBeastBodies {
    public static final DeferredRegister<BeastBody> BODIES = DeferredRegister.create(NenRegistries.NEN_BEAST_BODY, ExampleIds.MODID);

    /** A small floating wisp (assets under {@code examplenenaddon}, named {@code wisp}), drawn at three quarters of its model's size. */
    public static final DeferredHolder<BeastBody, BeastBody> WISP = BODIES.register("wisp",
            () -> new BeastBody(BeastBody.properties().scale(0.75f)));

    private ExampleBeastBodies() {}
}
