import java.util.Scanner;

public class Chapter2Exercises{
	
	
	public static void main(String... args){
		
		//1.
		int c = 0;
		int thisIsAVariable =0;
		int q76354 =0;
		
		//2.
		System.out.println ("Enter an Integer");
		//3. 
		Scanner input = new Scanner (System.in);
		int value = input.nextInt();
		
		//4.
		System.out.println ("This is a java program");
		//5. 
		System.out.printf ("%s%n%s%n", "This is a java", "program");
		//6. 
		if (value != 7){
			System.out.println ("The variable number is not equal to 7");
		}
		
		//7.
		/*Identify and correct the errors in each of the following statements:
		1. if (c < 7); { System.out.println("c is less than 7"); }
		2. if (c => 7) { System.out.println("c is equal to or greater than 7"); }*/
		
		if (c < 7) { System.out.println("c is less than 7"); }
		
		if (c >= 7) { System.out.println("c is equal to or greater than 7"); }
				
		
				
	}



}