package com.glyceryl6.slowless.mixin;

import com.glyceryl6.slowless.config.Config;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LocalPlayer.class)
public class MixinLocalPlayer {

    @ModifyArg(method = "aiStep", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/player/Input;tick(Z)V"))
    public boolean aiStep(boolean isMovingSlowly) {
        return Config.SNEAKING_RETARD.get();
    }

    @Redirect(method = "aiStep", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/player/LocalPlayer;isUsingItem()Z", ordinal = 0))
    public boolean aiStep(LocalPlayer localPlayer) {
        return Config.USING_ITEM_RETARD.get();
    }

}