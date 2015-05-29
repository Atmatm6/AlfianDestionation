package ca.Atmatm6.AlfheimExp.misc;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class AlfheimCreativeTab extends CreativeTabs{
    public static AlfheimCreativeTab INSTANCE = new AlfheimCreativeTab();
    List list;

    public AlfheimCreativeTab() {
        super("Alfheim Expansion");
        this.setNoTitle();
        this.setBackgroundImageName("botania.png");
    }

    public ItemStack getIconItemStack() {
        return new ItemStack(InitBlock.LivingWoodChest);
    }

    public Item getTabIconItem() {
        return this.getIconItemStack().getItem();
    }

    public boolean hasSearchBar() {
        return true;
    }

    public void displayAllReleventItems(List list) {
        this.list = list;
        this.addBlock(InitBlock.LivingWoodButton);
        this.addBlock(InitBlock.LivingWoodChest);
    }

    private void addItem(Item item) {
        item.getSubItems(item, this, this.list);
    }

    private void addBlock(Block block) {
        ItemStack stack = new ItemStack(block);
        block.getSubBlocks(stack.getItem(), this, this.list);
    }
}
