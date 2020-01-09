package exercises_7;
import java.util.Arrays;
public class ClassArray{
	
	public static void main (String... args){
		
		int [] array = {9,1,8,2,7,3,6,4,5};

	//Sort Array
		Arrays.sort(array);
		System.out.println("Array Values");
		for (int counter =0; counter<array.length; counter++)
			System.out.printf("%d", array[counter]);
			System.out.println("\n\n");
		
		//Copy Array
		int [] arrayCopy = new int [array.length];
		
		System.arraycopy(array,0,arrayCopy,0,array.length);
		
		System.out.println("ArrayCopy Values");
		for (int counter =0; counter<arrayCopy.length; counter++)
			System.out.printf("%d", arrayCopy[counter]);
			System.out.println("\n\n");
		
		
		//Fill Array
		int [] array1 = new int [10];
		Arrays.fill(array1,7);
		
		System.out.println("Array1 Values");
		for (int counter =0; counter<array1.length; counter++)
			System.out.printf("%d", array1[counter]);
			System.out.println("\n\n");
		
		
		
		//Search Array
		
		int arr = Arrays.binarySearch(array,23);
		
		if (arr>=0) System.out.printf("Value 23 is located in index %d of Arrays %n",arr);
		
			else System.out.println("Value 23 does not exist\n");
			
		arr = Arrays.binarySearch(array,4);
		
		if (arr>=0) System.out.printf("Value 4 is located in index %d of Arrays%n%n",arr);
		
			else System.out.println("Value 4 does not exist\n");
		
		//Compare Array Values
		boolean b = Arrays.equals(array,array1);
		
		System.out.printf("This array %s That array %n%n", (b ? "=" : "!="));
		
		 b = Arrays.equals(array,arrayCopy);
		 System.out.printf("This array %s That array %n%n", (b ? "=" : "!="));
		 
		 
		
	}


}