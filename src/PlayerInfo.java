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

		System.out.println("Are you a new player?(y/n) Type \"stats\" to view player stats");
		String yesNo = scnr.next();
		scnr.nextLine();
		String playerName = null;
		
		
		if (yesNo.equals("y")) {
			System.out.println("Type your name");
			playerName = scnr.nextLine();
			players.add(playerName);
		}
		else if(yesNo.equals("n")){
			System.out.println("What is your player name?");
			getplayerStats ();
			playerName = scnr.nextLine();
			if (players.indexOf(playerName) == -1){
				System.out.println("There is no such player");
			}
			else {
				existingPlayer = true;
				playerIndex = players.indexOf(playerName);
			}
			
			
		}
		else if(yesNo.equals("stats")) {
			System.out.println("Would you like to see player stats?");
			yesNo = scnr.nextLine();
			if (yesNo.equals("y")) {
				getplayerStats();
				System.out.println(players);
				System.out.println("Batting Averages: \n" + battingAverage);
				System.out.println("Stuggling Percentages:y \n" + sluggingAverage);
			}
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
