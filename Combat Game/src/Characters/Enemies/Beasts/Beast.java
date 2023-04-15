package Characters.Enemies.Beasts;

import Characters.Enemies.Enemy;
import Characters.Enemies.EnemyAbstract;
import State.GameStateContext;
import State.StunedGameState;
import Strategies.OffenseStrategy;

public abstract class Beast extends EnemyAbstract implements Enemy
{
	protected Beast(int complexFactor)
	{
		super(15*complexFactor, 30*complexFactor, 2*complexFactor, new OffenseStrategy());
	}
	
	public void specialAttack()
	{
		System.err.println("DEMOLISH");
		GameStateContext.process(new StunedGameState());
	}
	public void specialDefense()
	{
		System.err.println("REGENERATE");
		this.strength += 15;
	}
}
