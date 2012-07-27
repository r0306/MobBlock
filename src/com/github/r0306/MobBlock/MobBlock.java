package com.github.r0306.MobBlock;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public class MobBlock extends JavaPlugin
{

	public static ArrayList<MobNoteBlock> mobBlocks = new ArrayList<MobNoteBlock>();
	
	public void onEnable()
	{
		
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		
		try
		{
		
			createDataFile();
			mobBlocks = getMobBlocks();
		
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		
		} catch (IOException e) {

			e.printStackTrace();
		
		}
		
		System.out.println("MobBlock version [" + getDescription().getVersion() + "] loaded.");
		
	}
	
	public void onDisable()
	{
		
		try
		{
			saveMobBlocks();
		
		} catch (IOException e) {

			e.printStackTrace();
		
		}
		
		System.out.println("MobBlock version [" + getDescription().getVersion() + "] loaded.");
		
	}
	
	public void createDataFile() throws IOException
	{
		
		if (!getDataFolder().exists())
		{
			
			getDataFolder().mkdirs();
			
		}
		
		File file = new File(getDataFolder() + "\\MobBlockData.bin");
		
		if (!file.isFile())
		{
			
			file.createNewFile();
			
		}
			
	}
		
	@SuppressWarnings("unchecked")
	public ArrayList<MobNoteBlock> getMobBlocks() throws IOException, ClassNotFoundException
	{
				
		ArrayList<MobNoteBlock> tempList = new ArrayList<MobNoteBlock>();
		
		FileInputStream f_in = new FileInputStream(getDataFolder() + "\\MobBlockData.bin");
		
		if (f_in.available() != 0)
		{

			ObjectInputStream obj_in = new ObjectInputStream(f_in);
			
			tempList = (ArrayList<MobNoteBlock>) obj_in.readObject();

			obj_in.close();
		
		}
		
		return tempList;
				
	}
	
	public void saveMobBlocks() throws IOException
	{
		
		FileOutputStream f_out = new FileOutputStream(getDataFolder() + "\\MobBlockData.bin");
		
		ObjectOutputStream obj_out = new ObjectOutputStream (f_out);
		
		obj_out.writeObject(mobBlocks);
		
		obj_out.close();
		
	}
	
	public void clearTrash()
	{
		
		for (MobNoteBlock mb : mobBlocks)
		{
			
			if (mb.getLocation().getBlock().getType() != Material.NOTE_BLOCK)
			{
				
				mb.unregisterNoteBlock();
				
			}
			
		}
		
	}
	
}
