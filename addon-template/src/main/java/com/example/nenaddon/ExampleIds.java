package com.example.nenaddon;

import net.minecraft.resources.Identifier;

/** This addon's mod id, and ids in its namespace. Keep MODID equal to the modId in META-INF/neoforge.mods.toml. */
public final class ExampleIds {
    public static final String MODID = "examplenenaddon";

    private ExampleIds() {}

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}
