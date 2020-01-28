package Algorithm_Solutions.exercises_4;
import java.util.Scanner;
public class TwoLargestNumber{
	
	public static void main (String... args){
		
		int counter = 1; int number = 0; int firstLargestNumber =0; int secondLargestNumber =0;
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter value. To cancel input and get the largest numbers, press \"Ctrl+z\"\n");
				
	System.out.printf("Enter no %d%n", counter);
	
		while(input.hasNext()){

			counter++;
				
			System.out.printf("Enter no %d%n", counter);
	
	
			number = input.nextInt();
			
			if (number > secondLargestNumber && number > firstLargestNumber) {	
				secondLargestNumber = firstLargestNumber;
				firstLargestNumber = number;}
			
			 if (number > secondLargestNumber && number < firstLargestNumber) {
				secondLargestNumber = number;
				firstLargestNumber = firstLargestNumber;
				
			}
			
		}
		
		if (counter == 11) System.out.printf ("Largest numbers are %d  & %d %n ", firstLargestNumber, secondLargestNumber);
		
		else System.out.print("input are largeer or lesser than 10");
		
	}
	
	

}