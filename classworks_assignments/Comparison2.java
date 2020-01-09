package classworks_assignments;
import java.util.Scanner;

public class Comparison2{
	
	public static void main (String... args){
	
	System.out.println("Enter First Number");
	
	Scanner input = new Scanner (System.in);
	
	int num1 = input.nextInt();
	
	System.out.println ("Enter Second Number");
	
	int num2 = input.nextInt();
	
	System.out.println ("Enter Third Number");
	
	int num3 = input.nextInt();
	
	if (num1 > num2 && num1 > num3){
		System.out.printf ( "%d - first poition", num1);
	}
	
	if (num2 > num1 && num2 > num3){
		System.out.printf ( "%d - second position", num2);
	}
	
	if (num3 > num2 && num3 > num1){
		System.out.printf( "%d - third position", num3);
	}
		
		
	
	}
}