package Combat;

import java.util.ArrayList;
import java.util.Scanner;

import Characters.Player;
import Characters.Enemies.Enemy;
import State.GameStateContext;
import Strategies.DefenseStrategy;
import Strategies.Moves;
import Strategies.OffenseStrategy;

public class CombatGestion
{
	private Player player;
	private Enemy enemy;
	private int turns;
	private int playerAction;
	private ArrayList<Moves> enemyActions;
	private GameStateContext gameStateContext;
	private Scanner entrada = new Scanner(System.in);
	
	public CombatGestion()
	{
		super();
	}
	
	public CombatGestion(Player player, Enemy enemy)
	{
		this.player = player;
		this.enemy = enemy;
		turns = 0;
		playerAction = 0;
		enemyActions = this.enemy.getMoves();
		gameStateContext = new GameStateContext(player);
	}
	
	public Player getPlayer()
	{
		return player;
	}
	public void setPlayer(Player player)
	{
		this.player = player;
	}

	public Enemy getEnemy()
	{
		return enemy;
	}
	public void setEnemy(Enemy enemy)
	{
		this.enemy = enemy;
		enemyActions = this.enemy.getMoves();
	}

	public int getTurns()
	{
		return turns;
	}
	public void setTurns(int turns)
	{
		this.turns = turns;
	}

	public int getPlayerAction()
	{
		return playerAction;
	}
	public void setPlayerAction(int playerAction)
	{
		this.playerAction = playerAction;
	}

	public void combat()
	{	
		while(player.getStrength() > 0 && enemy.getStrenght() > 0)
		{
			System.err.println("TURNO " + (turns+1) + "\n");
			
			System.out.println(this.player.toString() + "\n\n\tVS\n\n" + enemy.toString() + "\n");
			
			if(this.player.getPlayerState() == GameStateContext.getWeakenedGameState())
			{
				this.player.setShield(0);
			}
			
			if(this.player.getPlayerState() == GameStateContext.getStunedGameState())
			{
				System.err.println("Estas estuneado, pierdes el turno");
			}else
			{
				do {
					System.out.println("Elige accion:\n 1.Atacar\n 2.Defender\n 3.Regenerar salud");
					
					playerAction = entrada.nextInt();
					
					switch(this.playerAction)
					{
					case 1:
						this.enemy.setStrenght(this.enemy.getStrenght()-(this.player.attack()-this.enemy.getShield()));
						break;
					case 2:
						this.player.defend();
						break;
					case 3:
						this.player.heal();
						break;
					}
				}while(playerAction < 1 && playerAction > 3);
			}
			
			gameStateContext.process(null);
			
			switch(this.enemyActions.get(turns%3))
			{
			case ATTACK:
				this.player.setStrength(this.player.getStrength() - (int) (this.enemy.attack() - this.player.getShield()));
				break;
			case DEFENSE:
				this.enemy.defend();
				break;
			case SPECIAL_ATTACK:
				this.enemy.specialAttack();
				break;
			case SPECIAL_DEFENSE:
				this.enemy.specialDefense();
				break;
			}
			
			if(this.enemy.getStrenght() < 10)
			{
				this.enemy.setCombatStrategy(new DefenseStrategy());
			}else {
				this.enemy.setCombatStrategy(new OffenseStrategy());
			}
			
			turns++;
		}
		if(player.getStrength()<=0)
		{
			System.out.println("\nTHE PLAYER HAS BEEN DEFEATED");
		}
		else if(enemy.getStrenght()<=0)
		{
			System.out.println("\nAN ENEMY HAS BEEN DEFEATED");
		}
	}
}
