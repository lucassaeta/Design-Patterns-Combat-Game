package Characters.Enemies.Sorcerers;

import Worlds.World;

public class Sorcerer1 extends Sorcerer
{
	public Sorcerer1()
	{
		super(World.EVERFROST.getComplexFactor().intValue());
	}

	public String toString()
	{
		return "(BLACK-MIST WALKER)" + printStats();
	}
	
	public String printStats()
	{
		return "\nMagic power: " + power + "\nStrength: " + strength + "\nShield: " + shield;
	}

	public int getXP()
	{
		return 3;
	}
}
