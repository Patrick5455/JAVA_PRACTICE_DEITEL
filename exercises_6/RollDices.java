package Algorithm_Solutions.exercises_6;
import java.security.SecureRandom;
public class RollDices{

	public static void main (String... args){
		
		SecureRandom randomValues = new SecureRandom();
		
		System.out.println("Dice No\tFrequency");
		
		int frequency1=0; int frequency2 =0; int frequency3 =0; int frequency4=0; 
		int frequency5=0; int frequency6=0;
		
		for (int counter=1; counter<=600; counter++){
			
			int diceNo = 1+randomValues.nextInt(6);
			
			    switch(diceNo){
				
				case 1: 
				++frequency1;
				break;
				
				case 2: 
				++frequency2;
				break;
				
				case 3:
				++frequency3;
				break;
				
				case 4:
				++frequency4;
				break;
				
				case 5:
				++frequency5;
				break;
				
				case 6:
				++frequency6;
				break;
			}
		}
		
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
	}
}