package classworks_assignments;
//import java.util.Scanner;

public class Differentiation{
	
	private int number; 
	private int coefficient;
	private int power;
	
	public void setCoefPower(int number){ 
	
	//System.out.println("Enter a number");
	//Scanner input = new Scanner(System.in);
	//number = input.nextInt();
	
	this.number = number;
	coefficient = number;
	power = number-1;
	
	}
	
	public int getCoef(){
		return coefficient;
	}
	
	public int getPower(){
		return power;
	}
	
	
}