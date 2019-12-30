import java.util.Scanner;
public class AutoPolicy{

Scanner input = new Scanner(System.in);

private int accountNumber; private String makeAndModel; private String state; 

	public AutoPolicy (int accountNumber, String makeAndModel,String state){
		
		this.accountNumber = accountNumber; this.makeAndModel = makeAndModel; this.state = state;
	}
		
	public void setAccountNumber (){
	System.out.println("Enter Acccount Number:\n ");
	accountNumber = input.nextInt();
	System.out.println(" \n");
	}
	
	public int getAccountNumber(){
	System.out.println(" \n");
	return accountNumber;
	}
	
	public void setmakeAndModel(){
		System.out.println("Enter model of car:\n");
		makeAndModel = input.nextLine();
		makeAndModel = input.nextLine();
		System.out.println(" \n");
	}
	
	public String getMakeAndModel(){
		System.out.println(" \n");
		return makeAndModel;
	}
	
	public void setState(){
		
		System.out.println("Enter State of insurance:\n\n Enter Massachusetts as MA\n Enter New Jersey as NJ\n Enter New York as NY\n Enter Pennsylvania as PV\n Enter other State in thier original form\n");
		System.out.println("What State?\n ");
		state = input.nextLine();
	}
	
	public String getState(){
		System.out.println(" \n");
		return state;
	}

	public boolean isNoFaultState(){
		
		boolean noFaultState;
		
		switch (state){
			
			case "MA":
			
			case "NJ":
			
			case "NY":
			
			case "PV":
			
			noFaultState = true;
			//System.out.printf("Status: " + noFaultState);
			
			break;
			
			default:
			
			noFaultState = false;
			//System.out.printf("Status: " + noFaultState);
			
			break;
		}
		
		return noFaultState;
	
	
	}

}