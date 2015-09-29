package com.lessoner.treeores.IC2;

import com.lessoner.treeores.IC2.Blocks.TreeOresIC2Blocks;
import com.lessoner.treeores.IC2.Items.TreeOresIC2Items;
import com.lessoner.treeores.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresIC2 {

    public static void preInit(){
        TreeOresIC2Items.init();
        TreeOresIC2Blocks.init();
    }
    public static void init(){
        TreeOresIC2Blocks.registerBlocks();
        TreeOresIC2Items.registerItems();
        TreeOresIC2Recipes.addRecipes();
        OreDict();

    }

    private static void OreDict(){
        OreDictionary.registerOre(References.oreDictIC2Leaves, TreeOresIC2Blocks.TreeOresIC2Leaves);
        OreDictionary.registerOre(References.oreDictIC2Leaves, TreeOresIC2Blocks.TreeOresIC2BossLeaves);
        OreDictionary.registerOre(References.oreDictIC2Logs, TreeOresIC2Blocks.TreeOresIC2Logs);
        OreDictionary.registerOre(References.oreDictIC2Saplings, TreeOresIC2Blocks.TreeOresIC2Saplings);
        OreDictionary.registerOre(References.oreDictIC2Saplings, TreeOresIC2Blocks.TreeOresIC2BossSaplings);
    }
}
