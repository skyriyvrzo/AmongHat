package com.minecraft.game.amonghat.th;

import org.bukkit.plugin.java.JavaPlugin;

import com.minecraft.game.amonghat.th.Item.C;
import com.minecraft.game.amonghat.th.Item.E;

public class A1 extends JavaPlugin {
	  public void onEnable() {
		    C.init();
		    this.getCommand("hbanana").setExecutor(new A2());
		    this.getCommand("hblack").setExecutor(new A2());
		    this.getCommand("hblue").setExecutor(new A2());
		    this.getCommand("hbrown").setExecutor(new A2());
		    this.getCommand("hcoral").setExecutor(new A2());
		    this.getCommand("hcyan").setExecutor(new A2());
		    this.getCommand("hfortegreen").setExecutor(new A2());
		    this.getCommand("hgray").setExecutor(new A2());
		    this.getCommand("hgreen").setExecutor(new A2());
		    this.getCommand("hlime").setExecutor(new A2());
		    this.getCommand("hmaloon").setExecutor(new A2());
		    this.getCommand("holive").setExecutor(new A2());
		    this.getCommand("horange").setExecutor(new A2());
		    this.getCommand("hpink").setExecutor(new A2());
		    this.getCommand("hpurple").setExecutor(new A2());
		    this.getCommand("hred").setExecutor(new A2());
		    this.getCommand("hrose").setExecutor(new A2());
		    this.getCommand("htan").setExecutor(new A2());
		    this.getCommand("hwhite").setExecutor(new A2());
		    this.getCommand("hyellow").setExecutor(new A2());

		    
		    this.getServer().getPluginManager().registerEvents(new E(), this);
	  }
	  
	  public void onDisable() {}
}
