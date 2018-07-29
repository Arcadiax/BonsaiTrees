package com.arcadiax.bonsaitrees.blocks;

import com.arcadiax.bonsaitrees.Main;
import com.arcadiax.bonsaitrees.init.ModBlocks;
import com.arcadiax.bonsaitrees.init.ModItems;
import com.arcadiax.bonsaitrees.util.IHasModel;
import com.arcadiax.bonsaitrees.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Reference.BASE_CREATIVE_TAB);
		Register();
	}
	
	public BlockBase (String name, Material material, SoundType soundType, float hardness, float resistance, 
			String harvestTool, int harvestLevel, float lightLevel, int lightOpacity, Boolean unbreakable, CreativeTabs creativeTab) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativeTab);
		
		setSoundType(soundType);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(harvestTool, harvestLevel);
		setLightLevel(lightLevel);
		setLightOpacity(lightOpacity);
		
		if(unbreakable) {
			setBlockUnbreakable();
		}
		
		Register();
	}
	
	public void Register() {
		ModBlocks.BLOCKS.add(this);
		ModBlocks.AddBlock(getUnlocalizedName(), this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void RegisterModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
