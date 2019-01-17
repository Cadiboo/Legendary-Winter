package geek.legendarywinter.util;

import geek.legendarywinter.init.FluidsRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fml.common.registry.GameRegistry.ItemStackHolder;

import javax.annotation.Nonnull;

import static geek.legendarywinter.LegendaryWinter.MODID;

public class GeekTab extends CreativeTabs {

	@ItemStackHolder(MODID + ":polarium_ingot")
	public static final ItemStack ICON_STACK = null;

	public static GeekTab instance = null;

	public GeekTab() {
		super(MODID);
	}

	public static void init() {
		instance = new GeekTab();
	}

	@Override
	@Nonnull
	public ItemStack createIcon() {
		return ICON_STACK;
	}

	@Override
	public void displayAllRelevantItems(@Nonnull final NonNullList<ItemStack> stacks) {
		super.displayAllRelevantItems(stacks);
		stacks.add(FluidUtil.getFilledBucket(new FluidStack(FluidsRegistry.FLUID_SNOW, Fluid.BUCKET_VOLUME)));
	}

}
