package geek.legendarywinter.fluids;

import geek.legendarywinter.LegendaryWinter;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import javax.annotation.Nullable;

import static geek.legendarywinter.LegendaryWinter.MODID;

/**
 * @author Cadiboo
 */
public class FluidFluidSnow extends Fluid {

	public FluidFluidSnow() {
		super(
				new ResourceLocation(LegendaryWinter.MODID, "fluid_snow").toString(),
				new ResourceLocation(LegendaryWinter.MODID, "blocks/fluid_snow_still"),
				new ResourceLocation(LegendaryWinter.MODID, "blocks/fluid_snow_flow"),
				new ResourceLocation(LegendaryWinter.MODID, "blocks/fluid_snow_overlay")
		);
		this.setDensity(1);
		this.setViscosity(1);
		this.setGaseous(false);
		this.setTemperature(0);
		this.setLuminosity(200);
		this.setUnlocalizedName(MODID + "." + "fluid_snow");
	}

}
