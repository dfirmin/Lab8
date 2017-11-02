import java.util.ArrayList;
import java.util.Scanner;

public class PlayerInfo {
	static Scanner scnr = new Scanner(System.in);
	static ArrayList<String> players = new ArrayList<String>();
	static ArrayList<Double> battingAverage = new ArrayList<Double>();
	static ArrayList<Double> sluggingAverage = new ArrayList<Double>();
	static int playerIndex;
	static boolean existingPlayer = false;

	public static void getPlayer(Scanner sncr) {


		System.out.println("1. New Player 2. Existing Player 3. Player Stats");
		String playerName = null;
		int userChoice = Validation.inputValidation();
		switch (userChoice) {
		case 1: System.out.println("Type your name");
				playerName = scnr.nextLine();
				players.add(playerName);
			break;
		case 2: System.out.println("What is your player name?");
				getplayerStats ();
				playerName = scnr.nextLine();
				if (players.indexOf(playerName) == -1){
					System.out.println("There is no such player, adding new player" + " " + playerName);
				}
				players.add(playerName);
			break;
		case 3:
			getplayerStats();
			System.out.println(players);
			System.out.println("Batting Averages: \n" + battingAverage);
			System.out.println("Sluggling Percentages:y \n" + sluggingAverage);
			String[] args = null;
			Main.main(args);
	
			break;
		default:
			System.out.println("Choose 1 2 or 3");
			}
		}
	

	
	public static void getplayerStats () {
		players.add("DeAnte"); 	battingAverage.add(10.0);	sluggingAverage.add(5.0);
		players.add("Tim");	   	battingAverage.add(-4.0);	sluggingAverage.add(-3.0);
		players.add("Jimmy");  	battingAverage.add(-200.0);	sluggingAverage.add(-40.0);
		players.add("Joe");    	battingAverage.add(-3.0);	sluggingAverage.add(-2.0);
		players.add("Tristan");	battingAverage.add(2.0);	sluggingAverage.add(1.0);
		
	}

}
