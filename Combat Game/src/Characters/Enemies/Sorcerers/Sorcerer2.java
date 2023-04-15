package Characters.Enemies.Sorcerers;

import Worlds.World;

public class Sorcerer2 extends Sorcerer
{
	public Sorcerer2()
	{
		super(World.FORGOTTEN_MOUNTAIN.getComplexFactor().intValue());
	}

	public String toString()
	{
		return "(ETERNAL-DUST WALKER)" + printStats();
	}
	
	public String printStats()
	{
		return "\nMagic power: " + power + "\nStrength: " + strength + "\nShield: " + shield;
	}

	public int getXP()
	{
		return 5;
	}
}
