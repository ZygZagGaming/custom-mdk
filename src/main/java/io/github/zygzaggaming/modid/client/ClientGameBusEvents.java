package io.github.zygzaggaming.modid.client;

import io.github.zygzaggaming.modid.common.Main;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

@EventBusSubscriber(value = Dist.CLIENT, modid = Main.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ClientGameBusEvents {
    @SubscribeEvent
    public static void preClientTick(final ClientTickEvent.Pre event) { }
}