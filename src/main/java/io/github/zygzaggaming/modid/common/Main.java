package io.github.zygzaggaming.modid.common;

import io.github.zygzaggaming.modid.common.config.Config;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "modid";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Main(IEventBus bus, ModContainer container) {
        container.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    public static void log(String message) {
        LOGGER.debug(message);
    }

    public static void error(String message) {
        LOGGER.error(message);
    }

    public static void info(String message) {
        LOGGER.info(message);
    }
}
