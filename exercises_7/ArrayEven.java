package Algorithm_Solutions.exercises_7;
public class ArrayEven{

	
	public static void main (String... args) {

		final int ARRAY_LENGTH =10;
		
		int [] array = new int [ARRAY_LENGTH];
		
		System.out.printf("%S%8S%n", "Index", "Value");
		
		for (int counter =0; counter < array.length; counter++){
			
			array[counter] = 2+2*counter;
			
			System.out.printf("%5d%8d%n", counter, array[counter]);
			
		}
		
		
	}


}