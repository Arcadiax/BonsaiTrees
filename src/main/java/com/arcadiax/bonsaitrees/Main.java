package com.arcadiax.bonsaitrees;

import java.util.HashSet;

import com.arcadiax.bonsaitrees.init.ModBlocks;
import com.arcadiax.bonsaitrees.init.ModItems;
import com.arcadiax.bonsaitrees.init.ModRecipes;
import com.arcadiax.bonsaitrees.proxy.CommonProxy;
import com.arcadiax.bonsaitrees.util.Reference;

import blusunrize.immersiveengineering.api.ComparableItemStack;
import blusunrize.immersiveengineering.api.tool.BelljarHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid=Reference.MODID, name=Reference.NAME, version=Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
		//GARDEN CLOCHE COMPATIBILITY
		if(Loader.isModLoaded("immersiveengineering")) {
			RegisterBelljarSeed(ModItems.BONSAI_OAK_SAPLING, ModBlocks.BONSAI_OAK_TREE, Blocks.DIRT, new ItemStack[] {new ItemStack(ModItems.BONSAI_OAK_CUTTING, 4)});
			RegisterBelljarSeed(ModItems.BONSAI_BIRCH_SAPLING, ModBlocks.BONSAI_BIRCH_TREE, Blocks.DIRT, new ItemStack[] {new ItemStack(ModItems.BONSAI_BIRCH_CUTTING, 4)});
			RegisterBelljarSeed(ModItems.BONSAI_SPRUCE_SAPLING, ModBlocks.BONSAI_SPRUCE_TREE, Blocks.DIRT, new ItemStack[] {new ItemStack(ModItems.BONSAI_SPRUCE_CUTTING, 4)});
			RegisterBelljarSeed(ModItems.BONSAI_JUNGLE_SAPLING, ModBlocks.BONSAI_JUNGLE_TREE, Blocks.DIRT, new ItemStack[] {new ItemStack(ModItems.BONSAI_JUNGLE_CUTTING, 4)});
			RegisterBelljarSeed(ModItems.BONSAI_ACACIA_SAPLING, ModBlocks.BONSAI_ACACIA_TREE, Blocks.DIRT, new ItemStack[] {new ItemStack(ModItems.BONSAI_ACACIA_CUTTING, 4)});
			RegisterBelljarSeed(ModItems.BONSAI_DARKOAK_SAPLING, ModBlocks.BONSAI_DARKOAK_TREE, Blocks.DIRT, new ItemStack[] {new ItemStack(ModItems.BONSAI_DARKOAK_CUTTING, 4)});
		}

	}
	
	public static void RegisterBelljarSeed(Item seed, Block cropBlock, Block growBlock, ItemStack[] drops) {
		BelljarHandler.cropHandler.register(
				new ItemStack(seed, 1), 
				drops, 
				growBlock, 
				cropBlock.getDefaultState());
	}
}
