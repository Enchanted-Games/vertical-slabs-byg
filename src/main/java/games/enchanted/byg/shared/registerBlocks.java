package games.enchanted.byg.shared;

import games.enchanted.VerticalSlabsBYG;
import games.enchanted.byg.registry.types.CombinableVerticalSlabBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class registerBlocks {
    // slab types
    public static Block registerVerticalWoodSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.WOOD).strength(2f, 6f).sounds(BlockSoundGroup.WOOD);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOD_PLACE));
    }
    public static Block registerVerticalNetherWoodSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.NETHER_WOOD).strength(2f, 6f).sounds(BlockSoundGroup.WOOD);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOD_PLACE));
    }
    public static Block registerVerticalStoneSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_STONE_PLACE));
    }
    public static Block registerVerticalNetherBrickSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.NETHER_BRICKS);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_NETHER_BRICKS_PLACE));
    }
    public static Block registerVerticalDeepslateSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(3.5f, 6f).sounds(BlockSoundGroup.DEEPSLATE);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_DEEPSLATE_PLACE));
    }
    public static Block registerVerticalDeepslateBrickSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(3.5f, 6f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_DEEPSLATE_BRICKS_PLACE));
    }
    public static Block registerVerticalDeepslateTileSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(3.5f, 6f).sounds(BlockSoundGroup.DEEPSLATE_TILES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_DEEPSLATE_TILES_PLACE));
    }
    public static Block registerVerticalBlackstoneSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_STONE_PLACE));
    }
    public static Block registerVerticalCopperSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.METAL).strength(3f, 6f).sounds(BlockSoundGroup.COPPER);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_COPPER_PLACE));
    }
    public static Block registerVerticalWoolSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.WOOL).strength(2f, 6f).sounds(BlockSoundGroup.WOOL);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOL_PLACE));
    }
    public static Block registerVerticalGlowingWoolSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.WOOL).strength(0.5f, 3f).sounds(BlockSoundGroup.WOOL).luminance(15);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOL_PLACE));
    }
    public static Block registerVerticalAmethystSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.AMETHYST).strength(2f, 6f).sounds(BlockSoundGroup.AMETHYST_BLOCK);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_AMETHYST_BLOCK_PLACE));
    }
    public static Block registerVerticalGlowingAmethystSlab(String id) {
        id = VerticalSlabsBYG.item_prefix + id;
        final Settings settings = FabricBlockSettings.of(Material.AMETHYST).strength(2f, 6f).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(15);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabsBYG.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_AMETHYST_BLOCK_PLACE));
    }

}
