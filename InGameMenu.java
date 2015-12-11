import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

//Haseeb Saadut

public class InGameMenu
{
	public int Score;
    
	public InGameMenu()
	{
    	Score = getScore();
	}
    
	public int getScore() {
    	return Score;
	}

	public void setScore(int score) {
    	Score = score;
	}

	private File f;
	public void saveGame()
	{
    	String playerName = Player.getPlayername();
    	f = new File(playerName + " -Game.txt");
	{
        	int a = Player.getHealthPoints();
        	int b = Player.getAttackPoints();
        	int c = Player. getDefensePoints();
        	int d = Player.getSpeedPoints();
        	String e = Player.getPlayername();
        	String f = Rooms.roomDescription;
        	//int g = Rooms.getRoomCode();
        	//String h = Inventory.printInventory();
       	 
        	System.out.println("Saving " + e + " game...");
        	System.out.println("Saving " + a + " HP");
        	System.out.println("Saving " + b + " ATK");
        	System.out.println("Saving " + c + " DEF");
        	System.out.println("Saving " + d + " Speed");
        	
    	}
	}

	public void quitGame()
	{
    	new GameSystem().quitGame();
	}

	public void increaseScore(int n)
	{
    	Score+=n;
	}

	public void decreaseScore(int n)
	{
    	Score-=n;
	}

	public void multiplyScore()
	{
   	 
	}

	public void getHelp()
	{
    	new GameSystem().howToPlay();
	}

public static void main(String args[])
	{    
   	 Player j = new Player("John");
    	new InGameMenu().saveGame();
	}
}
