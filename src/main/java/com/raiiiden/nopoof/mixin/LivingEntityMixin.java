package com.raiiiden.nopoof.mixin;

import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(method = "makePoofParticles", at = @At("HEAD"), cancellable = true)
    private void cancelPoofParticles(CallbackInfo ci) {
        ci.cancel(); // Prevents poof particles from spawning
    }
}
