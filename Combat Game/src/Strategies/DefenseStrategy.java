package Strategies;

import java.util.ArrayList;

public class DefenseStrategy implements CombatStrategy
{
	protected ArrayList<Moves> moves = new ArrayList <Moves>();
	
	public ArrayList<Moves> combatTemplateAction()
	{
		moves.add(Moves.DEFENSE);
		moves.add(Moves.SPECIAL_DEFENSE);
		moves.add(Moves.ATTACK);
		
		return moves;
	}
}
