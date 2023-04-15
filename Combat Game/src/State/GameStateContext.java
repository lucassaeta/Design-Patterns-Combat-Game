package State;

import Characters.Player;

public class GameStateContext
{
	//COMPOSICION DURA
	private static GameStateProcess currentGameState;
	private static GameState normalGameState;
	private static GameState stunedGameState;
	private static GameState untargeteableGameState;
	private static GameState weakenedGameState;
	
	private Player player;
	private int initialShield;
	
	public GameStateContext(Player player)
	{
		GameStateContext.normalGameState = new NormalGameState(this);
		GameStateContext.stunedGameState = new StunedGameState(this);
		GameStateContext.untargeteableGameState = new UntargeteableGameState(this);
		GameStateContext.currentGameState = GameStateContext.normalGameState;
		this.player = player;
		this.player.setPlayerState((GameState) currentGameState);
		this.setInitialShield(player.getShield());
	}
	
	public static  GameStateProcess getCurrentGameState() {
		return currentGameState;
	}
	public void setCurrentGameState(GameState currentGameState) {
		GameStateContext.currentGameState = (GameStateProcess) currentGameState;
	}
	public static GameState getNormalGameState() {
		return normalGameState;
	}
	public void setNormalGameState(GameState normalGameState) {
		this.player.setShield(initialShield);
		GameStateContext.normalGameState = normalGameState;
	}
	public static GameState getStunedGameState() {
		return stunedGameState;
	}
	public void setStunedGameState(GameState stunedGameState) {
		GameStateContext.stunedGameState = stunedGameState;
		this.player.setPlayerState(stunedGameState);
	}
	public static GameState getUntargeteableGameState() {
		return untargeteableGameState;
	}
	public void setUntargeteableGameState(GameState untargeteableGameState) {
		GameStateContext.untargeteableGameState = untargeteableGameState;
	}
	public static GameState getWeakenedGameState() {
		return weakenedGameState;
	}
	public void setWeakenedGameState(GameState weakenedGameState) {
		this.player.setShield(0);
		GameStateContext.weakenedGameState = weakenedGameState;
	}
	
	public int getInitialShield() {
		return initialShield;
	}
	public void setInitialShield(int initialShield) {
		this.initialShield = initialShield;
	}
	
	public static void process(GameState gameState)
	{
		currentGameState.process(gameState);
	}

	
}
