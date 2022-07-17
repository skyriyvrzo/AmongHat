package com.minecraft.game.amonghat.th;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.minecraft.game.amonghat.th.Item.C;

import net.md_5.bungee.api.ChatColor;

public class B implements CommandExecutor {
	
	  String prefix = ChatColor.GRAY+""+ChatColor.BOLD+"("+ChatColor.AQUA+""+ChatColor.BOLD+"Among"+ChatColor.LIGHT_PURPLE+""+ChatColor.BOLD+"Hat"+ChatColor.GRAY+""+ChatColor.BOLD+")"; // "§7§l(§b§lAmong§d§lHat§7§l)"

	  
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    if (!(sender instanceof Player)) {
	      sender.sendMessage("Only players can use this command!");
	      return true;
	    } 
	    Player player = (Player)sender;
	    if (sender.hasPermission("op")){
	    	if (cmd.getName().equalsIgnoreCase("hbanana")) 
	    		player.getInventory().addItem(C.banana);
	    	
	    		if (cmd.getName().equalsIgnoreCase("hblack")) {
	    			player.getInventory().addItem(C.black);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hblue")) {
	    			player.getInventory().addItem(C.blue);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hbrown")) {
	    			player.getInventory().addItem(C.brown);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hcoral")) {
	    			player.getInventory().addItem(C.coral);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hcyan")) {
	    			player.getInventory().addItem(C.cyan);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hfortegreen")) {
	    			player.getInventory().addItem(C.fortegreen);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hgray")) {
	    			player.getInventory().addItem(C.gray);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hgreen")) {
	    			player.getInventory().addItem(C.green);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hlime")) {
	    			player.getInventory().addItem(C.lime);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hmaloon")) {
	    			player.getInventory().addItem(C.maloon);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("holive")) {
	    			player.getInventory().addItem(C.olive);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("horange")) {
	    			player.getInventory().addItem(C.orange);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hpink")) {
	    			player.getInventory().addItem(C.pink);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hpurple")) {
	    			player.getInventory().addItem(C.purple);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hred")) {
	    			player.getInventory().addItem(C.red);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hrose")) {
	    			player.getInventory().addItem(C.rose);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("htan")) {
	    			player.getInventory().addItem(C.tan);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hwhite")) {
	    			player.getInventory().addItem(C.white);
	    		}    		
	    		if (cmd.getName().equalsIgnoreCase("hyellow")) {
	    			player.getInventory().addItem(C.yellow);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hatall")) {
	    			player.getInventory().addItem(C.banana,C.black,C.blue,C.brown,C.coral,C.cyan,C.fortegreen,C.gray,C.green,C.lime,C.maloon,C.olive,C.orange,C.pink,C.purple,C.red,C.rose,C.tan,C.white,C.yellow);
	    		}
	    		
	    		if (cmd.getName().equalsIgnoreCase("hbigglasses")) {
	    			player.getInventory().addItem(C.big_glasses);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hcatears")) {
	    			player.getInventory().addItem(C.cat_ears);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hglasses")) {
	    			player.getInventory().addItem(C.glasses);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("hthuglifeglasses")) {
	    			player.getInventory().addItem(C.thug_life_glasses);
	    		}
	    		if (cmd.getName().equalsIgnoreCase("accessoryall")) {
	    			player.getInventory().addItem(C.big_glasses,C.cat_ears,C.glasses,C.thug_life_glasses);
	    		}
	    		

	    		
	    		
	    		
	    		
	    }
	      else {
	          sender.sendMessage(this.prefix + ChatColor.GOLD+"sorry, but you do not have permission to perform this command. Please contack the server administrators if you believe that this is a mistake.");
	      }
	    return true;
	  }
}