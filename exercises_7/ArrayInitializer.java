package exercises_7;
public class ArrayInitializer {

	public static void main (String... args){
		
		int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.printf("%S%9S%n", "Index", "Value");
		
		for (int counter=0; counter<array.length; counter++){
			
			System.out.printf("%3d%10d%n", counter, array[counter]);
			
			
		}

	


	}

}