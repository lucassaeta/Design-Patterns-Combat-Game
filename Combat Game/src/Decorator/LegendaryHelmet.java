package Decorator;

import Characters.Player;

public class LegendaryHelmet implements PlayerComponentDecorator
{
	PlayerComponent playerComponent;
	
	public LegendaryHelmet(PlayerComponent playerComponent)
	{
		this.playerComponent = playerComponent;
		this.playerComponent.getPlayer().setShield(this.playerComponent.getPlayer().getShield()+10);
	}
	
	public String getDescription()
	{
		return this.playerComponent.getDescription() + ", Legendary Helmet";
	}

	public PlayerComponent getRewardComponent()
	{
		return this.playerComponent;
	}

	public void setRewardComponent(PlayerComponent playerComponent)
	{
		this.playerComponent = playerComponent;
	}
	
	public Player getPlayer()
	{
		return this.playerComponent.getPlayer();
	}
	
}
