package com.arcadiax.bonsaitrees.item;

import com.arcadiax.bonsaitrees.Main;
import com.arcadiax.bonsaitrees.init.ModBlocks;
import com.arcadiax.bonsaitrees.init.ModItems;
import com.arcadiax.bonsaitrees.util.IHasModel;
import com.arcadiax.bonsaitrees.util.Reference;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemBonsaiSapling extends ItemSeeds implements IHasModel, IPlantable {
	
	private String _plant;
	
	public ItemBonsaiSapling(String name, String plant) {
		super(ModBlocks.GetBlock(plant), Blocks.FARMLAND);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Reference.BASE_CREATIVE_TAB);
		_plant = plant;
		ModItems.AddItem(getUnlocalizedName(), this);
	}
	
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack stack = player.getHeldItem(hand);
		IBlockState state = worldIn.getBlockState(pos);
		
		if(facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, stack) && state.getBlock().canSustainPlant(state, worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up())) {
			worldIn.setBlockState(pos.up(), getPlant(worldIn, pos.up()));
			stack.stackSize -= 1;
			return EnumActionResult.SUCCESS;
		}
		
		return EnumActionResult.FAIL;
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Crop;
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return ModBlocks.GetBlock(_plant).getDefaultState();
	}

	@Override
	public void RegisterModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
