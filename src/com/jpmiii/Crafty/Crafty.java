package com.jpmiii.Crafty;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Crafty extends JavaPlugin {

	public void onEnable() {
		getServer().getLogger().info("Crafty enabled");
		final ShapedRecipe r = new ShapedRecipe(new ItemStack(
				Material.CHAINMAIL_HELMET, 1));

		r.shape("###", "eee", "###");
		r.setIngredient('#', Material.COBBLESTONE);
		//r.setIngredient('%', Material.AIR);
		r.setIngredient('e', Material.IRON_INGOT);
		getServer().addRecipe(r);

	}

	public void onDisable() {
		getServer().getLogger().info("Crafty disabled");
	}

}
