package io.github.zygzaggaming.modid.common.config;

import io.github.zygzaggaming.modid.common.Main;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.ConfigValue<String> LOGGED_MESSAGE = BUILDER
            .comment("What you want in the logs")
            .define("loggedMessage", "fortnite battle pass");

    public static final ModConfigSpec SPEC = BUILDER.build();

    public static String loggedMessage;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        loggedMessage = LOGGED_MESSAGE.get();
    }
}
