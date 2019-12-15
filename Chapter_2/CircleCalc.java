import java.util.Scanner;
public class CircleCalc{
	
	public static void main (String... args){
		
		System.out.println ("Enter Radius Value");
		
		Scanner input = new Scanner (System.in);
		
		int r = input.nextInt();
		
		System.out.printf ("The diameter is %s%n", 2*r);
		
		System.out.printf ("The Circumference is %s%n", 2*Math.PI*r);
		
		System.out.printf ("The area is %s%n", 2*Math.PI*r*r);
		
	}
}