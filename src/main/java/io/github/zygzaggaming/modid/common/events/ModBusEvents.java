package io.github.zygzaggaming.modid.common.events;

import io.github.zygzaggaming.modid.common.Main;
import io.github.zygzaggaming.modid.common.config.Config;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModBusEvents {
    @SubscribeEvent
    public static void commonSetup(final FMLCommonSetupEvent event) {
        Main.log(Config.loggedMessage);
    }
}