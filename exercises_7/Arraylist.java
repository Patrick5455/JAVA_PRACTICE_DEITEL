package exercises_7;

import java.util.ArrayList;
public class Arraylist{

	//System.out.printf ("%s",)

	public static void main (String... args){
		
		//Declaration
		ArrayList <String> stringArray = new ArrayList<String>();
		
		//Add Elements
		stringArray.add("Patrick");
		stringArray.add(0,"Ojunde");
		stringArray.add(1,"Damilare");
		stringArray.add(2,"Damilare");
		
		//Remove Elements
		stringArray.remove("Patrick");
		stringArray.remove(1);
		System.out.printf("%s%n",stringArray.get(1));


		//Contains Element
		System.out.printf ("%s%n",stringArray.contains("Damilare"));
		System.out.printf ("%s%n",stringArray.contains("Patrick"));


		//Get Elements
		System.out.printf("%s%n", stringArray.get(0));

		//Array Size
		System.out.printf("%s%n",stringArray.size());
	
	
	}
	


}
