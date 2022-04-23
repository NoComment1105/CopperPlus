package io.github.nocomment1105.copperplus.registry;

import io.github.nocomment1105.copperplus.CopperPlus;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class CopperPlusRegistry {

	/*
	Blocks
	 */

	/*
	Block Entities
	 */

	/*
	Items
	 */
	public static final Item COPPER_NUGGET = register("copper_nugget", new Item(
			new QuiltItemSettings().group(ItemGroup.MATERIALS)
			)
	);

	/**
	 * Create a Block and register it
	 * @param id The custom Block ID
	 * @param block The Block you're registering
	 * @return The created and registered Block
	 */
	private static Block register(String id, Block block) {
		return Registry.register(Registry.BLOCK, CopperPlus.id(id), block);
	}

	/**
	 * Create a BlockItem to assign to a block
	 * @param id The custom BlockItem ID
	 * @param blockItem The BlockItem you're registering
	 * @return The created and registered BlockItem
	 */
	private static BlockItem register(String id, BlockItem blockItem) {
		return Registry.register(Registry.ITEM, CopperPlus.id(id), blockItem);
	}

	/**
	 * Create an Item and register it
	 * @param id The custom Item ID
	 * @param item The Item you're registering
	 * @return The created and registered Item
	 */
	private static Item register(String id, Item item) {
		return Registry.register(Registry.ITEM, CopperPlus.id(id), item);
	}

	/**
	 * Create a BlockEntity and register it
	 * @param id The custom BlockEntity ID
	 * @param factory The BlockEntity class of the Block you want to make a BlockEntity for
	 * @param block The Block to create an entity for
	 * @return The created BlockEntity
	 */

	private static <T extends BlockEntity> BlockEntityType<T> register(String id, FabricBlockEntityTypeBuilder.Factory<T> factory, Block... block) {
		return Registry.register(Registry.BLOCK_ENTITY_TYPE, CopperPlus.id(id), FabricBlockEntityTypeBuilder.create(factory, block).build());
	}

	/**
	 * Initialize the registry
	 */
	public static void init() { }
}
