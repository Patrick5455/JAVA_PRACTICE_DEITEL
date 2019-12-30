import java.util.Scanner;

public class mpgCalculator{
	
	public static void main (String... args){
	
	int miles;
	int gallons;
	int totalMiles =0 ;
	int totalGallons =0;
	int trip= 0;
	double totalMpg = 0;
	double mpg = 0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter 0 to quit application\n");
	
	System.out.println("Enter no of miles\n");
	miles = input.nextInt();
	totalMiles +=miles;
	
	while (miles != 0){
		
		System.out.println("Enter no of gallons\n");
		gallons = input.nextInt();
		totalGallons = totalGallons + gallons;
		
		if (miles != 0 && gallons != 0){
			mpg = (double) miles/gallons;
			totalMpg = totalMpg + mpg;
			System.out.printf("Your miles per gallon for this trip is %.2f%n%n", mpg); 
		}
		
		System.out.println("Enter 0 to check total mileage per gallon\n");
		
		System.out.println("Enter no of miles\n");
		miles = input.nextInt();
		totalMiles +=miles;
		
		trip++;
	}
	
	if (totalMiles != 0 && totalGallons != 0){
		//double totalMpg = (double) totalMiles/totalGallons;
		System.out.printf("Your miles per gallon for all %d trip is %.2f%n%n", trip,totalMpg);
	}
	
	
}

}