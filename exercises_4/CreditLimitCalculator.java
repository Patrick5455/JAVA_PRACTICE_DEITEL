package Algorithm_Solutions.exercises_4;
import java.util.Scanner;

public class CreditLimitCalculator {
	
	Scanner input = new Scanner(System.in);

	private int accountNo;
	
	private int startBalance;
	
	private int totalCharges;
	
	private int totalCredits;
	
	private int creditLimit;
	
	private int newBalance;
	
	public CreditLimitCalculator (int accountNo, int startBalance, int totalCharges, int totalCredits, int creditLimit)
	
	{ this.accountNo = accountNo;
	
	this.startBalance = startBalance;
	
	this.totalCharges = totalCharges;
	
	this.totalCredits = totalCredits;
	
	this.creditLimit = creditLimit;
	
	}
	
	public void setAccount(){
		
		System.out.println("Enter Account No");
		
		int account = input.nextInt();
		
		accountNo = account;
	}
	
	public int getAccount(){
		return accountNo;
	}
	
	public void setBalance(){
		
		System.out.println("Enter Balance from Start of Month");
		
		int balance = input.nextInt();
		
		 startBalance = balance;
	}
	
	public int getBalance(){
		return startBalance;
	}
	
	public void setCharges(){
		
		System.out.println("Enter total of items charged this Month");
		
		int charges = input.nextInt();
		
		totalCharges = charges;
	}
	
	public int getCharges(){
		return totalCharges;
	}
	
	public void setCredits(){
		
		System.out.println("Enter total of credits this Month");
		
		int credits = input.nextInt();
		
		totalCredits = credits;
		
	}
	
	public int getCredits(){
		return totalCredits;
	}
	
	public void setLimit(){
		
		System.out.println("Enter customer credit limit");
		
		int limit = input.nextInt();
		
		creditLimit = limit;
	}
	
	public int getLimit(){
		return creditLimit;
	}
	
	public int creditBalance(){
		
		return  newBalance = (startBalance + totalCharges )- totalCredits;
	
	}
	
	public void limitCheck(){
		if (newBalance > creditLimit){
			System.out.println("Credit Limit Exceeded!");
		}
	}
	

}