package classworks_assignments;
import java.util.Scanner;

public class FourLargestNumber {
	
	public static void main (String... args){
		
		int counter = 1; int number = 0; int largestNumber =0;
	
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter value. To cancel input and get the largest number, press \"Ctrl+z\"");
		
		System.out.printf("Enter no %d%n", counter);
		number = input.nextInt();
		if (number > largestNumber) largestNumber = number;

		while(counter<4){
		
			counter++;
			
			System.out.printf("Enter no %d%n", counter);
			
			number = input.nextInt();
			if (number > largestNumber) largestNumber = number;
	
		}
		if (counter == 4)
		System.out.println ("Largest number is " + largestNumber);

		else System.out.println ("inputs are larger or lesser than ten");
	}

}
