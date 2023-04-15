package State;

public class WeakenedGameState implements GameState
{
	private GameStateContext gameStateContext;
	
	public WeakenedGameState()
	{
		super();
	}
	
	WeakenedGameState(GameStateContext gameStateContext)
	{
		super();
		this.gameStateContext = gameStateContext;
	}
	
	public void normalGameState()
	{
		this.gameStateContext.setCurrentGameState(GameStateContext.getNormalGameState());
	}

	public void stunedGameState()
	{
		throw new IllegalStateException("State change crashed");
	}

	public void untargeteableGameState()
	{
		throw new IllegalStateException("State change crashed");
	}

	public void weakenedGameState()
	{
		throw new IllegalStateException("State change crashed");
	}

	public void process(GameState gameState)
	{
		this.normalGameState();
	}
}