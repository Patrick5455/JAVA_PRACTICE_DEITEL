package exercises_4;
import java.util.Scanner;
public class LargestNumber{
	
	public static void main (String... args){
		
		int counter = 1; int number = 0; int largestNumber =0;
	
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter value. To cancel input and get the largest number, press \"Ctrl+z\"");
		
		System.out.printf("Enter no %d%n", counter);
		
		while(input.hasNext()){
		
			counter++;
			
			System.out.printf("Enter no %d%n", counter);
			
			number = input.nextInt();
			
			if (number > largestNumber) largestNumber = number;
	
		}
		if (counter == 11)
		System.out.println ("Largest number is " + largestNumber);
	
		else System.out.println ("inputs are larger or lesser than ten");
	}

}
