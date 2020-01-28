package Algorithm_Solutions.classworks_assignments;
public class WemaAccountTest{
	
	public static void main(String... args){
		WemaAccount patrick = new WemaAccount();
		
		patrick.setBalance(100000000);
		System.out.printf("Patrick\'s Balance is %d%n", patrick.getBalance());
		
		patrick.setName("Patrick Ojunde");
		System.out.printf("Account Name is %S", patrick.getName());
	}

}