package Algorithm_Solutions.exercises_7;
public class EnhancedFor{

	public static void main(String... args){
	
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int total =0;
		
		for (int number: array)
			total+=number;
		
		System.out.println("Total of array element is " + total);
	}
}