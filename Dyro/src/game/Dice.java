package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Dice {
	BufferedImage image1;
	BufferedImage image2;
	BufferedImage image3;
	BufferedImage image4;
	BufferedImage image5;
	BufferedImage image6;
	final int DICE_X = 0;
	final int DICE_Y = 0;
		
	public Dice() 
	{
				
	}
	
	public Dice(int face1, int face2, int face3, int face4, int face5, int face6 ) 
	{
		
	}
	
	public abstract void popFaceArray();
	
	public abstract int roll(int[] faces);
	
	public abstract void update();

	public abstract void render(Graphics g);
	
	public abstract void loadImage();
	
	
	public abstract void setFace1(int faceNum);
	public abstract int getFace1();
	public abstract void setFace2(int faceNum);
	public abstract int getFace2();
	public abstract void setFace3(int faceNum);
	public abstract int getFace3();
	public abstract void setFace4(int faceNum);
	public abstract int getFace4();
	public abstract void setFace5(int faceNum);
	public abstract int getFace5();
	public abstract void setFace6(int faceNum);
	public abstract int getFace6();
	public abstract void setFace7(int faceNum);
	public abstract int getFace7();
	public abstract void setFace8(int faceNum);
	public abstract int getFace8();
	public abstract void setFace9(int faceNum);
	public abstract int getFace9();
	public abstract void setFace10(int faceNum);
	public abstract int getFace10();
	public abstract void setFace11(int faceNum);
	public abstract int getFace11();
	public abstract void setFace12(int faceNum);
	public abstract int getFace12();
	public abstract void setFace13(int faceNum);
	public abstract int getFace13();
	public abstract void setFace14(int faceNum);
	public abstract int getFace14();
	public abstract void setFace15(int faceNum);
	public abstract int getFace15();
	public abstract void setFace16(int faceNum);
	public abstract int getFace16();
	public abstract void setFace17(int faceNum);
	public abstract int getFace17();
	public abstract void setFace18(int faceNum);
	public abstract int getFace18();
	public abstract void setFace19(int faceNum);
	public abstract int getFace19();
	public abstract void setFace20(int faceNum);
	public abstract int getFace20();

}
