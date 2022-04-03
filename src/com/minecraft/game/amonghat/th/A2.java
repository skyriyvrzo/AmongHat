package com.minecraft.game.amonghat.th;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.minecraft.game.amonghat.th.Item.C;

public class A2 implements CommandExecutor {
	
	  String prefix = "§7§l(§b§lAmong§d§lHat§7§l)";

	  
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    if (!(sender instanceof Player)) {
	      sender.sendMessage("Only players can use this command!");
	      return true;
	    } 
	    Player player = (Player)sender;
	    if (sender.hasPermission("op")){
	    	if (cmd.getName().equalsIgnoreCase("banana")) 
	    		player.getInventory().addItem(C.banana);
	    	
	    		if (cmd.getName().equalsIgnoreCase("black")) {
	    			player.getInventory().addItem(C.black);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("blue")) {
	    			player.getInventory().addItem(C.blue);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("brown")) {
	    			player.getInventory().addItem(C.brown);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("coral")) {
	    			player.getInventory().addItem(C.coral);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("cyan")) {
	    			player.getInventory().addItem(C.cyan);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("fortegreen")) {
	    			player.getInventory().addItem(C.fortegreen);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("gray")) {
	    			player.getInventory().addItem(C.gray);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("green")) {
	    			player.getInventory().addItem(C.green);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("lime")) {
	    			player.getInventory().addItem(C.lime);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("maloon")) {
	    			player.getInventory().addItem(C.maloon);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("olive")) {
	    			player.getInventory().addItem(C.olive);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("orange")) {
	    			player.getInventory().addItem(C.orange);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("pink")) {
	    			player.getInventory().addItem(C.pink);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("purple")) {
	    			player.getInventory().addItem(C.purple);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("red")) {
	    			player.getInventory().addItem(C.red);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("rose")) {
	    			player.getInventory().addItem(C.rose);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("tan")) {
	    			player.getInventory().addItem(C.tan);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("white")) {
	    			player.getInventory().addItem(C.white);
	    		}    		
	    		if (cmd.getName().equalsIgnoreCase("yellow")) {
	    			player.getInventory().addItem(C.yellow);
	    		}
	    }
	      else {
	          sender.sendMessage(this.prefix + " §6sorry, but you do not have permission to perform this command. Please contack the server administrators if you believe that this is a mistake.");
	      }
	    return true;
	  }
}