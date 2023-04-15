package Characters.Enemies.Sorcerers;

import Worlds.World;

public class Sorcerer3 extends Sorcerer
{
	public Sorcerer3()
	{
		super(World.RUINED_CASTLE.getComplexFactor().intValue());
	}

	public String toString()
	{
		return "(OBLIVION HERALD)" + printStats();
	}
	
	public String printStats()
	{
		return "\nMagic power: " + power + "\nStrength: " + strength + "\nShield: " + shield;
	}

	public int getXP()
	{
		return 7;
	}
	
	public void returnOfTheVoid()
	{
		//EL JUGADOR PASA A ESTADO DEBILITADO
		attack();
		attack();
	}
}
