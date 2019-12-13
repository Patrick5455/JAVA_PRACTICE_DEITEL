public class Account1{
	private double accountNumber;
	private String accountName;
	private double balance;
	
	public String getAccountName(){
		return accountName;
	}
	
	public void setAccountName(String accountName){
		this.accountName = accountName;
	}

	public static void main(String... args){
		Account1 obj = new Account1();
		//System.out.println("seond account name is " + //obj.getAccountName());
		obj.setAccountName("Patrick");
		System.out.println("seond account name is " + obj.getAccountName());
				
	}
}