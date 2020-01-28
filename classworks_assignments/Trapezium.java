package Algorithm_Solutions.classworks_assignments;
import java.util.Scanner;


public class Trapezium{
	
	
	public static void main(String... args){
		
		System.out.println("This program helps users find area of a Trapezium (A=1/2(a+b)h)");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Area: ");
		
		int area = userInput.nextInt();
		
		System.out.println("Breadth: ");
		
		int breadth = userInput.nextInt();
		
		System.out.println("Height: ");
		
		int height = userInput.nextInt();
		
		double trapeziumArea = 0.5*(area + breadth)*height;
		
		System.out.println("The result is: " + trapeziumArea +" cm sq");
		
		System.out.printf("The result is: %s%n", trapeziumArea);
			
		
		

		
		
		
		
	}
}