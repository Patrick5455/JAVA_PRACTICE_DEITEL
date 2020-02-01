package Algorithm_Solutions.exercises_5;
public class Factorial1_20{

	public static void main (String... args){
		
		
		 long factorial =1; int number =20; int counter1 =1;
		
		System.out.println("NUMBER!\tFACTORIAL\n");
			
			for (int counter =1; counter <=number; ++counter){
				
				factorial*= counter;
				
				System.out.printf("%d\t%,d%n", counter, factorial);

			}


	
	}


}