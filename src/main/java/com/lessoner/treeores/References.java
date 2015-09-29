package com.lessoner.treeores;

import cpw.mods.fml.common.Mod;

/**
 * Created by Anguarmas on 9/22/2015.
 */
public class References {

    public static final String MODID = "treeores";
    public static final String VERSION = "1.0"; //TODO: Change every update
    public static final String NAME = "TreeOres Mod";
    public static final String CLIENTSIDEPROXY = "com.lessoner.treeores.Proxy.ClientProxy";
    public static final String SERVERSIDEPROXY = "com.lessoner.treeores.Proxy.CommonProxy";
    @Mod.Instance("treeores")
    public static TreeOresMod instance;
    public static boolean ironTree;
    public static boolean goldTree;
    public static boolean coalTree;
    public static boolean redstoneTree;
    public static boolean diamondTree;
    public static boolean emeraldTree;
    public static boolean lapisTree;
    public static boolean obsidianTree;
    public static boolean quartzTree;
    public static boolean glowstoneTree;
    public static boolean xpTree;

    public static boolean canFertilize;

    public static boolean enableChops;

    public static String oreDictLeaves;
    public static String oreDictLogs;
    public static String oreDictSaplings;

    public static String ironBossTexture = "treeores:textures/model/ironboss.png";
    public static String goldBossTexture = "treeores:textures/model/goldboss.png";
    public static String coalBossTexture = "treeores:textures/model/coalboss.png";
    public static String redstoneBossTexture = "treeores:textures/model/redstoneboss.png";
    public static String emeraldBossTexture = "treeores:textures/model/emeraldboss.png";
    public static String diamondBossTexture = "treeores:textures/model/diamondboss.png";
    public static String lapisBossTexture = "treeores:textures/model/lapisboss.png";
    public static String obsidianBossTexture = "treeores:textures/model/obsidianboss.png";
    public static String quartzBossTexture = "treeores:textures/model/quartzboss.png";
    public static String glowstoneBossTexture = "treeores:textures/model/glowstoneboss.png";
    public static String xpBossTexture = "treeores:textures/model/xpboss.png";
    //IC2
    public static String copperBossTexture = "treeores:textures/model/ic2/obsidianboss.png";
    public static String tinBossTexture = "treeores:textures/model/ic2/quartzboss.png";
    public static String uraniumBossTexture = "treeores:textures/model/ic2/glowstoneboss.png";
    public static String leadBossTexture = "treeores:textures/model/ic2/xpboss.png";

    public static String oreDictIC2Leaves;
    public static String oreDictIC2Logs;
    public static String oreDictIC2Saplings;

    public static boolean copperTree;
    public static boolean tinTree;
    public static boolean uraniumTree;
    public static boolean leadTree;
}
