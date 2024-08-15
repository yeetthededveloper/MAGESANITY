package net.mryeetman.magesanity.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mryeetman.magesanity.Magesanity;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Magesanity.MOD_ID);


    //this is where you add items use the code below for each item but change the names and stuff
    //allso appelsaouce is the name cus i ran into a error
    public static final RegistryObject<Item> EXITEM = ITEMS.register("appelsaouce" ,
            () -> new Item(new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
