package exercises_6;

import java.security.SecureRandom;
import java.util.Scanner;
public class CrapsGameModification {

	static Scanner input = new Scanner (System.in);
	private static final SecureRandom randomValue = new SecureRandom();

	private static int bankBalance = 1000;
	static int wager=0;
	static int diceSum=0;


	private static final int seven = 7;
	private static final int eleven = 11;
	private static final int two = 2;
	private static final int three =3;
	private static final int twelve =12;
	
	 private enum Status {WIN, LOSE, CONTINUE}

	public static void main(String... args){

	 	System.out.printf( "\t\t\t\t%S %n%n","WELCOME TO CRAPS GAME");
	 	wager();

	}

	public static void gameMode(){

		 //diceSum = rollDices();
		Status gameStatus; int myPoint = 0;

			switch (diceSum) {
				case seven:
				case eleven:
					gameStatus = Status.WIN;
					break;
				case two:
				case three:
				case twelve:
					gameStatus = Status.LOSE;
					break;
				default:
					gameStatus = Status.CONTINUE;
					myPoint = diceSum;
					System.out.printf("You rolled a total of %d%n%nRoll Again!%n%n", diceSum);
			}
		//Display Comments while in game mode
		commentsM();

		while (gameStatus ==  Status.CONTINUE){
			System.out.println("\t\t\t Another Chance to Play!!!");
			wager();
			rollDices();
			//diceSum = rollDices();
			if (diceSum == myPoint) gameStatus = Status.WIN;
			else if (diceSum == seven) gameStatus = Status.LOSE;
		}
		if (gameStatus == Status.WIN) {
			System.out.println("\nYou Won!");
			bankBalance+=wager;
			System.out.printf("%d has been added to Bank Balance. New Bank Balance is %d%n", wager, bankBalance);
			System.out.println("Do you want to continue playing?)");
			System.out.println("Press 1 to continue or any other key to cancel.");
			int user = input.nextInt();
			if (user==1) {
				wager();
			}
			else{System.out.println("\t\t\t END OF GAME. YOU WON");}
		}

		if (gameStatus == Status.LOSE) {
			System.out.println("\nYou Lose!");
			bankBalance-=wager;
			System.out.printf("%d has been deducted from Bank Balance. New Bank Balance is %d", wager, bankBalance);
			System.out.println("Do you want to continue playing? Enter 1 to continue and 0 to cancel.");
			int user = input.nextInt();
			if (user==1) {
				if (bankBalance!=0) wager();
				else {System.out.println("Sorry. You busted!");}
			}
			else{System.out.println("\t\t\t END OF GAME. YOU LOSE");}
		}

	}

	public static int rollDices (){
		System.out.println("Enter 1 to roll Dice or press \"Ctrl+d\" to cancel");

	 	while(input.hasNext()) {
			int user = input.nextInt();
			if (user == 1) {
				int dice1 = randomValue.nextInt(6);
				int dice2 = randomValue.nextInt(6);
				diceSum = dice1 + dice2;
				System.out.printf("%nDice 1 = %d\t&\tDice 2 = %d%n%n\tDice Sum = %d%n%n", dice1, dice2, diceSum);
				gameMode();
			} else {
				System.out.println(" Incorrect! Enter 1 to roll Dice ");
				rollDices();
			}
		}
		return diceSum;
	}

	public static void wager() {
		if (bankBalance == 0) System.out.println("Sorry. You busted!");
		else {
			System.out.println("Enter a wager");
			wager = input.nextInt();
			while (wager <= bankBalance && wager > 0) {
				rollDices();
			}
			if (wager > bankBalance) {
				System.out.println("Wager greater than Bank Balance Enter Wager again");
			}
		}
	}

	public static void commentsM(){
	 	int comment = 1+randomValue.nextInt(3);
	 	switch(comment){
			case 1: System.out.println("  Oh, you're going for broke, huh?");
				break;
			case 2: System.out.println("  Aw c'mon, take a chance!");
				break;
			case 3: System.out.println("  You're up big. Now's the time to cash in your chips!");
				break; }
	 }

}