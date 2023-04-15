package AbstractFactory;

import Characters.Enemies.Enemy;
import Characters.Enemies.Beasts.Beast3;
import Characters.Enemies.Sorcerers.Sorcerer3;
import Characters.Enemies.Warriors.Warrior3;

public class EnemyLvl3Factory implements AbstractEnemyFactory{

	@Override
	public Enemy createBeast() {
		// TODO Auto-generated method stub
		return new Beast3();
	}

	@Override
	public Enemy createSorcerer() {
		// TODO Auto-generated method stub
		return new Sorcerer3();
	}

	@Override
	public Enemy createWarrior() {
		// TODO Auto-generated method stub
		return new Warrior3();
	}


}

