package Algorithm_Solutions.exercises_2;
import java.util.Scanner;
public class Digit5{
	
	public static void main(String... args){
		
		System.out.println("Enter Five Digit Number");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		if (number/10000==0){
			System.out.println("Number lesser than five");
		}
		else{
			if (number > 99_999){
			System.out.println("Number greater than five");
			}
			
			else{
				
			int num1 = (number/10000);
			int num2 = (number/1000)%10;
			int num3 = (number/100)%10;
			int num4 = (number/10)%10;
			int num5 = (number/1)%10;
			System.out.printf("%S%S%S%S%S%S%S%S%S",num1,"   ",num2,"   ",num3, "   ",num4,"   ",num5);
		
			}	
		}
			
	}
}