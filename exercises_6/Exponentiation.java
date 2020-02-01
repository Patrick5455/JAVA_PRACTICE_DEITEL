package Algorithm_Solutions.exercises_6;
import java.util.Scanner;

public class Exponentiation {
	
	static int power =1;
	
	static Scanner input = new Scanner (System.in);
	
	public static void main (String... args){
		
		integerPower(0,0);
		
		System.out.printf("Result is %,d",power);
	}
	
	public static int integerPower (int base, int exponent){
		
		base =0;
		exponent =0;
		
		System.out.println ("Enter base");
		
		base = input.nextInt();
		
		System.out.println ("Enter exponent");
		
		exponent = input.nextInt();
		
		for (int counter =1; counter<=exponent; counter++){
			
			 power*=base;
		}
		
		return power;
	}
}