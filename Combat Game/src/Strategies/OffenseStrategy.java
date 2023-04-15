package Strategies;

import java.util.ArrayList;

public class OffenseStrategy implements CombatStrategy
{
	protected ArrayList<Moves> moves = new ArrayList <Moves>();
	
	public ArrayList<Moves> combatTemplateAction()
	{
		moves.add(Moves.ATTACK);
		moves.add(Moves.SPECIAL_ATTACK);
		moves.add(Moves.ATTACK);
		
		return moves;
	}
}
