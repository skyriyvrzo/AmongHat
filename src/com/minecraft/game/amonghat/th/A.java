package com.minecraft.game.amonghat.th;

import org.bukkit.plugin.java.JavaPlugin;

import com.minecraft.game.amonghat.th.Item.C;
import com.minecraft.game.amonghat.th.Item.D;

public class A extends JavaPlugin {
	  public void onEnable() {
		    C.init();
		    this.getCommand("hbanana").setExecutor(new B());
		    this.getCommand("hblack").setExecutor(new B());
		    this.getCommand("hblue").setExecutor(new B());
		    this.getCommand("hbrown").setExecutor(new B());
		    this.getCommand("hcoral").setExecutor(new B());
		    this.getCommand("hcyan").setExecutor(new B());
		    this.getCommand("hfortegreen").setExecutor(new B());
		    this.getCommand("hgray").setExecutor(new B());
		    this.getCommand("hgreen").setExecutor(new B());
		    this.getCommand("hlime").setExecutor(new B());
		    this.getCommand("hmaloon").setExecutor(new B());
		    this.getCommand("holive").setExecutor(new B());
		    this.getCommand("horange").setExecutor(new B());
		    this.getCommand("hpink").setExecutor(new B());
		    this.getCommand("hpurple").setExecutor(new B());
		    this.getCommand("hred").setExecutor(new B());
		    this.getCommand("hrose").setExecutor(new B());
		    this.getCommand("htan").setExecutor(new B());
		    this.getCommand("hwhite").setExecutor(new B());
		    this.getCommand("hyellow").setExecutor(new B());
		    this.getCommand("hatall").setExecutor(new B());
		    
		    this.getServer().getPluginManager().registerEvents(new D(), this);
	  }
	  
	  public void onDisable() {}
}
