package Algorithm_Solutions.exercises_5;
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
		
		System.out.println(Math.pow(2.5,3));
		
		//3. Print the integers from 1 to 20, using a while loop and the counter variable i. Assume that the variable i has been declared, but not initialized. Print only five integers per line. [Hint: Use the calculation i % 5. When the value of this expression is 0, print a newline character; otherwise, print a tab character. Assume that this code is an application. Use the System.out.println() method to output the newline character, and use the System.out.print('\t') method to output the tab character.]
		
		int i;
		i =1;
		System.out.print("While Loop\n");
		while(i<=20){	
			 
			 if (i%5 == 0) {System.out.print("\t"); System.out.print(i); System.out.println();}
			
			else  {System.out.print("\t"); System.out.print(i);}
			
			 i++;
		}
		
		//4.Repeat part (c), using a for statement.
		System.out.print("For Loop\n");
		for (i=1; i<=20; i++){
				
			if (i%5 == 0) {System.out.print("\t"); System.out.print(i); System.out.println();}
				
			else  {System.out.print("\t"); System.out.print(i);}
		}
		
		
		
		
		
	}
}