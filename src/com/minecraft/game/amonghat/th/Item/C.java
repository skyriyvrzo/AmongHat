package com.minecraft.game.amonghat.th.Item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class C {
	public static ItemStack aspectoftheend;

	public static void init() {
		CreateAspectoftheEnd();
	}

	private static void CreateAspectoftheEnd() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§9Aspect of the End");
		List<String> lore = new ArrayList<>();
		lore.add("§6Ability: Instant Transmission §e§lRIGHT CLICK");
		lore.add("§7Teleport §a8 blocks §7ahead of you");
		lore.add("§81 Second Cooldown");
		lore.add(" ");
		lore.add("§9§lRARE SWORD");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 25, true);
		meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
		meta.setUnbreakable(true);
		item.setItemMeta(meta);
		aspectoftheend = item;
	}
}