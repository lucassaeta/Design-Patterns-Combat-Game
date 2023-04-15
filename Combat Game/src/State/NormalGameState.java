package State;

public class NormalGameState implements GameState
{
	private GameStateContext gameStateContext;
	
	NormalGameState()
	{
		super();
	}
	
	NormalGameState(GameStateContext gameStateContext)
	{
		super();
		this.gameStateContext = gameStateContext;
	}
	
	public void normalGameState()
	{
		throw new IllegalStateException("State change crashed");
	}

	public void stunedGameState()
	{
		this.gameStateContext.setCurrentGameState(GameStateContext.getStunedGameState());
	}

	public void untargeteableGameState()
	{
		this.gameStateContext.setCurrentGameState(GameStateContext.getUntargeteableGameState());
	}

	public void weakenedGameState()
	{
		this.gameStateContext.setCurrentGameState(GameStateContext.getWeakenedGameState());
	}
	
	public void process(GameState gameState)
	{
		if(gameState instanceof StunedGameState){
			this.stunedGameState();
		}else if(gameState instanceof UntargeteableGameState){
			this.stunedGameState();
		}else if(gameState instanceof WeakenedGameState){
			this.stunedGameState();
		}else if(gameState == null){}
		else {
			throw new IllegalStateException("State change crashed");
		}
	}

	public void process() {}
}
