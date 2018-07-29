package com.arcadiax.bonsaitrees.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes {
	public static void init() {
		
		//SAPLINGS
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BONSAI_OAK_SAPLING, 3), 
				new ItemStack(Blocks.SAPLING, 1, 0), 
				new ItemStack(ModItems.BONSAI_CUTTERS, 1, 32767));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BONSAI_SPRUCE_SAPLING, 3), 
				new ItemStack(Blocks.SAPLING, 1, 1), 
				new ItemStack(ModItems.BONSAI_CUTTERS, 1, 32767));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BONSAI_BIRCH_SAPLING, 3), 
				new ItemStack(Blocks.SAPLING, 1, 2), 
				new ItemStack(ModItems.BONSAI_CUTTERS, 1, 32767));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BONSAI_JUNGLE_SAPLING, 3), 
				new ItemStack(Blocks.SAPLING, 1, 3), 
				new ItemStack(ModItems.BONSAI_CUTTERS, 1, 32767));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BONSAI_ACACIA_SAPLING, 3), 
				new ItemStack(Blocks.SAPLING, 1, 4), 
				new ItemStack(ModItems.BONSAI_CUTTERS, 1, 32767));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BONSAI_DARKOAK_SAPLING, 3), 
				new ItemStack(Blocks.SAPLING, 1, 5), 
				new ItemStack(ModItems.BONSAI_CUTTERS, 1, 32767));
		
		//STICKS
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.STICK, 4), "bonsaicutting", "bonsaicutting"));
		
		//PLANKS
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 0), 
				new ItemStack(ModItems.BONSAI_OAK_CUTTING, 1),
				new ItemStack(ModItems.BONSAI_OAK_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_OAK_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_OAK_CUTTING, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 1), 
				new ItemStack(ModItems.BONSAI_SPRUCE_CUTTING, 1),
				new ItemStack(ModItems.BONSAI_SPRUCE_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_SPRUCE_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_SPRUCE_CUTTING, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 2), 
				new ItemStack(ModItems.BONSAI_BIRCH_CUTTING, 1),
				new ItemStack(ModItems.BONSAI_BIRCH_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_BIRCH_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_BIRCH_CUTTING, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 3), 
				new ItemStack(ModItems.BONSAI_JUNGLE_CUTTING, 1),
				new ItemStack(ModItems.BONSAI_JUNGLE_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_JUNGLE_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_JUNGLE_CUTTING, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 4), 
				new ItemStack(ModItems.BONSAI_ACACIA_CUTTING, 1),
				new ItemStack(ModItems.BONSAI_ACACIA_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_ACACIA_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_ACACIA_CUTTING, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 5), 
				new ItemStack(ModItems.BONSAI_DARKOAK_CUTTING, 1),
				new ItemStack(ModItems.BONSAI_DARKOAK_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_DARKOAK_CUTTING, 1), 
				new ItemStack(ModItems.BONSAI_DARKOAK_CUTTING, 1));
		
		//Tools
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.BONSAI_CUTTERS, 1), " IW", "SBI", " S ", 'I', Items.IRON_INGOT, 'W', Items.STRING, 'S', Items.STICK, 'B', Blocks.STONE);
	}
}
