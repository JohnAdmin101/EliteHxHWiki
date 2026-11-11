package com.example.nenaddon;

import com.johnadmin.elitehxh.api.event.ChunkClaimEvent;

import net.neoforged.neoforge.common.NeoForge;

/**
 * An addon reacting to a nation event: it refuses every chunk claim of a nation whose name starts with
 * {@value #BLOCKED_PREFIX}. Cancelling a {@link ChunkClaimEvent} keeps the chunk free and the player is told the claim was
 * refused. Other nations are left alone. Nations.nationName and the other queries of the nations API read the same data.
 */
public final class ExampleNationListener {
    public static final String BLOCKED_PREFIX = "Addon Blocked";

    private ExampleNationListener() {}

    public static void register() {
        NeoForge.EVENT_BUS.addListener(ExampleNationListener::onChunkClaim);
    }

    private static void onChunkClaim(ChunkClaimEvent event) {
        if (event.getNationName().startsWith(BLOCKED_PREFIX)) {
            event.setCanceled(true);
        }
    }
}
