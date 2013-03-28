package vazkii.craftingcreation.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockKiln extends BlockSmokeyBlock {

	public BlockKiln(int id) {
		super(id);
	}

	@Override
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
		super.randomDisplayTick(par1World, par2, par3, par4, par5Random);
    	for (int i = 0; i < 20; ++i) {
    		float x = (float)par2 + par5Random.nextFloat() * 1.4F - 0.2F;
    		float z = (float)par4 + par5Random.nextFloat() * 1.4F - 0.2F;
    		float y = (float)(par3 + 1) - par5Random.nextFloat();
    		par1World.spawnParticle("flame", (double)x, (double)y, (double)z, (par5Random.nextFloat() - 0.5F) / 10, (par5Random.nextFloat() - 0.5F) / 10, (par5Random.nextFloat() - 0.5F) / 10);
    	}
    }
}
