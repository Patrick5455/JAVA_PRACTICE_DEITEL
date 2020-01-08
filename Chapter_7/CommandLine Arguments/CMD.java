public class CMD {
	
	public static void main (String... args){
		
		int arrayLength = Integer.parseInt(args[0]);
		int [] array = new int [arrayLength];
		
		int initialValue = Integer.parseInt(args[1]);
		int incrementValue = Integer.parseInt(args[2]);
		
		if (args.length!=3) System.out.println("Error, Input three figures with spaces in between");
		
		else{
			
			System.out.println("\n\nIndex\t Value");
			for (int counter=0; counter<array.length; counter++)
				System.out.printf("\n\n%d\t%d", counter, initialValue+counter*incrementValue);
		}
		
	}


}