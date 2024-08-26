package net.mryeetman.magesanity.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mryeetman.magesanity.Magesanity;
import net.mryeetman.magesanity.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, Magesanity.MOD_ID);


    public static final RegistryObject<Block> JOMAMA_BLOCK = registerBlock("whosjoe",
            //you can override properties for example you can add .sounds or somthing new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)!!!!HERE!!!))
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> BREWING_CAOUL = registerBlock("witchcal",
            //you can override properties for example you can add .sounds or somthing new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)!!!!HERE!!!))
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));









    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    public static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }





    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

