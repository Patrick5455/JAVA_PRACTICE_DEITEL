package Algorithm_Solutions.exercises_3;
public class BankAccount{
	
	private String accountName;
	private double accountBalance;
	private double accountDeposit;
	private double accountWithdraw;
	
	
	public BankAccount(String accountName, double accountBalance){
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	public void setAccountBalance (double accountBalance){
		
		if (accountBalance > 0.0){this.accountBalance = accountBalance;}
	}
	
	public void setaccountDeposit (double accountDeposit){
		
		if (accountDeposit > 0.0){
			accountBalance = accountBalance + accountDeposit;}
	}
	
	public double getBalance (){
		return accountBalance-accountWithdraw;
	}
	
	public void setAccountName (String accountName){
		this.accountName = accountName;
	}
	
	public String getAccountName (){
		return accountName;
	}
	
	public void setAccountWithdraw(double accountWithdraw){
		this.accountWithdraw = accountWithdraw;
	}
	
	public double getAccountWithdraw(){
		if (accountWithdraw > accountBalance){
			System.out.println("Withdrawal amount exceeded account balance");
		}
		else{ System.out.printf("Remaining Balance is %d");}
		
		return  accountBalance - accountWithdraw;
		
	}
}
