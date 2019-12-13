//Program to find the Area of a circle

import java.util.Scanner;

public class Circle {
	public static void main(String... args){
		
		System.out.println("Kindly provide required input to calculate area of a circle");
		
		System.out.println("radius: " );
		
		Scanner userInput = new Scanner(System.in);
		
		double radius = userInput.nextInt();
		
		System.out.println("Answer: " );
	
		double answer =  3.14159*radius*radius;
		
		System.out.println("The area is " + answer);
		
		System.out.printf("The area is: %s%n", answer);


		
		
		
		
		
		
		
		
		
		
	}
}
