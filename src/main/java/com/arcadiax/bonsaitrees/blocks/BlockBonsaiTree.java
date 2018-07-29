package com.arcadiax.bonsaitrees.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.arcadiax.bonsaitrees.init.ModBlocks;
import com.arcadiax.bonsaitrees.init.ModItems;
import com.arcadiax.bonsaitrees.util.*;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBonsaiTree extends BlockCrops {
	
    private static final AxisAlignedBB[] CROPS_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
    private StringIntPair[] _drops;
    String _seed;
    String _crop;
	
	public BlockBonsaiTree(String name, StringIntPair[] drops, String seed, String crop) {
		setUnlocalizedName(name);
		setRegistryName(name);
		_seed = seed;
		_crop = crop;
		_drops = drops;
		ModBlocks.AddBlock(getUnlocalizedName(), this);
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			if (this.isMaxAge(state)) {
				for(Integer i = 0; i < _drops.length; i++) {
					worldIn.spawnEntityInWorld(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(ModItems.GetItem(_drops[i].name), _drops[i].count)));
				}
				worldIn.setBlockState(pos, this.withAge(0));
				return true;
			}
		}
		return false;
	}
	
	@Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune){
		List<ItemStack> sendDrops = new ArrayList<ItemStack>();
		for(Integer i = 0; i < _drops.length; i++) {
			sendDrops.add(new ItemStack(ModItems.GetItem(_drops[i].name), _drops[i].count));
		}
		
		return sendDrops;
	}

	protected Item getSeed() {
		return ModItems.GetItem(_seed);
	}

	protected Item getCrop() {
		return ModItems.GetItem(_crop);
	}
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return CROPS_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}

}
