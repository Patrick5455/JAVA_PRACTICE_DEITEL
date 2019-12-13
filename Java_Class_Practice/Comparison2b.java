import java.util.Scanner;

public class Comparison2b{
	
	public static void main (String... args){
		
		int largest = 0; 
		//int currentPosition = 0;
		int smallest = 0;
		
		System.out.println("Enter First Number");
		
		Scanner input = new Scanner (System.in);
		
		int num1 = input.nextInt();
	
		System.out.println ("Enter Second Number");
	
		int num2 = input.nextInt();
	
		System.out.println ("Enter Third Number");
	
		int num3 = input.nextInt();
		
		int product = num1*num2*num3;
		int sum = num1 + num2 + num3;
		int average = sum/3;
		
		
		 if (num1 > largest) {
			 largest = num1;
			 smallest = num1;
			 //currentPosition +=1; 
			 
		}
		
		//else if (num1  smallest){
			smallest = num1;
		//}
		
		if (num2 > largest) {
			largest = num2;
			//currentPosition +=1;
		}
		
		else if (num2 < smallest ){
			smallest = num2;
		}
		
		if (num3 > largest) {
			largest = num3;
			//currentPosition +=1;
		}
		
		else if (num3 < smallest) {
			smallest = num3;
		}
		
		
		System.out.printf("%d is the largest number, %d is the smallest number, %d is the product, %d is the sum and %d is the average", largest, smallest, product, sum, average);
	}
	
}
		
	
	