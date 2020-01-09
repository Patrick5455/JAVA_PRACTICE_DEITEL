package exercises_5;
import java.util.Scanner;
public class SmallestValue{

	public static void main (String... args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println ("\nEnter whole numbers\n\nTo cancel program press \"Ctrl+z\" on windows keyboard or \"Ctrl+d\" on linux/macOS/unix keyboard\n");
		
		int number; int counter =0; int smallest;
		
		//collect first number as smallest
		number = input.nextInt(); smallest = number;
		
		while(input.hasNext()){
			
			number = input.nextInt();
			
			//store smaller numbers as smallest
			if (number < smallest) smallest = number;
		
			++counter;
		}
		
		System.out.println("Smallest Value is "+ smallest);
	}
}