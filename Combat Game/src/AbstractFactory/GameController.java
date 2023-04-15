package AbstractFactory;

import java.util.ArrayList;
import Characters.Player;
import Characters.Enemies.Enemy;
import Combat.CombatGestion;
import Decorator.FireSword;
import Decorator.LegendaryHelmet;
import Worlds.World;

public class GameController { 

	private static GameController gameController = new GameController();
	
	AbstractEnemyFactory abstractEnemyFactory;

	AbstractEnemyFactory abstractEnemyFactoryLvl1 = new EnemyLvl1Factory();
	AbstractEnemyFactory abstractEnemyFactoryLvl2 = new EnemyLvl2Factory();
	AbstractEnemyFactory abstractEnemyFactoryLvl3 = new EnemyLvl3Factory();
	
	ArrayList <Enemy> Level1 = new ArrayList<Enemy>(); //array de enemigos en cada mundo
	ArrayList <Enemy> Level2 = new ArrayList<Enemy>();
	ArrayList <Enemy> Level3 = new ArrayList<Enemy>();
	
	private GameController()
	{	
		this.abstractEnemyFactory= abstractEnemyFactoryLvl1;
	}
	    
	public static GameController getInstance()
	{
		return gameController;
	}
	
	public AbstractEnemyFactory getAbstractEnemyFactory()
	{
		return abstractEnemyFactory;
	}
	
	public void setAbstractEnemyFactory(AbstractEnemyFactory abstractEnemyFactory)
	{
		this.abstractEnemyFactory = abstractEnemyFactory;
	}
	
	public Enemy createBeast()
	{
		return this.abstractEnemyFactory.createBeast();
	}
	
	public Enemy createSorcerer()
	{
		return this.abstractEnemyFactory.createSorcerer();
	}
	
	public Enemy createWarrior()
	{	
		return this.abstractEnemyFactory.createWarrior();
	}
	
	public void createLevels()
	{
		Level1.add(this.abstractEnemyFactoryLvl1.createWarrior());
		Level1.add(this.abstractEnemyFactoryLvl1.createSorcerer());
		Level1.add(this.abstractEnemyFactoryLvl1.createBeast());
		
		Level2.add(this.abstractEnemyFactoryLvl2.createWarrior());
		Level2.add(this.abstractEnemyFactoryLvl2.createSorcerer());
		Level2.add(this.abstractEnemyFactoryLvl2.createBeast());
		
		Level3.add(this.abstractEnemyFactoryLvl3.createWarrior());
		Level3.add(this.abstractEnemyFactoryLvl3.createSorcerer());
		Level3.add(this.abstractEnemyFactoryLvl3.createBeast());
	}
	
	public void play(CombatGestion combat)
	{
		int numLevel = 1;
		
		this.createLevels();
		
		while(combat.getPlayer().getStrength()>0 && numLevel<4)
		{
			System.err.print("VAS A EMPEZAR EL MUNDO ");
			if(numLevel == 1)
				System.err.println(World.EVERFROST.toString());
			else if(numLevel == 2)
				System.err.println(World.FORGOTTEN_MOUNTAIN.toString());
			else
				System.err.println(World.RUINED_CASTLE.toString());
			
			for(int i = 0; i < 3; i++)
			{
				if(numLevel == 1) {
					combat.setEnemy(Level1.get(i));
				}else if(numLevel == 2) {
					combat.setEnemy(Level2.get(i));
				}else {
					combat.setEnemy(Level3.get(i));
				}
				
				combat.combat();
				
				if(combat.getPlayer().getStrength()<=0) {
					break;
				}
			}
			
			//DECORATOR PATTERN
			if(combat.getPlayer().getStrength()>0)
			{
				if(numLevel == 1)
				{
					System.err.println("HAS RECIBIDO LA ESPADA DE FUEGO!!!");
					combat.getPlayer().setEquipment(new FireSword(combat.getPlayer().getEquipment()));
				}else if(numLevel == 2)
				{
					System.err.println("HAS RECIBIDO EL CASCO LEGENDARIO!!!");
					combat.getPlayer().setEquipment(new LegendaryHelmet(combat.getPlayer().getEquipment()));
				}
			}
			numLevel++;
		}
	}
}








