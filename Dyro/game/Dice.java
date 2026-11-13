package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Dice {
	BufferedImage image;
	final int DICE_X = 640;
	final int DICE_Y = 540;
	
	
	private int face1_;
	private int face2_;
	private int face3_;
	private int face4_;
	private int face5_;
	private int face6_;
	
	
	
	public Dice() 
	{
		face1_ = 1;
		face2_ = 2;
		face3_ = 3;
		face4_ = 4;
		face5_ = 5;
		face6_ = 6;
		
	}
	
	public Dice(int face1, int face2, int face3, int face4, int face5, int face6 ) 
	{
		face1_ = face1;
		face2_ = face2;
		face3_ = face3;
		face4_ = face4;
		face5_ = face5;
		face6_ = face6;
		
	}
	
	public void update() {
	
		
	}

	public void render(Graphics g) {
		g.drawImage(this.image,this.DICE_X,this.DICE_Y,null);
		
	}
	
	
	

}
