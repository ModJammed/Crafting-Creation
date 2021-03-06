/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package vazkii.craftingcreation.area;
import net.minecraft.world.World;
import vazkii.craftingcreation.block.ModBlocks;

public class AreaAltar extends AreaGenerator {

	public static final AreaAltar INSTANCE = new AreaAltar();
	
	public AreaAltar() {
		super(0);
	}

	public void generate(World world, int i, int k) {
		world.setBlock(i + 1, j + 0, k + 1, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 1, j + 0, k + 2, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 1, j + 0, k + 3, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 1, j + 0, k + 4, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 1, j + 0, k + 5, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 2, j + 0, k + 1, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 2, j + 0, k + 2, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 2, j + 0, k + 3, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 2, j + 0, k + 4, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 2, j + 0, k + 5, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 2, j + 1, k + 2, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 2, j + 1, k + 3, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 2, j + 1, k + 4, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 3, j + 0, k + 1, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 3, j + 0, k + 2, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 3, j + 0, k + 3, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 3, j + 0, k + 4, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 3, j + 0, k + 5, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 3, j + 1, k + 2, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 3, j + 1, k + 3, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 3, j + 1, k + 4, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 3, j + 2, k + 3, ModBlocks.altar.blockID, 0, 2);
		world.setBlock(i + 4, j + 0, k + 1, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 4, j + 0, k + 2, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 4, j + 0, k + 3, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 4, j + 0, k + 4, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 4, j + 0, k + 5, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 4, j + 1, k + 2, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 4, j + 1, k + 3, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 4, j + 1, k + 4, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 5, j + 0, k + 1, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 5, j + 0, k + 2, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 5, j + 0, k + 3, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 5, j + 0, k + 4, ModBlocks.creationClay.blockID, 0, 2);
		world.setBlock(i + 5, j + 0, k + 5, ModBlocks.creationClay.blockID, 0, 2);
	}
}