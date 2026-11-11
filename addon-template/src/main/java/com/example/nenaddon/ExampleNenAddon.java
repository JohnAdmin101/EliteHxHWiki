package com.example.nenaddon;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/** The addon's entrypoint, on both sides: registers its abilities, vows, effect kinds, beast bodies, imprints, a Hunter specialty and a Hatsu modifier in Elite HxH's registries and listens to a nation event. */
@Mod(ExampleIds.MODID)
public final class ExampleNenAddon {
    public ExampleNenAddon(IEventBus modEventBus) {
        ExampleAbilities.ABILITIES.register(modEventBus);
        ExampleVows.VOWS.register(modEventBus);
        ExampleFxKinds.KINDS.register(modEventBus);
        ExampleBeastBodies.BODIES.register(modEventBus);
        ExampleImprints.IMPRINTS.register(modEventBus);
        ExampleHunterSpecialties.SPECIALTIES.register(modEventBus);
        ExampleGeasTerms.TERMS.register(modEventBus);
        ExampleModifiers.COMPONENTS.register(modEventBus);
        ExampleNationListener.register();
        ExamplePostMortemListener.register();
        ExampleImprints.register();
    }
}
