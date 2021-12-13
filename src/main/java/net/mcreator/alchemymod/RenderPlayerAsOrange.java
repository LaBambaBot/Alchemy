package net.mcreator.alchemymod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@Mod.EventBusSubscriber(modid = "alchemy_mod", bus = Bus.FORGE, value = Dist.CLIENT)
public class RenderPlayerAsOrange {
	@SubscribeEvent
	public static void renderPlayer(final RenderPlayerEvent.Pre event){
		event.setCanceled(true);
	} 
}
