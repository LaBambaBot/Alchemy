package net.mcreator.alchemymod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.alchemymod.AlchemyModMod;

import java.util.Map;

public class FireBreathEffectExpiresProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				AlchemyModMod.LOGGER.warn("Failed to load dependency itemstack for procedure FireBreathEffectExpires!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstack));
			if (_enchantments.containsKey(Enchantments.FIRE_ASPECT)) {
				_enchantments.remove(Enchantments.FIRE_ASPECT);
				EnchantmentHelper.setEnchantments(_enchantments, (itemstack));
			}
		}
	}
}
