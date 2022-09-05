package com.glyceryl6.slowless;

import com.glyceryl6.slowless.config.Config;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(NoSlowDown.MOD_ID)
public class NoSlowDown {

    public static final String MOD_ID = "no_slow_down";

    public NoSlowDown() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        MinecraftForge.EVENT_BUS.register(this);
    }

}