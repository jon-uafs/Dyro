package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Die1 extends Dice {
	
	BufferedImage Black1;
	BufferedImage Black2;
	BufferedImage Black3;
	BufferedImage Black4;
	BufferedImage Black5;
	BufferedImage Black6;
	final int FACE1X = 300;
	final int FACE1Y = 300;
	final int FACE2X = 0;
	final int FACE2Y = 0;
	final int FACE3X = 0;
	final int FACE3Y = 0;
	final int FACE4X = 0;
	final int FACE4Y = 0;
	final int FACE5X = 0;
	final int FACE5Y = 0;
	final int FACE6X = 0;
	final int FACE6Y = 0;
	int[] faces = new int[20];
	Random r = new Random();
	int currNumFaces = 6;
	
	
	public Die1() 
	{
		popFaceArray();
		loadImage();
	}
	
	public Die1(int face1, int face2, int face3, int face4, int face5, int face6 ) 
	{
		this.faces[0] = face1;
		this.faces[1] = face2;
		this.faces[2] = face3;
		this.faces[3] = face4;
		this.faces[4] = face5;
		this.faces[5] = face6;
	}
	
	@Override
	public void popFaceArray()
	{
		for(int i = 0; i < this.faces.length; i++) 
		{
			this.faces[i] = i;
		}
		
	}
	
	public int roll(int[] faces) 
	{
		int randomFace = r.nextInt(20);
		
		int result = faces[randomFace];
		
		return result;
		
	}
	
	@Override
	public void loadImage() {
		File imageFile1 = new File("images/Black1.png");
		File imageFile2 = new File("images/Black2.png");
		File imageFile3 = new File("images/Black3.png");
		File imageFile4 = new File("images/Black4.png");
		File imageFile5 = new File("images/Black5.png");
		File imageFile6 = new File("images/Black6.png");
		try {
			this.Black1 = ImageIO.read(imageFile1);
			this.Black2 = ImageIO.read(imageFile2);
			this.Black3 = ImageIO.read(imageFile3);
			this.Black4 = ImageIO.read(imageFile4);
			this.Black5 = ImageIO.read(imageFile5);
			this.Black6 = ImageIO.read(imageFile6);
			
		} catch (IOException e) {
			System.out.println("Could not find an image/sprite");
			e.toString();
		
		}

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(this.Black1,this.FACE1X,this.FACE1Y,null);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFace1(int faceNum) {
		this.faces[0] = faceNum;		
	}

	@Override
	public int getFace1() {
		return this.faces[0];
	}

	@Override
	public void setFace2(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace3(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace4(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace4() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace5(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace5() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace6(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace6() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace7(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace7() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace8(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace8() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace9(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace9() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace10(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace10() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace11(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace11() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace12(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace12() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace13(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace13() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace14(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace14() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace15(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace15() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace16(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace16() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace17(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace17() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace18(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace18() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace19(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace19() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFace20(int faceNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFace20() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main (String[] args) 
	{
		//Dice1 dice1 = new Dice1();
		//System.out.println(dice1.roll(dice1.faces));
	}
	
}
