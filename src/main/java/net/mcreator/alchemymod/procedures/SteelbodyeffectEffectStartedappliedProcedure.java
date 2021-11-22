package net.mcreator.alchemymod.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.alchemymod.potion.SteelbodyeffectPotionEffect;
import net.mcreator.alchemymod.AlchemyModMod;

import java.util.Map;
import java.util.Collection;

public class SteelbodyeffectEffectStartedappliedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AlchemyModMod.LOGGER.warn("Failed to load dependency entity for procedure SteelbodyeffectEffectStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						(("attribute @s minecraft:generic.max_health modifier add eeef5eea-ac36-4275-aa6b-a9c0d8b1a5a6 alchemymod.steelbody ") + ""
								+ (((new Object() {
									int check(Entity _entity) {
										if (_entity instanceof LivingEntity) {
											Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
											for (EffectInstance effect : effects) {
												if (effect.getPotion() == SteelbodyeffectPotionEffect.potion)
													return effect.getAmplifier();
											}
										}
										return 0;
									}
								}.check(entity)) + 4)) + "" + (" add")));
			}
		}
	}
}
