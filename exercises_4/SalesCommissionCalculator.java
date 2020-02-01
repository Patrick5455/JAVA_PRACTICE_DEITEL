package Algorithm_Solutions.exercises_4;
import java.util.Scanner;

public class SalesCommissionCalculator{

	double itemQty1; double itemQty2; double itemQty3; double itemQty4; double grossSales;
	
	Scanner input = new Scanner (System.in);
	
	
	public SalesCommissionCalculator (double itemQty1, double itemQty2, double itemQty3, double itemQty4){
	
	 this.itemQty1 = itemQty1;

	 this.itemQty2 = itemQty2;
	
	 this.itemQty3 = itemQty3;
	
	 this.itemQty4 = itemQty4;
	}
	
	public void setQty (){
	
	System.out.println("Enter qty for each item\n");
	
     System.out.println("Item 1 ?\n");
	 itemQty1 = input.nextDouble();
	 System.out.println("Item 2 ?\n");
	 itemQty2 = input.nextDouble();
	 System.out.println("Item 3 ?\n");
	 itemQty3 = input.nextDouble();
	 System.out.println("Item 4 ?\n");
	 itemQty4 = input.nextDouble();
	 
	}
	
	public void setGrossSales(){
	
	grossSales = (itemQty1*239.99) + (itemQty2*129.75) + (itemQty3*99.95) + (itemQty4*350.89);
	
	}
	
	public void displayGrossSales(){
	System.out.printf("The gross sale for the week is $%.2f%n%n", grossSales);
	}
	
	public void salesComission(){
	System.out.printf("Your Sales Comission is $%.2f", 200 + (grossSales*0.09));
	}

}
	
	
	
	


