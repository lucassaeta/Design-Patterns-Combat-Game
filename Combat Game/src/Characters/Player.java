package Characters;
import Decorator.BasicEquipment;
import Decorator.PlayerComponent;
import Decorator.PlayerComponentDecorator;
import State.GameState;
import State.GameStateProcess;

public class Player
{
	private PlayerClass playerClass;
	private int power;
	private int strength;
	private int shield;
	private int wisdom;
	private int agility;
	private int XP;
	private int level;
	
	private PlayerComponent basicEquipment;
	
	private GameState playerState;
	
	public Player()
	{
		this.playerClass = PlayerClass.FIGHTER;
		this.setStats();
	}
	
	public Player(PlayerClass playerClass)
	{
		this.playerClass = playerClass;
		this.setStats();
	}
	
	public String toString()
	{
		return this.playerClass.toString() + this.printStats();
	}
	
	public String printStats()
	{
		return "\nPower: " + power + "\nStrength: " + strength + "\nShield: " + shield;
	}
	
	private void setStats()
	{
		this.power = playerClass.getClassPlayer()[0];
		this.strength = playerClass.getClassPlayer()[1];
		this.shield = playerClass.getClassPlayer()[2];
		this.wisdom = playerClass.getClassPlayer()[3];
		this.XP = playerClass.getClassPlayer()[4];
		this.XP = 0;
		this.level = 1;
		this.basicEquipment = new BasicEquipment(this);
	}
	
	public PlayerClass getPlayerClass() {
		return playerClass;
	}
	public void setPlayerClass(PlayerClass playerClass) {
		this.playerClass = playerClass;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getShield() {
		return shield;
	}
	public void setShield(int shield) {
		this.shield = shield;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getXP() {
		return XP;
	}
	public void setXP(int experience) {
		this.XP = experience;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	
	public GameState getPlayerState() {
		return playerState;
	}

	public void setPlayerState(GameState currentGameState) {
		this.playerState = currentGameState;
	}
	
	public int attack()
	{
		return this.power;
	}
	public void defend()
	{
		this.setShield(this.getShield()+10);
	}
	public void heal()
	{
		this.strength += 20;
	}
	
	public void setEquipment(PlayerComponentDecorator playerComponentDecorator)
	{
		this.basicEquipment = playerComponentDecorator;
	}
	public PlayerComponent getEquipment()
	{
		return this.basicEquipment;
	}
}
