package io.github.zygzaggaming.modid.common.events;

import io.github.zygzaggaming.modid.common.Main;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.GAME)
public class GameBusEvents {
    @SubscribeEvent
    public static void preServerTick(final ServerTickEvent.Pre event) { }
}