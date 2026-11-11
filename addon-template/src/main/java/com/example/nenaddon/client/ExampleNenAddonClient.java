package com.example.nenaddon.client;

import com.example.nenaddon.ExampleIds;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/** Client entrypoint: loaded on clients only, so common code never touches the client hooks. */
@Mod(value = ExampleIds.MODID, dist = Dist.CLIENT)
public final class ExampleNenAddonClient {
    public ExampleNenAddonClient(IEventBus modEventBus) {
        modEventBus.addListener(ExampleClientExtensions::onRegisterExtensions);
        modEventBus.addListener(ExampleClientExtensions::onRegisterVisuals);
    }
}
