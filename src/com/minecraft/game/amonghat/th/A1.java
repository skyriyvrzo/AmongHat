package com.minecraft.game.amonghat.th;

import org.bukkit.plugin.java.JavaPlugin;

import com.minecraft.game.amonghat.th.Item.C;
import com.minecraft.game.amonghat.th.Item.E;

public class A1 extends JavaPlugin {
	  public void onEnable() {
		    C.init();
		    this.getCommand("banana").setExecutor(new A2());
		    this.getCommand("black").setExecutor(new A2());
		    this.getCommand("blue").setExecutor(new A2());
		    this.getCommand("brown").setExecutor(new A2());
		    this.getCommand("coral").setExecutor(new A2());
		    this.getCommand("cyan").setExecutor(new A2());
		    this.getCommand("fortegreen").setExecutor(new A2());
		    this.getCommand("gray").setExecutor(new A2());
		    this.getCommand("green").setExecutor(new A2());
		    this.getCommand("lime").setExecutor(new A2());
		    this.getCommand("maloon").setExecutor(new A2());
		    this.getCommand("olive").setExecutor(new A2());
		    this.getCommand("orange").setExecutor(new A2());
		    this.getCommand("pink").setExecutor(new A2());
		    this.getCommand("purple").setExecutor(new A2());
		    this.getCommand("red").setExecutor(new A2());
		    this.getCommand("rose").setExecutor(new A2());
		    this.getCommand("tan").setExecutor(new A2());
		    this.getCommand("white").setExecutor(new A2());
		    this.getCommand("yellow").setExecutor(new A2());

		    
		    this.getServer().getPluginManager().registerEvents(new E(), this);
	  }
	  
	  public void onDisable() {}
}
