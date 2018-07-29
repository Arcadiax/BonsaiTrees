package com.arcadiax.bonsaitrees.init;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.arcadiax.bonsaitrees.blocks.BlockBase;
import com.arcadiax.bonsaitrees.blocks.BlockBonsaiTree;
import com.arcadiax.bonsaitrees.util.StringIntPair;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModBlocks {
	
	//Directories
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static Map<String, Block> BLOCKS_MAP = new HashMap<String, Block>();

	//Crops
	//Oak Bonsai
	public static final Block BONSAI_OAK_TREE = new BlockBonsaiTree("bonsai_oak", new StringIntPair[]{new StringIntPair("item.bonsai_oak_cutting", 4)}, "item.bonsai_oak_sapling", "item.bonsai_oak_sapling");
	public static final Block BONSAI_BIRCH_TREE = new BlockBonsaiTree("bonsai_birch", new StringIntPair[]{new StringIntPair("item.bonsai_birch_cutting", 4)}, "item.bonsai_birch_sapling", "item.bonsai_birch_sapling");
	public static final Block BONSAI_SPRUCE_TREE = new BlockBonsaiTree("bonsai_spruce", new StringIntPair[]{new StringIntPair("item.bonsai_spruce_cutting", 4)}, "item.bonsai_spruce_sapling", "item.bonsai_spruce_sapling");
	public static final Block BONSAI_JUNGLE_TREE = new BlockBonsaiTree("bonsai_jungle", new StringIntPair[]{new StringIntPair("item.bonsai_jungle_cutting", 4)}, "item.bonsai_jungle_sapling", "item.bonsai_jungle_sapling");
	public static final Block BONSAI_ACACIA_TREE = new BlockBonsaiTree("bonsai_acacia", new StringIntPair[]{new StringIntPair("item.bonsai_acacia_cutting", 4)}, "item.bonsai_acacia_sapling", "item.bonsai_acacia_sapling");
	public static final Block BONSAI_DARKOAK_TREE = new BlockBonsaiTree("bonsai_darkoak", new StringIntPair[]{new StringIntPair("item.bonsai_darkoak_cutting", 4)}, "item.bonsai_darkoak_sapling", "item.bonsai_darkoak_sapling");
	
	//Helper Functions
	public static void AddBlock(String name, Block block) {
		BLOCKS.add(block);
		BLOCKS_MAP.put(name, block);
	}
	
	public static Block GetBlock(String name) {
		if(BLOCKS_MAP.containsKey(name)) {
			return BLOCKS_MAP.get(name);
		} else {
			return null;
		}
	}
	
	
	//Regular Blocks
	//public static final Block BASE_BLOCK = new BlockBase("base_block", Material.GROUND, SoundType.STONE, 5.0f, 5.0f, "pickaxe", 0, 0.0f, 0, false, CreativeTabs.MISC);
	
}
