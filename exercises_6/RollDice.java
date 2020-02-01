package exercises_6;
import java.security.SecureRandom;
public class RollDice {

	public static void main (String... args){

		SecureRandom randomValues = new SecureRandom();
		
		//System.out.println("Counter\tDice Number");

		for (int counter=1; counter<=20; counter++){
			
			int diceNo= 1+randomValues.nextInt(6);
		
			//System.out.printf("%d\t%d%n", counter, diceNo);
			
			System.out.printf("%d", diceNo);
			
			if (counter%5==0) System.out.println("\n");
		
		}
	
	}

}