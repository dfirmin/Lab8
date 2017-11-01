import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// TODO Auto-generated method stub
		boolean continueApp = true;
		String yesNo;
		System.out.println("Welcome to Batting Average Calculator!");
		

		while (continueApp) {
			PlayerInfo.getPlayer(scnr);
			int batCount = Calculate.getBatNum(scnr);
			System.out.println("0= out, 1=single, 2=double, 3=triple, 4=home run");
			Calculate.battingAverage(Calculate.swing(batCount));
			
			System.out.println("Another batter? (y/n):");
			yesNo = scnr.next();
			if (yesNo.equals("n")) {
				System.out.println("App closed.");
				continueApp = false;
				scnr.close();
			}
		}

	}

}
