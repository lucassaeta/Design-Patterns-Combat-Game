package Strategies;

public enum Moves
{
	ATTACK(0), DEFENSE(1), SPECIAL_ATTACK(3), SPECIAL_DEFENSE(4);
	private int move;
	
	Moves(int move)
	{
		this.move = move;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}
	
	
}
