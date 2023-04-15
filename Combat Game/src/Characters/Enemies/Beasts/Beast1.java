package Characters.Enemies.Beasts;

import State.GameState;
import Worlds.World;

public class Beast1 extends Beast
{
	public Beast1()
	{
		super(World.EVERFROST.getComplexFactor().intValue());
	}
	
	public String toString()
	{
		return "(CURSED METAMORPH)" + printStats();
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
