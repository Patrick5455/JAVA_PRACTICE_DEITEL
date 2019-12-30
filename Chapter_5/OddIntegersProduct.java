public class OddIntegersProduct{

	public static void main (String... args){
	
	int productValue = 1;
	
	for (int Oddnumbers=1; Oddnumbers<=15; Oddnumbers+=2){
		
		productValue *= Oddnumbers;
		
		System.out.printf("%,d \n",productValue);
	}
	
	System.out.printf("The Product of Odd Numbers from 1 - 15 is %,d ", productValue);
	
	}

}