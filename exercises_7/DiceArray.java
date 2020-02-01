package Algorithm_Solutions.exercises_7;
import java.security.SecureRandom;

public class DiceArray {

	 public static void main (String... args){
	 
		SecureRandom randomNumbers = new SecureRandom();
		 
		int [] frequency = new int [7];

		for (int rollDice =1; rollDice<=600; rollDice++)
			++frequency[1+randomNumbers.nextInt(6)];
		
		System.out.printf("%s%10s%n", "Dice Face", " Frequency");
		
		for (int diceFace=1; diceFace<frequency.length; diceFace++)
			System.out.printf("%5d%9d%n", diceFace,frequency[diceFace]);
	 }
}