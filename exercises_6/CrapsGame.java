package exercises_6;

import java.security.SecureRandom;
public class CrapsGame{
	
	private static final SecureRandom randomValue = new SecureRandom();

	private static final int seven = 7;
	private static final int eleven = 11;
	private static final int two = 2;
	private static final int three =3;
	private static final int twelve =12;
	
	 private enum Status {WIN, LOSE, CONTINUE}

	public static void main(String... args){

	 	int diceSum = rollDices(); Status gameStatus; int myPoint =0;

		switch (diceSum){
			case seven: case eleven:
			gameStatus = Status.WIN;
			break;
			
			case two: case three: case twelve:
			gameStatus=Status.LOSE;
			break;
			
			default:
			gameStatus= Status.CONTINUE; myPoint = diceSum;
			System.out.printf("You rolled a total of %d%n%nRoll Again!%n%n", diceSum);
		}
		
		while (gameStatus ==  Status.CONTINUE){
			diceSum = rollDices();
			if (diceSum == myPoint) gameStatus = Status.WIN;
			else if (diceSum == seven) gameStatus = Status.LOSE;
		}

		if (gameStatus == Status.WIN) System.out.println("\nYou Won!");
		if (gameStatus == Status.LOSE) System.out.println("\nYou Lose!");
	}

	public static int rollDices (){
		int dice1 = randomValue.nextInt(6);
		int dice2 = randomValue.nextInt(6);
		int sum = dice1+dice2;
		
		System.out.printf("%nDice 1 = %d\t&\tDice 2 = %d%n%n\tDice Sum = %d%n%n", dice1, dice2, sum);
		return sum;
	}
}