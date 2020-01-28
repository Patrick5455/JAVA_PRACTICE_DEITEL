package Algorithm_Solutions.exercises_3;
public class EmployeeTest{
	
	public static void main(String... args){
		
		Employee ada = new Employee("", "", 0);
		
		Employee dan = new Employee("", "", 0);
		
		ada.setSalary(456);
		dan.setSalary(567);
		
		ada.setSalaryRaise(10);
		dan.setSalaryRaise(10);
		
		
		System.out.printf("%s Yearly Salary is %.2f%n", "ada", 12*ada.getSalary());
		
		System.out.printf("%s Yearly Salary is %.2f%n", "dan", 12*dan.getSalary());
		
		
		System.out.printf("%s Yearly Salary is %.2f%n", "ada", ada.yearlySalary());
		
		System.out.printf("%s Yearly Salary is %.2f%n", "dan", dan.yearlySalary());
		
		System.out.printf("%s Yearly SalaryRaise is %.2f%n", "ada", 12*ada.getsalaryRaise());
		
		System.out.printf("%s Yearly SalaryRaise is %.2f%n", "dan", 12*dan.getsalaryRaise());
		
		System.out.printf("%s Yearly SalaryRaise is %.2f%n", "ada", ada.yearlySalaryRaise());
		
		System.out.printf("%s Yearly SalaryRaise is %.2f%n", "dan", dan.yearlySalaryRaise());
		
		
	}
}