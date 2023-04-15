package Decorator;

import Characters.Player;

public class BasicEquipment implements PlayerComponent
{
	private Player player; 
	
	public BasicEquipment(Player player)
	{ 
		super();
		this.player = player;
	}
	
	public BasicEquipment()
	{
		super();
	}
	
	public String getDescription()
	{
		return this.player.toString() + "\nEquipment: ";
	}
	public void setDescription(Player player)
	{
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
