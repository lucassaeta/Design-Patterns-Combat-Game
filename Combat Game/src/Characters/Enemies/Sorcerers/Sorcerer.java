package Characters.Enemies.Sorcerers;

import Characters.Enemies.Enemy;
import Characters.Enemies.EnemyAbstract;
import State.GameStateContext;
import State.StunedGameState;
import Strategies.DefenseStrategy;

public abstract class Sorcerer extends EnemyAbstract implements Enemy
{
	protected Sorcerer(int complexFactor)
	{
		super(15*complexFactor, 20*complexFactor, 5*complexFactor, new DefenseStrategy());
	}
	
	public void specialAttack()
	{
		System.err.println("The player has been ENHANCED");
		GameStateContext.process(new StunedGameState());
	}
	
	public void specialDefense()
	{
		System.err.println("HEAL");
		this.strength += 5;
	}
}
