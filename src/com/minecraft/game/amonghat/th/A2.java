package com.minecraft.game.amonghat.th;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class A2 implements CommandExecutor {
	
}
	  String prefix = "§7§l(§b§lAmong§d§lHat§7§l)";

	  
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    if (!(sender instanceof Player)) {
	      sender.sendMessage("Only players can use this command!");
	      return true;
	    } 
	    Player player = (Player)sender;
	    if (sender.hasPermission("op")){
	    		if (cmd.getName().equalsIgnoreCase("grapplinghook")) {
	    			player.getInventory().addItem(ItemCreate.grapplinghook);
	    		}
	      else {
	          sender.sendMessage(this.prefix + " §6sorry, but you do not have permission to perform this command. Please contack the server administrators if you believe that this is a mistake.");
	      }
	    return true;
	  }
	  
	  
	}