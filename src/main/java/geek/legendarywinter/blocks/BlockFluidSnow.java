package geek.legendarywinter.blocks;

import geek.legendarywinter.util.GeekTab;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * @author Cadiboo
 */
public class BlockFluidSnow extends BlockFluidClassic {

	public BlockFluidSnow(Fluid fluidSnow) {
		super(fluidSnow, Material.WATER);
		this.setCreativeTab(GeekTab.instance);
	}

	@Override
	public MapColor getMapColor(final IBlockState state, final IBlockAccess worldIn, final BlockPos pos) {
		return MapColor.SNOW;
	}

}
