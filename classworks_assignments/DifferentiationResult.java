package classworks_assignments;
import java.util.Scanner;

public class DifferentiationResult{

	public static void main(String... args){
	
	Differentiation obj = new Differentiation();
	
	System.out.println("Enter a number");
	
	Scanner input = new Scanner (System.in);
	
	int number = input.nextInt();
	
	obj.setCoefPower(number);
	
	System.out.printf("The result is %dXr%d", obj.getCoef(), obj.getPower());
	}
	
}