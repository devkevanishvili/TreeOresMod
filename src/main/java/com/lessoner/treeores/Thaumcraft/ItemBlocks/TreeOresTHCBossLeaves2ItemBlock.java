package com.lessoner.treeores.Thaumcraft.ItemBlocks;

import com.lessoner.treeores.Thaumcraft.Blocks.TreeOresTHCLogs2;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresTHCBossLeaves2ItemBlock extends ItemBlock {
    public TreeOresTHCBossLeaves2ItemBlock(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresTHCLogs2.types.length)) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + TreeOresTHCLogs2.types[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}
