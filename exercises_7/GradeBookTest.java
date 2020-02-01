package exercises_7;

public class GradeBookTest{

	public static void main(String... args){
		
		int [] gradesArray ={10,20,30,40,60,90,90,100,90,80,90,23,45,67,82,92,89,20,30,5};
		
		GradeBook schoolOne = new GradeBook("Java Algorithm Class",gradesArray);
		
		System.out.println("\nJava Grade Book");
		System.out.printf("\nThis is the Grade Book for %s%n%n", schoolOne.getCourseName());
		schoolOne.processGrades();
	
	
	}

}