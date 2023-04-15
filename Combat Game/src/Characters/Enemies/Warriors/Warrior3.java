package Characters.Enemies.Warriors;

import Worlds.World;

public class Warrior3 extends Warrior
{
	public Warrior3()
	{
		super(World.RUINED_CASTLE.getComplexFactor().intValue());
	}
	
	public String toString()
	{
		return "DRAGON SLAYER" + printStats();
	}
	public String printStats()
	{
		return "\nPower: " + power + "\nStrength: " + strength + "\nShield: " + shield;
	}

	public int getXP()
	{
		return 7;
	}
	
	public void callDragonSouls()
	{
		//CONSUME LOS TRES TURNOS DEL ENEMIGO
		//PASA A ESTADO RAGED
		//EL JUGADOR PASA A ESTADO DEBILITADO
	}
}
