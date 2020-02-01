package Algorithm_Solutions.exercises_3;
import java.util.Scanner;

public class BankAccountTest{
	
		
	public static void main(String... args){
		
		Scanner input = new Scanner (System.in);
		
		BankAccount Account1 = new BankAccount(" ", 0);
		BankAccount Account2 = new BankAccount(" ", 0);
		
		System.out.println("Enter Account Name");
		String accName = input.nextLine();
		System.out.println("How much Deposit");
		int accBalance = input.nextInt();
		
		Account1.setAccountName(accName);
		Account1.setaccountDeposit(accBalance);
		displayAccount(Account1);
		
	
		 System.out.println("Enter Account Name2");
		 accName = input.nextLine();
		 accName = input.nextLine();
		 System.out.println("How much Deposit");	
		 accBalance = input.nextInt();
		 
		Account2.setAccountName(accName);
		Account2.setaccountDeposit(accBalance);
		displayAccount(Account2);
	}

	public static void displayAccount(BankAccount accdisplay){
		
		System.out.printf("Account Name is %s and Account Balance is %.2f%n", accdisplay.getAccountName(), accdisplay.getBalance());
	}

}
