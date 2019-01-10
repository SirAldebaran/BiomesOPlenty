/*******************************************************************************
 * Copyright 2014-2019, the Biomes O' Plenty Team
 *
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 *
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/
package biomesoplenty.init;

import static biomesoplenty.api.block.BOPBlocks.*;

import biomesoplenty.common.block.BlockAsh;
import biomesoplenty.common.block.BlockFlowerBOP;
import biomesoplenty.common.block.BlockFoliageBOP;
import biomesoplenty.common.block.BlockMud;
import biomesoplenty.common.block.BlockMushroomBOP;
import biomesoplenty.common.block.BlockPlantBOP;
import biomesoplenty.common.block.BlockVineBOP;
import biomesoplenty.common.util.inventory.ItemGroupBOP;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks
{
    public static void init()
    {
        ash_block = registerBlock(new BlockAsh(), "ash_block");
        mud = registerBlock(new BlockMud(), "mud");
        
        ivy = registerBlock(new BlockVineBOP(), "ivy");
        willow_vine = registerBlock(new BlockVineBOP(), "willow_vine");
        
        short_grass = registerBlock(new BlockFoliageBOP(), "short_grass");
        bush = registerBlock(new BlockFoliageBOP(), "bush");
        barley = registerBlock(new BlockFoliageBOP(), "barley");
        dune_grass = registerBlock(new BlockFoliageBOP(), "dune_grass");
        desert_grass = registerBlock(new BlockFoliageBOP(), "desert_grass");
        dead_grass = registerBlock(new BlockFoliageBOP(), "dead_grass");
        devilweed = registerBlock(new BlockFoliageBOP(), "devilweed");
        spectral_fern = registerBlock(new BlockFoliageBOP(), "spectral_fern");
        
        thorn = registerBlock(new BlockPlantBOP(), "thorn");
        tiny_cactus = registerBlock(new BlockPlantBOP(), "tiny_cactus");
        cattail = registerBlock(new BlockPlantBOP(), "cattail");
        root = registerBlock(new BlockPlantBOP(), "root");
        reed = registerBlock(new BlockPlantBOP(), "reed");
        watergrass = registerBlock(new BlockPlantBOP(), "watergrass");
        
        rose = registerBlock(new BlockFlowerBOP(), "rose");
        blue_hydrangea = registerBlock(new BlockFlowerBOP(), "blue_hydrangea");
        violet = registerBlock(new BlockFlowerBOP(), "violet");
        lavender = registerBlock(new BlockFlowerBOP(), "lavender");
        goldenrod = registerBlock(new BlockFlowerBOP(), "goldenrod");
        wildflower = registerBlock(new BlockFlowerBOP(), "wildflower");
        orange_cosmos = registerBlock(new BlockFlowerBOP(), "orange_cosmos");
        pink_daffodil = registerBlock(new BlockFlowerBOP(), "pink_daffodil");
        pink_hibiscus = registerBlock(new BlockFlowerBOP(), "pink_hibiscus");
        glowflower = registerBlock(new BlockFlowerBOP(), "glowflower");
        deathbloom = registerBlock(new BlockFlowerBOP(), "deathbloom");
        wilted_lily = registerBlock(new BlockFlowerBOP(), "wilted_lily");
        burning_blossom = registerBlock(new BlockFlowerBOP(), "burning_blossom");
        
        toadstool = registerBlock(new BlockMushroomBOP(), "toadstool");
        glowshroom = registerBlock(new BlockMushroomBOP(), "glowshroom");
    }

    public static Block registerBlock(Block block, String name)
    {
        ItemBlock itemBlock = new ItemBlock(block, new Item.Builder().group(ItemGroupBOP.instance));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
}