package com.example.nenaddon;

import com.johnadmin.elitehxh.api.NenApi;
import com.johnadmin.elitehxh.api.hunter.HunterWare;
import com.johnadmin.elitehxh.api.hunter.HunterWareRegistry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/**
 * The addon's Wandering Hunter ware. A ware is an item for Jenny: an id of your own, a supplier of a fresh stack, the price
 * before the server's price factor, the stock one player may buy per visit and whether a Hunter License is needed. It goes
 * into a table keyed by a specialty id, or by {@code NenApi.id("common")} for the table every Hunter sells from.
 */
public final class ExampleHunterWares {
    public static final net.minecraft.resources.Identifier TEST_WARE = ExampleIds.id("test_ware");

    private ExampleHunterWares() {}

    public static void register() {
        HunterWareRegistry.register(NenApi.id("common"), new HunterWare(TEST_WARE, () -> new ItemStack(Items.STICK), 5, 2, false));
    }
}
