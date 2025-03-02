package com.raiiiden.nopoof;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NoPoof.MODID)
public class NoPoof {
  public static final String MODID = "nopoof";

  public NoPoof() {
    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

  }
  private void clientSetup(FMLClientSetupEvent event) {
  }
}