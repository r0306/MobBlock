package com.github.r0306.MobBlock;

import org.bukkit.Effect;
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
	IRON_GOLEM_HURT(17),
	PLAYER_HURT(18),
	OCELOT_DEATH(19),
	MOOSHROOM_DEATH(20),
	SKELETON_DEATH(21),
	CREEPER_DEATH(22),
	SLIME_DEATH(22),
	ZOMBIE_DEATH(24),
	SPIDER_DEATH(25),
	CHICKEN_DEATH(26),
	COW_DEATH(27),
	ENDERMAN_DEATH(28),
	WOLF_DEATH(29),
	PIG_ZOMBIE_DEATH(30),
	GHAST_DEATH(31),
	SHEEP_DEATH(32),
	BLAZE_DEATH(33),
	SILVER_FISH_DEATH(34),
	PIG_DEATH(35),
	IRON_GOLEM_DEATH(36),
	PLAYER_DEATH(37);
		
	@SuppressWarnings("unused")
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
		   case 17: return EntityType.IRON_GOLEM;
		   case 18: return EntityType.PLAYER;
		   case 19: return EntityType.OCELOT;
		   case 20: return EntityType.MUSHROOM_COW;
		   case 21: return EntityType.SKELETON;
		   case 22: return EntityType.CREEPER;
		   case 23: return EntityType.SLIME;
		   case 24: return EntityType.ZOMBIE;
		   case 25: return EntityType.SPIDER;
		   case 26: return EntityType.CHICKEN;
		   case 27: return EntityType.COW;
		   case 28: return EntityType.ENDERMAN;
		   case 29: return EntityType.WOLF;
		   case 30: return EntityType.PIG_ZOMBIE;
		   case 31: return EntityType.GHAST;
		   case 32: return EntityType.SHEEP;
		   case 33: return EntityType.BLAZE;
		   case 34: return EntityType.SILVERFISH;
		   case 35: return EntityType.PIG;
		   case 36: return EntityType.IRON_GOLEM;
		   case 37: return EntityType.PLAYER;

		}
		
		return null;
		
	}
	
	public static Effect getEffect(int i)
	{
		
		switch(i)
		{
			
			case 38: return Effect.SMOKE;
			case 39: return Effect.POTION_BREAK;
			case 40: return Effect.BLAZE_SHOOT;
			case 41: return Effect.BOW_FIRE;
			case 42: return Effect.CLICK1;
			case 43: return Effect.CLICK2;
			case 44: return Effect.DOOR_TOGGLE;
			case 45: return Effect.EXTINGUISH;
			case 46: return Effect.GHAST_SHOOT;
			case 47: return Effect.GHAST_SHRIEK;
			case 48: return Effect.STEP_SOUND;
			case 49: return Effect.ZOMBIE_CHEW_IRON_DOOR;
			case 50: return Effect.ZOMBIE_CHEW_WOODEN_DOOR;
			case 51: return Effect.ZOMBIE_DESTROY_DOOR;
		
		}
		
		return null;
		
	}
			
}


