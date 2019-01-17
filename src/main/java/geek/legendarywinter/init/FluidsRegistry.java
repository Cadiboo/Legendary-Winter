package geek.legendarywinter.init;

import geek.legendarywinter.fluids.FluidFluidSnow;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import javax.annotation.Nonnull;

public class FluidsRegistry {

	public static Fluid FLUID_SNOW = null;

	public static void init() {
		FLUID_SNOW = new FluidFluidSnow();
	}

}
