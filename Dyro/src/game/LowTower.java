package game;

import java.util.Scanner;

public class LowTower {
	
	Scanner keyPress = new Scanner(System.in);
	Player protag = new Player(200);
	Player villain = new Player(100);
	Die1 die1 = new Die1();
	
	boolean levelComplete = false;
	boolean win = false;
	
	public boolean completeCheck() {
		if (this.villain.health_ <= 0) {
			this.win = true;
			return true;
		} else if (this.protag.health_ <= 0) {
			this.win = false;
			return true;
		}
		return false;
	}
	
	public void waitForEnter(String message) {
		if (message != null) {
			System.out.println(message);
		}
		keyPress.nextLine();
	}
	
	public void run() {
		int rollResult;
		int roundCounter = 1;
		
		while (!this.levelComplete) {
			System.out.println("Player health: " + protag.health_);
			System.out.println("Villain health: " + villain.health_);
			System.out.println("Player rolls the die!");
			waitForEnter("Please press enter...");
			
			rollResult = die1.roll(die1.faces);
			System.out.println("Roll result: " + rollResult);
			waitForEnter("Please press enter...");
			
			villain.health_ -= rollResult;
			System.out.println("New Villain health: " + villain.health_);
			waitForEnter("Please press enter...");
			
			if (completeCheck()) {
				this.levelComplete = true;
				break;
			}
			
			System.out.println("Now the villain rolls the die!");
			rollResult = die1.roll(die1.faces);
			System.out.println("Roll result: " + rollResult);
			waitForEnter("Please press enter...");
			
			protag.health_ -= rollResult;
			System.out.println("End of round " + roundCounter);
			roundCounter++;
			
			this.levelComplete = completeCheck();
		}
		
		if (this.win) {
			System.out.println("You defeated the villain!");
		} else {
			System.out.println("You were defeated!");
		}
	}
	
	public static void main(String[] args) {
		LowTower lowTower = new LowTower();
		lowTower.run();
	}
}