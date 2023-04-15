package Decorator;

public interface PlayerComponentDecorator extends PlayerComponent
{
	public PlayerComponent getRewardComponent();
	public void setRewardComponent(PlayerComponent playerComponent);
}
