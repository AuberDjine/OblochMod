package net.obloch.oblochmod;

import net.obloch.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OblochMod.MOD_ID)
public class OblochMod {
	public static final String MOD_ID = "oblochmod";

	public OblochMod() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModBlocks.register(modEventBus);
	}
}