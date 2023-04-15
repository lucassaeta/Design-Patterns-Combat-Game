package Characters.Enemies.Warriors;

import Characters.Enemies.Enemy;
import Characters.Enemies.EnemyAbstract;
import State.GameStateContext;
import State.StunedGameState;
import State.WeakenedGameState;
import Strategies.OffenseStrategy;
import Worlds.World;

public abstract class Warrior extends EnemyAbstract implements Enemy
{
	protected Warrior(int complexFactor)
	{
		super(15*complexFactor, 25*complexFactor, 10*complexFactor, new OffenseStrategy());
	}
	
	public void specialAttack()
	{
		System.err.println("\nEnemy is now RAGED\n");
		this.power += 5;
	}
	
	public void specialDefense()
	{
		GameStateContext.process(new WeakenedGameState());
		this.shield += 5;
	}
}
