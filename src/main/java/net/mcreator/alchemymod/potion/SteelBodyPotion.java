
package net.mcreator.alchemymod.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SteelBodyPotion {
	@ObjectHolder("alchemy_mod:steel_body")
	public static final Potion potionType = null;
	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.SLOWNESS, 100, 2, false, true), new EffectInstance(Effects.RESISTANCE, 200, 10, false, true),
					new EffectInstance(SteelbodyeffectPotionEffect.potion, 3600, 1, false, true));
			setRegistryName("steel_body");
		}
	}
}
