package com.github.r0306.MobBlock;

import java.io.Serializable;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class MobNoteBlock implements Serializable
{

	private static final long serialVersionUID = 3550905876811858861L;
	
	protected int x;
	protected int y;
	protected int z;
	protected String world;
	protected int blockState;
	
	transient Location location;

	public MobNoteBlock()
	{
		
		
		
	}
	
	public MobNoteBlock(Location location)
	{
		
		x = location.getBlockX();
		y = location.getBlockY();
		z = location.getBlockZ();
		world = location.getWorld().getName();
		
		blockState = 0;
		
		this.location = location;
		
		registerNoteBlock();
				
	}
	
	public void registerNoteBlock()
	{
		
		MobBlock.mobBlocks.add(this);
		
	}
	
	public Location getLocation()
	{
		
		return location;
		
	}
	
	public Block getBlock()
	{
		
		return location.getBlock();
		
	}
	
	public boolean equals(Block block)
	{
		
		return location.getBlockX() == block.getLocation().getBlockX() && location.getBlockY() == block.getLocation().getBlockY() && location.getBlockZ() == block.getLocation().getBlockZ() && block.getType() == Material.NOTE_BLOCK;
		
	}
	
	public void hitBlock()
	{
		
		if (blockState < 41)
		{
		
			blockState ++;
	
		}
		else
		{
			
			blockState = 0;
			
		}
		
	}
	
	public void playSound()
	{
		
		SoundPackets sp = new SoundPackets();
		
		if (blockState <= 37)
		{
		
			sp.playSound(location, MobSound.getMob(blockState), getState());
		
		}
		else
		{
			
			sp.playEffect(location, MobSound.getMob(blockState));
			
		}
			
	}
	
	public boolean getState()
	{
		
		return blockState <= 18; 
		
	}

}
