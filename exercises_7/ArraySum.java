package exercises_7;
public class ArraySum {

	public static void main (String... args){
		
		int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int total=0;
		
		System.out.println("Index\tValue");
		
		for (int counter =0; counter<array.length; counter++){
			//total += array[counter];
			
			total += array[counter];
			
			System.out.printf("%3d\t%3d%n",counter,total);
			
		}
		
		System.out.printf("%nTotal of array element is %d%n",total);
	}


}