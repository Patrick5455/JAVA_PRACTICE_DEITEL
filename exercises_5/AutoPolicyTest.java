package Algorithm_Solutions.exercises_5;
public class AutoPolicyTest{

	public static void main (String... args){
	
	AutoPolicy obj1 = new AutoPolicy(0,"","");
	
	
	obj1.setAccountNumber();
	obj1.setmakeAndModel();
	obj1.setState();
	policyInformation(obj1);
	
	}
	
	public static void policyInformation (AutoPolicy policy){
			
			System.out.printf("POLICY INFORMATION:%n%n Account Number: %d%n%n Make and  Model: %s%n%n State: %s%n%n Status: State %s %s a \"no-fault state\"%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
	}

}