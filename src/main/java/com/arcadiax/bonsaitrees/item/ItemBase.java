package com.arcadiax.bonsaitrees.item;

import com.arcadiax.bonsaitrees.Main;
import com.arcadiax.bonsaitrees.init.ModItems;
import com.arcadiax.bonsaitrees.util.IHasModel;
import com.arcadiax.bonsaitrees.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBase extends Item implements IHasModel, ItemOreDict {
	
	public String oreDict = "";
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Reference.BASE_CREATIVE_TAB);
		
		ModItems.AddItem(getUnlocalizedName(), this);
	}
	
	public ItemBase(String name, String oreDict) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Reference.BASE_CREATIVE_TAB);
		this.oreDict = oreDict;
		ModItems.AddItem(getUnlocalizedName(), this);
	}
	
	@Override
	public void RegisterModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public void initOreDict() {
		if(oreDict != "")
		OreDictionary.registerOre(oreDict, this);
	}
	
}
