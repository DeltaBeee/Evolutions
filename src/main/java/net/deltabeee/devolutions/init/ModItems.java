package net.deltabeee.devolutions.init;

import net.deltabeee.devolutions.DEvolutions;
import net.deltabeee.devolutions.item.DevItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DEvolutions.MOD_ID);
    // Below, please :)

    public static final RegistryObject<Item> ITEM = ITEMS.register("item", () -> new DevItem(new Item.Properties().fireResistant()));

    // Too far!
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
