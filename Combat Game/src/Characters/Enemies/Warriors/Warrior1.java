package Characters.Enemies.Warriors;

import Worlds.World;

public class Warrior1 extends Warrior
{
	public Warrior1()
	{
		super(World.EVERFROST.getComplexFactor().intValue());
	}
	
	public String toString()
	{
		return "(BLACKFROST WARRIOR)" + printStats();
	}
	public String printStats()
	{
		return "\nPower: " + power + "\nStrength: " + strength + "\nShield: " + shield;
	}

	public int getXP()
	{
		return 3;
	}
}
