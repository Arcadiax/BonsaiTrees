package com.arcadiax.bonsaitrees.init;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.arcadiax.bonsaitrees.item.ItemBase;
import com.arcadiax.bonsaitrees.item.ItemBonsaiSapling;
import com.arcadiax.bonsaitrees.item.ItemCraftTool;
import com.arcadiax.bonsaitrees.item.ItemOreDict;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	//Directories
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static Map<String, Item> ITEMS_MAP = new HashMap<String, Item>();
	
	//Cuttings
	public static final Item BONSAI_OAK_CUTTING = new ItemBase("bonsai_oak_cutting", "bonsaicutting");
	public static final Item BONSAI_SPRUCE_CUTTING = new ItemBase("bonsai_spruce_cutting", "bonsaicutting");
	public static final Item BONSAI_BIRCH_CUTTING = new ItemBase("bonsai_birch_cutting", "bonsaicutting");
	public static final Item BONSAI_JUNGLE_CUTTING = new ItemBase("bonsai_jungle_cutting", "bonsaicutting");
	public static final Item BONSAI_ACACIA_CUTTING = new ItemBase("bonsai_acacia_cutting", "bonsaicutting");
	public static final Item BONSAI_DARKOAK_CUTTING = new ItemBase("bonsai_darkoak_cutting", "bonsaicutting");
	
	//Saplings
	public static final Item BONSAI_OAK_SAPLING = new ItemBonsaiSapling("bonsai_oak_sapling", "tile.bonsai_oak");
	public static final Item BONSAI_SPRUCE_SAPLING = new ItemBonsaiSapling("bonsai_spruce_sapling", "tile.bonsai_spruce");
	public static final Item BONSAI_BIRCH_SAPLING = new ItemBonsaiSapling("bonsai_birch_sapling", "tile.bonsai_birch");
	public static final Item BONSAI_JUNGLE_SAPLING = new ItemBonsaiSapling("bonsai_jungle_sapling", "tile.bonsai_jungle");
	public static final Item BONSAI_ACACIA_SAPLING = new ItemBonsaiSapling("bonsai_acacia_sapling", "tile.bonsai_acacia");
	public static final Item BONSAI_DARKOAK_SAPLING = new ItemBonsaiSapling("bonsai_darkoak_sapling", "tile.bonsai_darkoak");
	
	//Tools
	public static final Item BONSAI_CUTTERS = new ItemCraftTool("bonsai_cutters", 16);
	
	public static void AddItem(String name, Item item) {
		ITEMS.add(item);
		ITEMS_MAP.put(name, item);
	}
	
	public static Item GetItem(String name) {
		if(ITEMS_MAP.containsKey(name)) {
			return ITEMS_MAP.get(name);
		} else {
			return null;
		}
	}
	
	public static void registerOreDict() {
		for(Item i : ITEMS) {
			if (i instanceof ItemOreDict) {
				((ItemOreDict)i).initOreDict();
			}
		}
	}
	
	//Basic Items
		//public static final Item BASEITEM = new ItemBase("baseitem");
}
