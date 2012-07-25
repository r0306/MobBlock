package com.github.r0306.MobBlock;

import org.bukkit.entity.EntityType;

public enum MobSound
{

	OCELOT_HURT(0),
	MOOSHROOM_HURT(1),
	SKELETON_HURT(2),
	CREEPER_HURT(3),
	SLIME_HURT(4),
	ZOMBIE_HURT(5),
	SPIDER_HURT(6),
	CHICKEN_HURT(7),
	COW_HURT(8),
	ENDERMAN_HURT(9),
	WOLF_HURT(10),
	PIG_ZOMBIE_HURT(11),
	GHAST_HURT(12),
	SHEEP_HURT(13),
	BLAZE_HURT(14),
	SILVER_FISH_HURT(15),
	PIG_HURT(16),
	SNOW_GOLEM_HURT(19),
	IRON_GOLEM_HURT(20),
	PLAYER_HURT(21),
	OCELOT_DEATH(22),
	MOOSHROOM_DEATH(23),
	SKELETON_DEATH(24),
	CREEPER_DEATH(25),
	SLIME_DEATH(26),
	ZOMBIE_DEATH(27),
	SPIDER_DEATH(28),
	CHICKEN_DEATH(29),
	COW_DEATH(30),
	ENDERMAN_DEATH(31),
	WOLF_DEATH(32),
	PIG_ZOMBIE_DEATH(33),
	GHAST_DEATH(34),
	SHEEP_DEATH(35),
	BLAZE_DEATH(36),
	SILVER_FISH_DEATH(37),
	PIG_DEATH(38),
	SNOW_GOLEM_DEATH(39),
	IRON_GOLEM_DEATH(40),
	PLAYER_DEATH(41);
		
	private int value;

	private MobSound(int value)
	{
		
		this.value = value;
		
	}
	
	public static EntityType getMob(int i)
	{
		
		switch(i)
		{		
		
		   case 0: return EntityType.OCELOT;
		   case 1: return EntityType.MUSHROOM_COW;
		   case 2: return EntityType.SKELETON;
		   case 3: return EntityType.CREEPER;
		   case 4: return EntityType.SLIME;
		   case 5: return EntityType.ZOMBIE;
		   case 6: return EntityType.SPIDER;
		   case 7: return EntityType.CHICKEN;
		   case 8: return EntityType.COW;
		   case 9: return EntityType.ENDERMAN;
		   case 10: return EntityType.WOLF;
		   case 11: return EntityType.PIG_ZOMBIE;
		   case 12: return EntityType.GHAST;
		   case 13: return EntityType.SHEEP;
		   case 14: return EntityType.BLAZE;
		   case 15: return EntityType.SILVERFISH;
		   case 16: return EntityType.PIG;
		   case 17: return EntityType.SNOWMAN;
		   case 18: return EntityType.IRON_GOLEM;
		   case 19: return EntityType.PLAYER;
		   case 20: return EntityType.OCELOT;
		   case 21: return EntityType.MUSHROOM_COW;
		   case 22: return EntityType.SKELETON;
		   case 23: return EntityType.CREEPER;
		   case 24: return EntityType.SLIME;
		   case 25: return EntityType.ZOMBIE;
		   case 26: return EntityType.SPIDER;
		   case 27: return EntityType.CHICKEN;
		   case 28: return EntityType.COW;
		   case 29: return EntityType.ENDERMAN;
		   case 30: return EntityType.WOLF;
		   case 31: return EntityType.PIG_ZOMBIE;
		   case 32: return EntityType.GHAST;
		   case 33: return EntityType.SHEEP;
		   case 34: return EntityType.BLAZE;
		   case 35: return EntityType.SILVERFISH;
		   case 36: return EntityType.PIG;
		   case 37: return EntityType.SNOWMAN;
		   case 38: return EntityType.IRON_GOLEM;
		   case 39: return EntityType.PLAYER;

		}
		
		return null;
		
	}
			
}


