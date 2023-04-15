import java.util.Scanner;

import Characters.Player;
import Characters.PlayerClass;

public class Game
{
	public static void main(String[] args)
	{
		int clasePlayer = 0;
		Scanner entrada = new Scanner(System.in);
		Player player = null;
		GameFacade gameFacade = new GameFacade();
		
		System.out.println("ELIGE LA CLASE DE SU PERSONAJE:\n 1)GUERRERO\n 2)ASESINO\n 3)TANQUE\n 4)MAGO\n 5)DON NADIE");
		do{
			clasePlayer = entrada.nextInt();
			
			switch(clasePlayer)
			{
			case 1:
				player = new Player(PlayerClass.FIGHTER);
				break;
			case 2:
				player = new Player(PlayerClass.ASSASSIN);
				break;
			case 3:
				player = new Player(PlayerClass.TANK);
				break;
			case 4:
				player = new Player(PlayerClass.MAGE);
				break;
			case 5:
				player = new Player(PlayerClass.NONAME);
				break;
			default:
				System.out.println("La clase escogida no es valida, vuelve a intentarlo");	
			}
		}while(clasePlayer < 1 && clasePlayer > 5);
		
		gameFacade.startGame(player);
	}
}
