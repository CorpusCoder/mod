package CorpusCoder.sword.util;

import CorpusCoder.sword.sword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {

    public static Item setItemName(final Item item, final String name) {
        item.setRegistryName(sword.MODID, name).setUnlocalizedName(sword.MODID + "." + name);
        return item;
    }

    public static Block setBlockName(final Block block, final String name) {
        block.setRegistryName(sword.MODID, name).setUnlocalizedName(sword.MODID + "." + name);
        return block;
    }
}
