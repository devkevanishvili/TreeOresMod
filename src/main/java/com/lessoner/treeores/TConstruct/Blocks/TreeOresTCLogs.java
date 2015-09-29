package com.lessoner.treeores.TConstruct.Blocks;

import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.References;
import com.lessoner.treeores.TConstruct.Items.TreeOresTCItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockOldLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;
import java.util.Random;

/**
 * Created by Anguarmas on 9/29/2015.
 */
public class TreeOresTCLogs extends BlockOldLog {
    public static final String[] types = new String[]{"ardite", "cobalt"};

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
    }

    public int quantityDropped(Random random) {
        if (References.enableChops) {
            return 2 + random.nextInt(2);
        } else {
            return 1;
        }
    }

    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (References.enableChops) {
            return quantityDropped(random) + random.nextInt(fortune + 1);
        }
        return quantityDropped(random);
    }

    public Item getItemDropped(int i, Random random, int k) {
        if (References.enableChops) {
            return TreeOresTCItems.TreeOresTCChops;
        } else {
            return Item.getItemFromBlock(this);
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.field_150167_a = new IIcon[types.length];
        this.field_150166_b = new IIcon[types.length];

        for (int i = 0; i < this.field_150167_a.length; ++i) {
            this.field_150167_a[i] = iconRegister.registerIcon(References.MODID + ":" + this.getTextureName() + "_" + types[i]);
            this.field_150166_b[i] = iconRegister.registerIcon(References.MODID + ":" + this.getTextureName() + "_" + types[i] + "_top");
        }
    }
}

