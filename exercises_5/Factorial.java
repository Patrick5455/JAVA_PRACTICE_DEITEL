package Algorithm_Solutions.exercises_5;
import java.util.Scanner;
public class Factorial{
	
	public static void main (String... args){
		
//1st Method
		int factorial =1; int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no for method 1");
		
		number = input.nextInt();

		while (number>=1){

			factorial*=number; 
			number--;
		}
		
		System.out.println( "Method1 "+ factorial);
	
//2nd Method	

	int counter =1; int factorial1 =1; int number1;
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter no for method 2");
			
			number1 = input1.nextInt();
			
		while(counter <=number1){
			
			factorial1*= counter;
			
			counter++;
		}
		
		System.out.println( "Method2 "+factorial1);
				
	}
		
		
}