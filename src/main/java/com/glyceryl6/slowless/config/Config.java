package com.glyceryl6.slowless.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> SNEAKING_RETARD;
    public static final ForgeConfigSpec.ConfigValue<Boolean> USING_ITEM_RETARD;

    static {
        BUILDER.push("Configs for control this mod");
        SNEAKING_RETARD = BUILDER.comment("Slow down when sneaking.|潜行时是否会被减速"
                        .split("\\|")).define("sneakingRetard", false);
        USING_ITEM_RETARD = BUILDER.comment("Slow down when using item.|使用物品时是否会被减速"
                        .split("\\|")).define("usingItemRetard", false);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}