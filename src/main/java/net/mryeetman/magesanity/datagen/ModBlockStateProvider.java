package net.mryeetman.magesanity.datagen;

import net.minecraft.client.model.Model;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.mryeetman.magesanity.Magesanity;
import net.minecraft.world.level.block.Block;
import net.mryeetman.magesanity.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Magesanity.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.JOMAMA_BLOCK);


        simpleBlock(ModBlocks.BREWING_CAOUL.get(),
            new ModelFile.UncheckedModelFile(modLoc("block/withcaulblock")));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
