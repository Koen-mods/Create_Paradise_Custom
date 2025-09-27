package net.koen.tutorialmod.entity.client;

import net.koen.tutorialmod.TutorialMod;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation RHINO_LAYER = new ModelLayerLocation(
            new ResourceLocation(TutorialMod.MOD_ID, "rhino_layer"), "main"
    );

}
