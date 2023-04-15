package Characters.Enemies.Warriors;

import Worlds.World;

public class Warrior2 extends Warrior
{
	public Warrior2()
	{
		super(World.FORGOTTEN_MOUNTAIN.getComplexFactor().intValue());
	}
	
	public String toString()
	{
		return "(Ashen Knight)" + printStats();
	}
	public String printStats()
	{
		return "\nPower: " + power + "\nStrength: " + strength + "\nShield: " + shield;
	}

	public int getXP()
	{
		return 5;
	}
	
	public void hideInShadows()
	{
		//PASA A ESTADO UNTARGETEABLE
	}
}
