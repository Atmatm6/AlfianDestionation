package ca.Atmatm6.AlfheimExp.misc;


import ca.Atmatm6.AlfheimExp.block.LivingWoodButton;
import ca.Atmatm6.AlfheimExp.block.LivingWoodChest;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InitBlock {
    public static Block LivingWoodButton = new LivingWoodButton(true).setBlockName("").setCreativeTab(AlfheimCreativeTab.INSTANCE);
    public static Block LivingWoodChest = new LivingWoodChest(Material.wood).setBlockName("livingWoodChest").setCreativeTab(AlfheimCreativeTab.INSTANCE);
    public static void preInitBlock(){
        GameRegistry.registerBlock(LivingWoodButton, "livingButton");
    }
}
