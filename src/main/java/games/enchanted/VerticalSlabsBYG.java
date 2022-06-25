package games.enchanted;

import net.fabricmc.api.ModInitializer;
import net.minecraft.MinecraftVersion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import games.enchanted.byg.Addon;

public class VerticalSlabsBYG implements ModInitializer{

    // mod id
    public static final String MOD_ID = "evs-byg";
    public static final String loggerID = "[" + MOD_ID + "] ";

    // prefix for block and item ids
    public static final String item_prefix = "vertical_";
    // mod name
    public static final String modName = "Enchanted Vertical Slabs - Biomes You'll Go Edition";

    public static String minecraftCurrentVersion = MinecraftVersion.CURRENT.getReleaseTarget();
    // logger
    public static final Logger LOGGER = LogManager.getLogger(modName);

    @Override
    public void onInitialize() {
        LOGGER.info(loggerID + "Detected Minecraft " + minecraftCurrentVersion + " (release target)");
        LOGGER.info(loggerID + "Starting to load mod...");

        // looads the addon class
        Addon.build();

        // logs to console that the mod is ready
        LOGGER.info(loggerID + modName + " initialized!");
    }

}