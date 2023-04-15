package Characters.Enemies.Beasts;

import Worlds.World;

public class Beast3 extends Beast
{
	public Beast3()
	{
		super(World.RUINED_CASTLE.getComplexFactor().intValue());
	}
	
	public String toString()
	{
		return "(SHADOW HUNTER)" + printStats();
	}
	public String printStats()
	{
		return "\nPower: " + power + "\nStrength: " + strength + "\nShield: " + shield;
	}

	public int getXP()
	{
		return 7;
	}
	
	public void assambleTheShadows()
	{
		//PASA A ESTADO UNTARGETEABLE
		specialDefense();
		attack();
	}
}
