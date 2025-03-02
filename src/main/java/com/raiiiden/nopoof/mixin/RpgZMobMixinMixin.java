package com.raiiiden.nopoof.mixin;

import me.fallenbreath.conditionalmixin.api.annotation.Condition;
import me.fallenbreath.conditionalmixin.api.annotation.Restriction;
import net.minecraft.world.entity.Mob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Restriction(require = @Condition("rpgz"))
@Mixin(value = Mob.class, priority = 1001)
public class RpgZMobMixinMixin {
    @Inject(
            method = "despawnParticlesServer",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    private void cancelPoofParticles(CallbackInfo ci) {
        ci.cancel();
    }
}
