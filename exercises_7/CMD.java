package Algorithm_Solutions.exercises_7;

public class CMD {
	
	public static void main (String... args){
		
		
		
		if (args.length!=3) System.out.println("Error, Input three figures with spaces in between");
		
		else{
			
		int arrayLength = Integer.parseInt(args[0]);
		
		int [] array = new int [arrayLength];
		
		int initialValue = Integer.parseInt(args[1]);
		
		int incrementValue = Integer.parseInt(args[2]);
		
		
			System.out.println("\n\nIndex\t Value");
			
			for (int counter=0; counter<array.length; counter++){
				
				array [counter] = initialValue+counter*incrementValue;
				
				System.out.printf("\n\n%d\t%d", counter, array[counter]);
			}
		}
		
	}


}