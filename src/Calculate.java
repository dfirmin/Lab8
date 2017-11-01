import java.util.ArrayList;
import java.util.Scanner;

public class Calculate {

	public static int getBatNum(Scanner scnr) {
		System.out.println("How many times would you like to bat?");
		return scnr.nextInt();

	}

	public static ArrayList<Integer> swing(int num) {
		ArrayList<Integer> results = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			results.add((int) (0 + (double) (Math.random() * 4)));
			System.out.println("Result for at-bat " + i + ":" + " " + results.get(i));

		}
		return results;
	}

	public static void battingAverage(ArrayList<Integer> results) {
		double totalForBat = 0;
		double totalForSlug = 0;
		double average = 0.0;
		double percentage = 0.0;
		if (PlayerInfo.existingPlayer) {
			for (double bat : results) {
				if (bat > 0) {
					totalForBat += bat;
				} else {
					totalForSlug += bat;
				}
			}
			average = totalForBat / results.size();
			PlayerInfo.battingAverage.set(PlayerInfo.playerIndex,average);
			percentage = totalForSlug / results.size();
			PlayerInfo.sluggingAverage.set(PlayerInfo.playerIndex,percentage);
			System.out.println("Batting average:" + " " + average);
			System.out.println("Slugging Percentage:" + " " + percentage);
			
		} else {
			for (double bat : results) {
				if (bat > 0) {
					totalForBat += bat;
				} else {
					totalForSlug += bat;
				}
			}
			average = totalForBat / results.size();
			PlayerInfo.battingAverage.add(average);
			percentage = totalForSlug / results.size();
			PlayerInfo.sluggingAverage.add(percentage);
			System.out.println("Batting average:" + " " + average);
			System.out.println("Slugging Percentage:" + " " + percentage);
	}
	}
}
