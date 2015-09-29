package com.lessoner.treeores.IC2;

import com.lessoner.treeores.Blocks.TreeOresBlocks;
import com.lessoner.treeores.IC2.Blocks.TreeOresIC2Blocks;
import com.lessoner.treeores.IC2.Items.TreeOresIC2Items;
import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresIC2Recipes {

    public static void addRecipes() {
        addTreeOresIC2LogRecipes();
        addTreeOresIC2SaplingRecipes();
        addTreeOresIC2ChopsRecipes();
        addTreeOresIC2SpawnerRecipes();
    }

    private static void addTreeOresIC2LogRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","copperIngot"), 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","copperIngot"), 2), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","copperIngot"), 3), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","copperIngot"), 4), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","copperIngot"), 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","copperIngot"), 6), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","copperIngot"), 7), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","copperIngot"), 8), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","tinIngot"), 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","tinIngot"), 2), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","tinIngot"), 3), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","tinIngot"), 4), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","tinIngot"), 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","tinIngot"), 6), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","tinIngot"), 7), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","tinIngot"), 8), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","uraniumIngot"), 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","uraniumIngot"), 2), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","uraniumIngot"), 3), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","uraniumIngot"), 4), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","uraniumIngot"), 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","uraniumIngot"), 6), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","uraniumIngot"), 7), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","uraniumIngot"), 8), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","leadIngot"), 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","leadIngot"), 2), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","leadIngot"), 3), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","leadIngot"), 4), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","leadIngot"), 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","leadIngot"), 6), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","leadIngot"), 7), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2","leadIngot"), 8), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
    }

    private static void addTreeOresIC2ChopsRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Items.TreeOresIC2Chops, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Items.TreeOresIC2Chops, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Items.TreeOresIC2Chops, 1, 2)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Items.TreeOresIC2Chops, 1, 3)});
    }

    private static void addTreeOresIC2SaplingRecipes() {
        if (References.copperTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Saplings, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("IC2", "copperBlock")), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.tinTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Saplings, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("IC2", "tinBlock")), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.uraniumTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Saplings, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("IC2", "uraniumBlock")), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.leadTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Saplings, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("IC2", "leadBlock")), Character.valueOf('S'), "treeSapling"}));
        }
    }

    private static void addTreeOresIC2SpawnerRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Items.TreeOresIC2BossSpawners, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Items.TreeOresIC2BossSpawners, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Items.TreeOresIC2BossSpawners, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Items.TreeOresIC2BossSpawners, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});
    }
}
