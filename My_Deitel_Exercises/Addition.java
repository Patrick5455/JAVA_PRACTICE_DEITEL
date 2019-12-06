import java.util.Scanner;
public class Addition{
	
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int userInput1 = userInput.nextInt();
		
		System.out.print("Enter Second Integer: ");
		int userInput2 = userInput.nextInt();
		
		int userInputSum = userInput1 + userInput2;
		System.out.println("Sum = " + userInputSum);
		
		System.out.printf("Sum is %d%n", userInputSum);
		
		System.out.printf("Sum is %s%n", userInputSum);
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
