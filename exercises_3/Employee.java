package Algorithm_Solutions.exercises_3;
public class Employee{

	private String firstName;
	private String lastName;
	private double salary;
	private double salaryRaise;
	
	
	public Employee(String firstName, String lastName, double salary){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public void setFirstName (String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName (){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName (){
		return lastName;
	}
	
	public void setSalary(double salary){
		if (salary > 0){
		this.salary = salary;
		}
		
		else {
			System.out.println("Salary is a negative value");
		}
	}
	
	public double getSalary(){
		return salary;
	}
	
	public double yearlySalary(){
		return salary*12;
	}
	
	public void setSalaryRaise(double raise){
		salaryRaise = (salary)*(1+(raise/100));
	}
	
	
	public double getsalaryRaise(){
		return salaryRaise;
	}
	
	public double yearlySalaryRaise(){
		return salaryRaise*12;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	