package Algorithm_Solutions.exercises_4;
public class Chapter5Statements{
	
	public static void main (String... args){
		
		//1. Sum the odd integers between 1 and 99, using a for statement. Assume that the integer variables sum and count have been declared.
		int sum;
		int count;
		int total =0;
		
		for (sum = 1, count =0; sum <=100; sum+=2, count++){
			total +=sum;
		}
		System.out.println("Total is " + total);
		
		//2. Calculate the value of 2.5 raised to the power of 3, using the pow method.
		
		Math.pow(2.5,3);
		
	}
}