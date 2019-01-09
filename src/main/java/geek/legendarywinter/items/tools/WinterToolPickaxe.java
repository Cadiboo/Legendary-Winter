package geek.legendarywinter.items.tools;

import geek.legendarywinter.init.ItemsRegistery;
import geek.legendarywinter.util.GeekTab;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.RecipeRepairItem;

public class WinterToolPickaxe extends ItemPickaxe {

	public WinterToolPickaxe() {
		super(ToolMaterial.DIAMOND);
		this.setHarvestLevel("pickaxe", 3);
		this.setDamage(new ItemStack(this), 8);
		this.setCreativeTab(GeekTab.instance);
		this.toolMaterial.setRepairItem(new ItemStack(ItemsRegistery.polarium_ingot));
	}

}
