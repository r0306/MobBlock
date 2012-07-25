package com.github.r0306.MobBlock;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

public class MobBlock extends JavaPlugin
{

	public static ArrayList<MobNoteBlock> mobBlocks = new ArrayList<MobNoteBlock>();
	
	public void onEnable()
	{
		
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		System.out.println("MobBlock version [" + getDescription().getVersion() + "] loaded.");
		
	}
	
	public void onDisable()
	{
		
		System.out.println("MobBlock version [" + getDescription().getVersion() + "] loaded.");
		
	}
	
}
