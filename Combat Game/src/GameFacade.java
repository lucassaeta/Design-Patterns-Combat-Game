import AbstractFactory.GameController;
import Characters.Player;
import Characters.Enemies.Warriors.Warrior1;
import Characters.Enemies.Warriors.Warrior3;
import Combat.CombatGestion;

public class GameFacade
{
	public void startGame(Player player)
	{
		GameController.getInstance().play(new CombatGestion(player, new Warrior3()));
	}
}
