package com.lessoner.treeores.Thaumcraft;

import com.lessoner.treeores.Thaumcraft.Blocks.TreeOresTHCBlocks;
import com.lessoner.treeores.Thaumcraft.Items.TreeOresTHCItems;

/**
 * Created by Anguarmas on 9/30/2015.
 */
public class TreeOresThaumcraft {

    public static void preInit() {
        TreeOresTHCBlocks.init();
        TreeOresTHCItems.init();
    }

    public static void init() {
        TreeOresTHCBlocks.registerBlocks();
        TreeOresTHCItems.registerItems();
    }

    private static void oreDict() {

    }


}
