package net.mcreator.alchemymod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.alchemymod.potion.OrangeeffectPotionEffect;

@Mod.EventBusSubscriber(modid = "alchemy_mod", value = Dist.CLIENT)
public class RenderPlayerAsOrange {
	@SubscribeEvent
	public static void renderPlayer(final RenderPlayerEvent.Pre event) {
		if (event.getEntityLiving().isPotionActive(OrangeeffectPotionEffect.potion)) {
			event.setCanceled(true);
			
		}
	}
}
