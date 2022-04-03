package com.minecraft.game.amonghat.th;

import org.bukkit.plugin.java.JavaPlugin;

import com.minecraft.game.amonghat.th.Item.C;
import com.minecraft.game.amonghat.th.Item.E;

public class A1 extends JavaPlugin {
	  public void onEnable() {
		    C.init();
		    this.getCommand("aspectoftheend").setExecutor(new A2());

		    
		    this.getServer().getPluginManager().registerEvents(new E(), this);

}
