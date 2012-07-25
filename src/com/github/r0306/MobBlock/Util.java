package com.github.r0306.MobBlock;

import org.bukkit.entity.Player;

public class Util 
{

	public static boolean canCreate(Player player)
	{
		
		return player.hasPermission("mb.create");
		
	}
	
	public static boolean canToggle(Player player)
	{
		
		return player.hasPermission("mb.toggle");
		
	}
	
	public static boolean canHear(Player player)
	{
		
		return player.hasPermission("mb.listen");
		
	}
	
}
