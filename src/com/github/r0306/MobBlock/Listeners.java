package com.github.r0306.MobBlock;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.NotePlayEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Listeners implements Listener
{

	@EventHandler
	public void creationListener(BlockPlaceEvent event)
	{
		
		Player player = event.getPlayer();
		Block block = event.getBlock();
		
		if (Util.canCreate(player))
		{
			
			if (block.getType() == Material.NOTE_BLOCK)
			{
				
				if (player.isSneaking())
				{
					
					new MobNoteBlock(block.getLocation());
					
					player.sendMessage(ChatColor.YELLOW + "[MobBlock] " + ChatColor.GREEN + "Created new mob note block.");
					
				}
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onNoteChange(PlayerInteractEvent event)
	{
		
		Player player = event.getPlayer();
		
		if (Util.canToggle(player))
		{
		
			if (event.getAction() == Action.RIGHT_CLICK_BLOCK)
			{
				
				Block block = event.getClickedBlock();
				
				if (getMobBlock(block) != null)
				{
					
					MobNoteBlock mb = getMobBlock(block);
					
					mb.hitBlock();
					
				}
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onPlay(NotePlayEvent event)
	{
		
		Block block = event.getBlock();

		if (getMobBlock(block) != null)
		{
			System.out.println("hi");
			MobNoteBlock mb = getMobBlock(block);
						
			mb.playSound();
				
		}
		
	}
	
	public MobNoteBlock getMobBlock(Block block)
	{
		
		for (MobNoteBlock mb : MobBlock.mobBlocks)
		{
			
			if (mb.equals(block))
			{
				
				return mb;
				
			}
			
		}
		
		return null;
		
	}
	
}
