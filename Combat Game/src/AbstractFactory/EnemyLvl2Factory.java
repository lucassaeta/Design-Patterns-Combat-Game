package AbstractFactory;

import Characters.Enemies.Enemy;
import Characters.Enemies.Beasts.Beast2;
import Characters.Enemies.Sorcerers.Sorcerer2;
import Characters.Enemies.Warriors.Warrior2;

public class EnemyLvl2Factory implements AbstractEnemyFactory{

	@Override
	public Enemy createBeast() {
		// TODO Auto-generated method stub
		return new Beast2();
	}

	@Override
	public Enemy createSorcerer() {
		// TODO Auto-generated method stub
		return new Sorcerer2();
	}

	@Override
	public Enemy createWarrior() {
		// TODO Auto-generated method stub
		return new Warrior2();
	}


}

