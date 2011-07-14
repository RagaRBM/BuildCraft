package net.minecraft.src.buildcraft.energy;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.BuildCraftCore;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraft.src.buildcraft.api.APIProxy;
import net.minecraft.src.buildcraft.core.ICustomTextureBlock;

public class BlockPollution extends BlockContainer implements ICustomTextureBlock {

	public BlockPollution(int i) {
		super(i, Material.air);
		blockIndexInTexture = 5 * 16 + 0;
	}

	@Override
	public String getTextureFile() {
		return BuildCraftCore.customBuildCraftTexture;
	}


    public boolean isOpaqueCube() {
        return false;
    }
    
    public int getRenderType() {
        return BuildCraftCore.customTextureModel;
    }

	@Override
	protected TileEntity getBlockEntity() {
		// TODO Auto-generated method stub
		return null;
	}
}
