package net.mcreator.alchemymod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.alchemymod.AlchemyModMod;

import java.util.Map;

public class SteelbodyeffectEffectExpiresProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AlchemyModMod.LOGGER.warn("Failed to load dependency entity for procedure SteelbodyeffectEffectExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"attribute @s minecraft:generic.max_health modifier remove eeef5eea-ac36-4275-aa6b-a9c0d8b1a5a6");
			}
		}
	}
}
