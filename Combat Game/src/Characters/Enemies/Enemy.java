package Characters.Enemies;

import java.util.ArrayList;

import State.GameState;
import Strategies.CombatStrategy;
import Strategies.Moves;

public interface Enemy extends CombatStrategy
{
	public String printStats();
	public int getXP();
	public int getPower();
	public int getStrenght();
	public int getShield();
	
	public double attack();
	public int defend();
	public void specialAttack();
	public void specialDefense();
	public void setStrenght(int i);
	public ArrayList<Moves> getMoves();
	public void setCombatStrategy(CombatStrategy combatStrategy);
}
