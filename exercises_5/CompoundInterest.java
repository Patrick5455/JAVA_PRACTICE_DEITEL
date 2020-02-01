package Algorithm_Solutions.exercises_5;
import java.util.Scanner;
public class CompoundInterest{

	public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
		
		double compound;
		double amount = 0;
		double rate =0;
		int years =0;
	
	for (int x = 1; x<=years; x++ ){
			
		double interest = amount*(rate);
		 amount = amount + interest;
		
		System.out.println(amount);
		
		
		}
		
		
		
		
	
	
	
	}
}