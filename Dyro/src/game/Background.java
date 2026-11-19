package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Background {
		
	BufferedImage image;
	
	final String towers = "images/Background.png";
	final int BGX = 0;
	final int BGY = 0;
	
	public Background() 
	{
		loadImage();
	}
	
	public void update() {
	
		
	}

	public void render(Graphics g) {
		g.drawImage(this.image,this.BGX,this.BGY,null);
		
	}
	
	public void loadImage() {
		File imageFile = new File(towers);
		try {
			this.image = ImageIO.read(imageFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
