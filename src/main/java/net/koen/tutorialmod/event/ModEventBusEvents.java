package net.koen.tutorialmod.event;

import net.koen.tutorialmod.TutorialMod;
import net.koen.tutorialmod.entity.ModEntities;
import net.koen.tutorialmod.entity.client.ModModelLayers;
import net.koen.tutorialmod.entity.client.RhinoModel;
import net.koen.tutorialmod.entity.custom.RhinoEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributed(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
    }
}
