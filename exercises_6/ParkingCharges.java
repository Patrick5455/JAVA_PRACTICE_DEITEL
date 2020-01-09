package exercises_6;
import java.util.Scanner;
public class ParkingCharges{
	
	static Scanner input = new Scanner(System.in);

	private static final double minimumFee = 2.00;
	private static final double additionalFee = 0.50;
	private static final double maximumFee = 10.0;
	
	public static void main (String... args){
		
		calculateCharges();
	}
	
	public static void calculateCharges(){
		
		double charges =0;
		int hours =0;
		double extraFees = ((minimumFee/3)+additionalFee);
		double totalCharges =0;
		
		System.out.println("Enter the number of parking hours for customer no greater than 24 hours");
		
		while (input.hasNext()){
			
			hours = input.nextInt();
			
			int extraHours = hours -3;
			 
			if (hours > 24 || hours == 0) {
				charges =0;
				System.out.println("Invalid no of hours\n");
			}
			
			if (hours == 24) charges = maximumFee;
				
			if (hours <= 3) charges = minimumFee;
					
			else charges = minimumFee + extraFees*extraHours;
			
			totalCharges+=charges;
		
			System.out.printf("Charge is $%.2f%n", charges);
		}
		
		 System.out.printf("Total Charge is $%,.2f%n", totalCharges);
	}
	
}