package games.enchanted.byg;

import games.enchanted.VerticalSlabsBYG;
import games.enchanted.byg.registry.types.VerticalSlabItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Items {

    // betterend wood slabs
    public static final BlockItem VERTICAL_DACITE_SLAB = registerBlockItem(Blocks.VERTICAL_DACITE_SLAB ,"dacite_slab");
    public static final BlockItem VERTICAL_DACITE_BRICK_SLAB = registerBlockItem(Blocks.VERTICAL_DACITE_BRICK_SLAB ,"dacite_brick_slab");
    public static final BlockItem VERTICAL_DACITE_COBBLESTONE_SLAB = registerBlockItem(Blocks.VERTICAL_DACITE_COBBLESTONE_SLAB ,"dacite_cobblestone_slab");
    public static final BlockItem VERTICAL_DACITE_TILE_SLAB = registerBlockItem(Blocks.VERTICAL_DACITE_TILE_SLAB ,"dacite_tile_slab");

    public static BlockItem registerBlockItem(Block blockId ,String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        Item.Settings settings = new Item.Settings().group(ItemGroup.BUILDING_BLOCKS);
        return Registry.register(Registry.ITEM, new Identifier(VerticalSlabsBYG.MOD_ID, id), new VerticalSlabItem(blockId, settings));
    }


    public static void registerItems() {
    }

}
