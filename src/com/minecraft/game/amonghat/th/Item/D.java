package com.minecraft.game.amonghat.th.Item;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



public class D implements Listener {
		
	@EventHandler
	public void blockPlace(BlockPlaceEvent event) {

		Player player = event.getPlayer();
		ItemStack item = player.getInventory().getItemInMainHand();
		ItemMeta meta = item.getItemMeta();
		Block block = event.getBlock();
		

		if(meta.getLore().contains("�9Among Hat")) {
			block.setType(Material.AIR);
			event.setCancelled(true);
		}
	}
}