package net.koen.tutorialmod.item;

import net.koen.tutorialmod.TutorialMod;
import net.koen.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                            pOutput.accept(ModItems.SAPPHIRE.get());
                            pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                            pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                            pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                            pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                            pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                            pOutput.accept(ModItems.METAL_DETECTOR.get());
                            pOutput.accept(ModItems.STRAWBERRY.get());
                            pOutput.accept(ModItems.PINE_CONE.get());
                            pOutput.accept(ModItems.SAPPHIRE_STAFF.get());
                            pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                            pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());

                            pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                            pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                            pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                            pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                            pOutput.accept(ModItems.SAPPHIRE_HOE.get());

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
