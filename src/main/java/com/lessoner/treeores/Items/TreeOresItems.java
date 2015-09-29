package com.lessoner.treeores.Items;

import com.lessoner.treeores.TreeOresMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Anguarmas on 9/22/2015.
 */
public class TreeOresItems {

    public static Item TreeOresChops1;
    public static Item TreeOresChops2;
    public static Item TreeOresChops3;
    public static Item TreeOresBossSpawners1;
    public static Item TreeOresBossSpawners2;
    public static Item TreeOresBossSpawners3;
    public static Item TreeOresTransformers;
    public static Item TreeOresSpawnerParts;

    public static void init() {

        TreeOresChops1 = new TreeOresChops1().setTextureName("tchops1").setUnlocalizedName("tchops1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresChops2 = new TreeOresChops2().setTextureName("tchops2").setUnlocalizedName("tchops2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresChops3 = new TreeOresChops3().setTextureName("tchops3").setUnlocalizedName("tchops3").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresBossSpawners1 = new TreeOresBossSpawners1().setTextureName("bspawner1").setUnlocalizedName("bspawner1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresBossSpawners2 = new TreeOresBossSpawners2().setTextureName("bspawner2").setUnlocalizedName("bspawner2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresBossSpawners3 = new TreeOresBossSpawners3().setTextureName("bspawner3").setUnlocalizedName("bspawner3").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresTransformers = new TreeOresTransformers().setTextureName("transformers").setUnlocalizedName("transformers").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresSpawnerParts = new TreeOresSpawnerParts().setTextureName("bparts").setUnlocalizedName("bparts").setCreativeTab(TreeOresMod.treeOresTab);


    }

    public static void registerItems() {
        GameRegistry.registerItem(TreeOresChops1, TreeOresChops1.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresChops2, TreeOresChops2.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresChops3, TreeOresChops3.getUnlocalizedName());

        GameRegistry.registerItem(TreeOresBossSpawners1, TreeOresBossSpawners1.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresBossSpawners2, TreeOresBossSpawners2.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresBossSpawners3, TreeOresBossSpawners3.getUnlocalizedName());

        GameRegistry.registerItem(TreeOresTransformers, TreeOresTransformers.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresSpawnerParts, TreeOresSpawnerParts.getUnlocalizedName());

    }
}
