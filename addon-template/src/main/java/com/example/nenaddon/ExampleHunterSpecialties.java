package com.example.nenaddon;

import com.johnadmin.elitehxh.api.nen.HunterSpecialty;
import com.johnadmin.elitehxh.api.registry.NenRegistries;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * The addon's Hunter specialties. A specialty is only a name a licensed hunter can work toward at the Exam Board; the addon
 * awards deeds toward it with INenUser#addHunterDeed (the deed id is the specialty's id) and listens to HunterDeedEvent and
 * HunterStarEvent. Its English name is in the addon's own lang file under the key given here.
 */
public final class ExampleHunterSpecialties {
    public static final DeferredRegister<HunterSpecialty> SPECIALTIES =
            DeferredRegister.create(NenRegistries.NEN_HUNTER_SPECIALTY, ExampleIds.MODID);

    /** A hunter who charts the unknown. */
    public static final DeferredHolder<HunterSpecialty, HunterSpecialty> MAP_MAKER = SPECIALTIES.register("map_maker",
            () -> new HunterSpecialty("nen_hunter_specialty." + ExampleIds.MODID + ".map_maker"));

    private ExampleHunterSpecialties() {}
}
