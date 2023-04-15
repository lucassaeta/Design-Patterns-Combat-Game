package AbstractFactory;

import Characters.Enemies.Enemy;

public interface AbstractEnemyFactory {

	public Enemy createBeast();
	public Enemy createSorcerer();
	public Enemy createWarrior();
}
