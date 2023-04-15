package Characters.Enemies.Beasts;

import Worlds.World;

public class Beast2 extends Beast
{
	public Beast2()
	{
		super(World.FORGOTTEN_MOUNTAIN.getComplexFactor().intValue());
	}
	
	public String toString()
	{
		return "(DEATHSWORN COLLOSUS)" + printStats();
	}
	public String printStats()
	{
		return "\nPower: " + power + "\nStrength: " + strength + "\nShield: " + shield;
	}

	public int getXP()
	{
		return 5;
	}
	
	public void shakeTheUndergrounds()
	{
		//EL JUGADOR PASA A ESTADO STUNED
	}
}
