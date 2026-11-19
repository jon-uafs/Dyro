package game;

public class Player {
	
	int health_ = 100;
	
	public Player() 
	{
		this.health_ = 100;
	}
	
	public Player(int health) 
	{
		this.health_ = health;
	}
	
	public void setHealth(int health) 
	{
		this.health_ = health;
	}
	
	public int getHealth() 
	{
		return this.health_;
	}

}