package classworks_assignments;
import java.util.Scanner;

public class ClassWork1{
	
	
	public static void main (String... args){
		
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Input First No");
		
		int num1 = userInput.nextInt();
		
		System.out.println("Input Second No");
		
		int num2 = userInput.nextInt();
		
		System.out.println("Input Third No");
		
		int num3 = userInput.nextInt();
		
		int result = num1 + num2;
		
		if (result > num3){
			System.out.println ("Result");
		}
		
		if (result < num3){
			System.out.println ("Third");
		}
		
		
	}
}