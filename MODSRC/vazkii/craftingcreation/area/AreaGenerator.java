package vazkii.craftingcreation.area;

import net.minecraft.util.WeightedRandomItem;
import net.minecraft.world.World;

public abstract class AreaGenerator extends WeightedRandomItem {
	
	public AreaGenerator(int par1) {
		super(par1);
	}
	
	public static int currentClayLevel = 0;

	static final int j = 7;

	public abstract void generate(World world, int i, int j);
}
