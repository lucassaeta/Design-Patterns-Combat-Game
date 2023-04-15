package AbstractFactory;

import Characters.Enemies.Enemy;
import Characters.Enemies.Beasts.Beast1;
import Characters.Enemies.Sorcerers.Sorcerer1;
import Characters.Enemies.Warriors.Warrior1;

public class EnemyLvl1Factory implements AbstractEnemyFactory
{
	public Enemy createBeast()
	{
		return new Beast1();
	}

	public Enemy createSorcerer()
	{
		return new Sorcerer1();
	}

	@Override
	public Enemy createWarrior()
	{
		return new Warrior1();
	}


}

