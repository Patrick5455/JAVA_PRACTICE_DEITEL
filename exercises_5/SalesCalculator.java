package Algorithm_Solutions.exercises_5;
import java.util.Scanner;
public class SalesCalculator {

	private final double product1 = 2.98; private final double product2 = 4.50; 
	private final double product3 = 9.98; private final double product4 = 4.49; 
	private final double product5 = 6.87;
	
	private int productnum =0; private double qtySold =0;
	
	private double totalRetailValue = 0;
	
	Scanner input = new Scanner (System.in);
	
	
	public double getRetailValue(){
		
		double retailValue1=0; double retailValue2=0; double retailValue3=0; double retailValue4=0; double retailValue5=0;
		
		System.out.println("\nEnter Product Number from 1-5\n\n");
		
		System.out.println("To stop input press \"Ctrl+z\" on windows and \"Ctrl+z\" on Mac\\Unix\\Linux");
		
		while (input.hasNext()){
			
			productnum = input.nextInt();
			
			switch (productnum){
				
				case 1:
				System.out.println("ENter Quantity Sold");
				qtySold = input.nextDouble();
				retailValue1=product1*qtySold;
				System.out.println("Enter Product Number from 1-5\n\n");
				break;
				
				case 2: 
				System.out.println("ENter Quantity Sold");
				qtySold = input.nextDouble();
				retailValue2=product2*qtySold;
				System.out.println("Enter Product Number from 1-5\n\n");
				break;
				
				case 3:
				System.out.println("ENter Quantity Sold");
				qtySold = input.nextDouble();
				retailValue3=product3*qtySold;
				System.out.println("Enter Product Number from 1-5\n\n");
				break;
				
				case 4:
				System.out.println("ENter Quantity Sold");
				qtySold = input.nextDouble();
				retailValue4=product4*qtySold;
				System.out.println("Enter Product Number from 1-5\n\n");
				break;
				
				case 5: 
				System.out.println("ENter Quantity Sold");
				qtySold = input.nextDouble();
				retailValue5=product5*qtySold;
				System.out.println("Enter Product Number from 1-5\n\n");
				break;	
			}
			totalRetailValue = (retailValue1+retailValue2+retailValue3+retailValue4+retailValue5);
		}
	return totalRetailValue;		
	}
	
	public static void displayTotal(SalesCalculator object){
			System.out.printf("Total Retail Value is %,.2f",object.getRetailValue());
		}
}
	