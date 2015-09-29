package com.lessoner.treeores.TConstruct.Items;

import com.lessoner.treeores.TreeOresMod;
import net.minecraft.item.Item;

/**
 * Created by Anguarmas on 9/29/2015.
 */
public class TreeOresTCItems {

    public static Item TreeOresTCChops;
    public static Item TreeOresTCSpawners;

    public static void init(){
        TreeOresTCChops = new TreeOresTCChops().setUnlocalizedName("ttcchops").setTextureName("ttcchops").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTCSpawners = new TreeOresTCSpawners().setUnlocalizedName("btcspawners").setTextureName("btcspawners").setCreativeTab(TreeOresMod.treeOresTab);
    }

    public static void registerItems(){

    }
}
