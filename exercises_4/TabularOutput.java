package Algorithm_Solutions.exercises_4;
public class TabularOutput{

	public static void main (String... args){

		int counter = 1;
		
		 System.out.println("N	10*N	100*N	1000*N");

		while (counter <=5 ){

			 int ten      = 10*counter;
			 int hundrend = 100*counter;
			 int thousand = 1000*counter;
			 
			 System.out.printf("%d	%d	%d	%d%n", counter, ten, hundrend, thousand);
			 
			 counter++;
			 
		}

	}


}