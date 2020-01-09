package classworks_assignments;
import java.util.Scanner;

public class Even_Odd{
	
	public static void main (String... args){
	
	System.out.println("Enter number");
	
	Scanner input = new Scanner (System.in);
	
	int number = input.nextInt();
	
	if (number % 2 != 0){
		System.out.println("Odd Number");
	}
	
	//if (number % 2 == 0) {
	else{
		System.out.println ("Even Number");
	}
	}
}