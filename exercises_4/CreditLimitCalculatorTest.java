package Algorithm_Solutions.exercises_4;
public class CreditLimitCalculatorTest{

	public static void main (String... args){

	CreditLimitCalculator obj = new CreditLimitCalculator (0, 0, 0, 0, 0);
	
	obj.setBalance();
	
	obj.setCharges();
	
	obj.creditBalance();
	
	obj.setCredits();
	
	obj.limitCheck();	
	
	

}

}