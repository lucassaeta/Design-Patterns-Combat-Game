package State;

public interface GameState extends GameStateProcess
{
	public void normalGameState();
	public void stunedGameState();
	public void untargeteableGameState();
	public void weakenedGameState();
}
