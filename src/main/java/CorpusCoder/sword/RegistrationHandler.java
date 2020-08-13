package CorpusCoder.sword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber(modid = sword.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new Item().setRegistryName(sword.MODID, "ceremonial_sword").setUnlocalizedName(sword.MODID + "." + "ceremonial_sword").setCreativeTab(CreativeTabs.COMBAT)
        };

        event.getRegistry().registerAll(items);

    }

}
