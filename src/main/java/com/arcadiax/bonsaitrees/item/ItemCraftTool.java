package com.arcadiax.bonsaitrees.item;

import com.arcadiax.bonsaitrees.Main;
import com.arcadiax.bonsaitrees.init.ModItems;
import com.arcadiax.bonsaitrees.util.IHasModel;
import com.arcadiax.bonsaitrees.util.Reference;

import it.unimi.dsi.fastutil.Stack;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCraftTool extends ItemBase implements IHasModel {
	
	public ItemCraftTool(String name, int maxDamage) {
		super(name);
		this.setMaxDamage(maxDamage);
		this.setNoRepair();
		this.canRepair = true;
	}
	
	@Override
	public void RegisterModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
    public boolean hasContainerItem(ItemStack stack){
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
    	ItemStack container = new ItemStack(ModItems.GetItem(this.getUnlocalizedName()), 1, itemStack.getItemDamage() + 1);
        return container;
    }
    
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
    	if(repair.getItem().equals(Items.IRON_INGOT))
    		return true;
    	else
    		return false;
    }
}
