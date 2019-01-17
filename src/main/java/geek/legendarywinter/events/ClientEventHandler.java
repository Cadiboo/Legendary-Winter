package geek.legendarywinter.events;

import geek.legendarywinter.client.model.MeshDefinitionLambdaFix;
import geek.legendarywinter.init.BlocksRegistry;
import geek.legendarywinter.init.ItemsRegistery;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import javax.annotation.Nonnull;

import static geek.legendarywinter.LegendaryWinter.MODID;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = MODID)
public final class ClientEventHandler {

	/**
	 *
	 */
	private ClientEventHandler() {
		//
	}

	/**
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void registerModels(final ModelRegistryEvent event) {
		registerModel(Item.getItemFromBlock(BlocksRegistry.StrangeSnow));
		registerModel(Item.getItemFromBlock(BlocksRegistry.WinterStone));
		registerModel(Item.getItemFromBlock(BlocksRegistry.Polarium_Ore));
		registerModel(Item.getItemFromBlock(BlocksRegistry.SnowFurnace));
		//registerFluidRender(BlocksRegistry.FluidSnow, FluidsRegistry.FluidSnow);
		registerModel(Item.getItemFromBlock(BlocksRegistry.WINTERSTONE_SLAB_HALF));
		registerModel(Item.getItemFromBlock(BlocksRegistry.WinterstoneStairs));
		registerModel(Item.getItemFromBlock(BlocksRegistry.WinterstoneWall));
		registerModel(Item.getItemFromBlock(BlocksRegistry.POLARIUM_BLOCK));
		registerModel(ItemsRegistery.strangesnowball);
		registerModel(ItemsRegistery.polarium_ingot);
		registerModel(ItemsRegistery.POLARIUM_NUGGET);
		registerModel(ItemsRegistery.polarium_axe);
		registerModel(ItemsRegistery.polarium_pickaxe);
		registerModel(ItemsRegistery.polarium_shovel);
		registerModel(ItemsRegistery.polarium_sword);
		registerModel(ItemsRegistery.POLARIUM_HOE);
		registerModel(ItemsRegistery.winterjam);
		registerModel(ItemsRegistery.polarium_booties);
		registerModel(ItemsRegistery.polarium_chestplate);
		registerModel(ItemsRegistery.polarium_helmet);
		registerModel(ItemsRegistery.polarium_leggings);
		registerModel(ItemsRegistery.POLARIUM_HORSE_ARMOR);

		registerFluidModel(BlocksRegistry.FLUID_SNOW);

	}

	/**
	 * @param item The Item.
	 */
	private static void registerModel(final Item item) {
		ModelLoader.setCustomModelResourceLocation(item,
				0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	//copied from Choonster's testmod3
	private static void registerFluidModel(BlockFluidBase fluidBlock) {
		final Item item = Item.getItemFromBlock(fluidBlock);
		assert item != null;

		ModelBakery.registerItemVariants(item);

		final ModelResourceLocation modelResourceLocation = new ModelResourceLocation(fluidBlock.getRegistryName(), "normal");

		ModelLoader.setCustomMeshDefinition(item, MeshDefinitionLambdaFix.create(stack -> modelResourceLocation));

		ModelLoader.setCustomStateMapper((Block) fluidBlock, new StateMapperBase() {
			@Override
			@Nonnull
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return modelResourceLocation;
			}
		});
	}

}
