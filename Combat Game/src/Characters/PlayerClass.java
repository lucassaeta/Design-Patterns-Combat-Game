package Characters;

public enum PlayerClass
{
	FIGHTER(15, 80, 10, 5, 5), ASSASSIN(20, 40, 2, 5, 10), TANK(10, 100, 15, 2, 1), MAGE(15, 65, 1, 13, 5), NONAME(4, 50, 4, 4, 4);
	private int[] playerAtributes = new int[5];
	
	public int [] getClassPlayer()
	{
		return playerAtributes;
	}
	
	PlayerClass(int power, int strength, int shield, int wisdom, int agility)
	{
		playerAtributes[0] = power;
		playerAtributes[1] = strength;
		playerAtributes[2] = shield;
		playerAtributes[3] = wisdom;
		playerAtributes[4] = agility;
	}
}
