package games.enchanted.byg;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import games.enchanted.VerticalSlabsBYG;
import games.enchanted.byg.registry.ModFlammableBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Addon {
    public static final Logger LOGGER = LogManager.getLogger(VerticalSlabsBYG.modName);

    public static void build() {
        
        // registers slabs and their items
        Blocks.registerBlocks();
        Items.registerItems();

        // registers flammable blocks
        ModFlammableBlocks.registerFlammables();

        // Created item group for betterend stuff
        @SuppressWarnings("unused")
            final ItemGroup VERTICAL_SLABS_BETTEREND_GROUP = FabricItemGroupBuilder.create(
            new Identifier(VerticalSlabsBYG.MOD_ID, "vertical_byg_slabs"))
            // group icon
            .icon(() -> new ItemStack(Blocks.VERTICAL_DACITE_SLAB))
            // items in the group
            .appendItems(stacks -> {

                stacks.add(new ItemStack(Blocks.VERTICAL_DACITE_SLAB));
                stacks.add(new ItemStack(Blocks.VERTICAL_DACITE_BRICK_SLAB));
                stacks.add(new ItemStack(Blocks.VERTICAL_DACITE_COBBLESTONE_SLAB));
                stacks.add(new ItemStack(Blocks.VERTICAL_DACITE_TILE_SLAB));

            }
        ).build();

    }
}
