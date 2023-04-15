package Characters.Enemies;

import java.util.ArrayList;

import State.GameState;
import State.GameStateContext;
import Strategies.CombatStrategy;
import Strategies.Moves;

public abstract class EnemyAbstract implements Enemy
{
	protected int power;
	protected int strength;
	protected int shield;
	
	GameState gameState;
	
	protected CombatStrategy combatStrategy;
	protected ArrayList <Moves> moves = new ArrayList <Moves>();
	
	public EnemyAbstract(int power, int strength, int shield, CombatStrategy combatStrategy)
	{
		super();
		this.power = power;
		this.strength = strength;
		this.shield = shield;
		this.combatStrategy = combatStrategy;
		this.gameState = GameStateContext.getNormalGameState();
		moves = this.combatStrategy.combatTemplateAction();
	}
	
	public int getPower()
	{
		return power;
	}
	public int getStrenght()
	{
		return strength;
	}
	public int getShield()
	{
		return shield;
	}
	
	public void setStrenght(int strength)
	{
		this.strength = strength;
	}
	
	public CombatStrategy getCombatStrategy() {
		return combatStrategy;
	}
	public void setCombatStrategy(CombatStrategy combatStrategy) {
		this.combatStrategy = combatStrategy;
		this.moves = this.combatStrategy.combatTemplateAction();
	}
	
	public ArrayList<Moves> getMoves() {
		return moves;
	}
	public void setMoves(ArrayList<Moves> moves) {
		this.moves = moves;
	}
	
	public double attack()
	{
		System.err.println("El enemigo ataca");
		return power;
	}

	public int defend()
	{
		System.err.println("El enemigo se defiende");
		return shield;
	}
	
	public abstract void specialAttack();
	public abstract void specialDefense();
	
	@Override
	public ArrayList<Moves> combatTemplateAction() //DELEGACION POR COMPOSICION
	{
		return this.combatStrategy.combatTemplateAction();
	}
}
