package com.raiiiden.nopoof.mixin;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientLevel.class)
public class ClientLevelMixin {

    @Inject(method = "addParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)V",
            at = @At("HEAD"), cancellable = true, remap = false)
    private void removePoofParticles(ParticleOptions particle, double x, double y, double z,
                                     double dx, double dy, double dz, CallbackInfo ci) {
        if (particle == ParticleTypes.POOF) {
            ci.cancel(); // Cancels poof particle rendering
        }
    }
}
