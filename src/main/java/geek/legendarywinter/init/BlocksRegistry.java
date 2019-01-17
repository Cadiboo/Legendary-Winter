package geek.legendarywinter.init;

import geek.legendarywinter.LegendaryWinter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(LegendaryWinter.MODID)
public class BlocksRegistry {

	private BlocksRegistry() {
		//
	}

	@ObjectHolder("legendarywinter:strange_snow")
	public static final Block StrangeSnow = null;

	@ObjectHolder("legendarywinter:polarium_ore")
	public static final Block Polarium_Ore = null;

	@ObjectHolder("legendarywinter:winterstone")
	public static final Block WinterStone = null;

	@ObjectHolder("legendarywinter:winterfurnace")
	public static final Block SnowFurnace = null;

	@ObjectHolder("legendarywinter:lit_winterfurnace")
	public static final Block Lit_SnowFurnace = null;

	@ObjectHolder("legendarywinter:fluidsnow")
	public static final Block FluidSnow = null;

	@ObjectHolder("legendarywinter:winterstone_slab")
	public static final BlockSlab WINTERSTONE_SLAB_HALF = null;

	@ObjectHolder("legendarywinter:winterstone_double_slab")
	public static final BlockSlab WINTERSTONE_SLAB_DOUBLE = null;

	@ObjectHolder("legendarywinter:winterstone_stairs")
	public static final Block WinterstoneStairs = null;

	@ObjectHolder("legendarywinter:winterstone_wall")
	public static final Block WinterstoneWall = null;

	public static final Block POLARIUM_BLOCK = null;

	public static final BlockFluidBase FLUID_SNOW = null;

}
