public class CommandLine{

	public static void main (String... args){
	
		if (args.length !=3) System.out.println("ERROR!. Enter valid arguments of 3 digits. The first digit indicates array length, the second, intial value and the thir the increment value");
			
		else{
		
			int arrayLength = Integer.parseInt(args[0]);
			
			int [] array = new int [arrayLength];

			int initialValue = Integer.parseInt(args[1]);
			
			int incrementValue = Integer.parseInt(args[2]);
		
		
			System.out.println("\n\nIndex\tValue");
			for (int counter =0; counter<array.length; counter++){
				
				array [counter] = initialValue + incrementValue*counter;
					
				System.out.printf(" %d\t %d%n", counter, array[counter]);
		
			}
		
		}
	
	}
}