package com.github.r0306.MobBlock;

import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import net.minecraft.server.DataWatcher;
import net.minecraft.server.MathHelper;
import net.minecraft.server.Packet24MobSpawn;
import net.minecraft.server.Packet29DestroyEntity;
import net.minecraft.server.Packet38EntityStatus;

public class SoundPackets 
{

	protected static int id = -1518084845;
	
	static DataWatcher metadata;
	
	public int getNewId()
	{
		
		return id ++;
		
	}
	
	public void playSound(Location location, EntityType entity, boolean state)
	{
		
		int tempId = getNewId();
		
		for (Player player : Bukkit.getOnlinePlayers())
		{
			
			if (Util.canHear(player))
			{
				
				((CraftPlayer)player).getHandle().netServerHandler.sendPacket(getMobSpawnPacket(location, tempId, entity));
				((CraftPlayer)player).getHandle().netServerHandler.sendPacket(getStatusPacket(tempId, state));
				((CraftPlayer)player).getHandle().netServerHandler.sendPacket(getEntityDestroyPacket(tempId));
				
			}
			
		}
								
	}
	
    public Packet24MobSpawn getMobSpawnPacket(Location loc, int mobID, EntityType entity)
    {

	    int x = MathHelper.floor(loc.getX() * 32.0D);
	    int y = MathHelper.floor(loc.getY() * 32.0D);
	    int z = MathHelper.floor(loc.getZ() * 32.0D);
		
	    metadata = new DataWatcher();
        metadata.a(0, Byte.valueOf((byte) 0));
        metadata.a(12, Integer.valueOf(0));
	    metadata.a(16, Byte.valueOf((byte) 0));
	   
	    Packet24MobSpawn packet = new Packet24MobSpawn();
	    packet.a = mobID;
	    packet.b = (byte) entity.getTypeId();
	    packet.c = x;
	    packet.d = y;
	    packet.e = z;
	    packet.f = degreeToByte(loc.getYaw());
	    packet.g = degreeToByte(loc.getPitch());
	    packet.h = packet.f;
	   
	    try
	    {
	    
	        Field metadataField = packet.getClass().getDeclaredField("i");
	        metadataField.setAccessible(true);
	        metadataField.set(packet, metadata);

	     } catch (Exception e) {

	        e.printStackTrace();

	     }
     
         return packet;
	
	}
	
	public Packet38EntityStatus getStatusPacket(int id, boolean state)
	{
		
	   	Packet38EntityStatus packet = new Packet38EntityStatus();
		packet.a = id;
		packet.b = (byte) ((state) ? 2 : 3);
		
	   	return packet;
		
	}
	
	public Packet29DestroyEntity getEntityDestroyPacket(int mobID)
	{
	   
		id --;
		  
		return new Packet29DestroyEntity(mobID);
	 
	}
		
	public byte degreeToByte(float degree)
	{
	   
	     return (byte)(int)((int)degree * 256.0F / 360.0F);
	  
	}
		
}
