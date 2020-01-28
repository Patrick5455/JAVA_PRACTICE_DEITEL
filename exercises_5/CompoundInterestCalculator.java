package Algorithm_Solutions.exercises_5;
import java.util.Scanner;

public class CompoundInterestCalculator{

	Scanner input = new Scanner(System.in);
	
		private double principal; private double rate; private int period; private double amount;
		
		public CompoundInterestCalculator (double principal, double rate, int period){
			
			this.principal = principal; this.rate = rate; this.period = period;
		}

			
		public void setprincipal(){
				
				System.out.println("Enter Principal\n");
				principal = input.nextDouble(); 
				}
		
		public void setRate(){
			System.out.println("Enter Rate\n");
			rate = input.nextDouble();
			rate = rate/100;
		}
		
		public void setPeriod(){
			System.out.println("Enter period\n\n");
			period = input.nextInt();
		}
		
		public void compoundInterest(){
			
			for (int x =1; x<=period; x++){
				
				amount = principal * Math.pow(1.0 + rate, x);
				//System.out.printf("%4d%,20.2f%n", x, amount);
				System.out.printf("%4d%,20.2f%n", x, amount);
				// %, - delimit with comma
				
				//double interest = principal*rate;
				
				 //principal = interest + principal;
				 
				// System.out.printf("Your Compounded amount at the end of period %d is%n$%.2f%n%n", x, principal);
				
			}
			
			
		}
		
		
	
	
	
}
