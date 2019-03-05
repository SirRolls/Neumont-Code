package programController;

import gameControllers.Heaven;
import gameControllers.Hell;
import lib.ConsoleIO;

public class Manager {
	
	private boolean isMultiplayer;
	private Hell singPlayerHell;
	private Hell multiPlayerHell;
	private Heaven multiPlayerHeaven;
	
	public static void initiateHM() {
		int difficulty;
		String [] options = {"Easy","Medium","Hard"};
		difficulty = ConsoleIO.promptForMenuSelection("Please select a difficulty: ", options, false);
		Hell h = new Hell(difficulty);
		
		System.out.println(h.toString());
		
	}
	
	private static void multiplayerSelection() {
		
		
		
	}
	
	private static void singlePlayer() {
		
		
		
	}
	
	private static void multiPlayer() {
		
		
		
	}
	
}
