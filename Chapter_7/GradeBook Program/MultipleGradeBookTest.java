public class MultipleGradeBookTest{

	 public static void main (String... args){
	 
		int [] [] grades = {{87, 96, 70}, 
							 {68, 87, 90}, 
							 {94, 100, 90}, 
							 {100, 81, 82}, 
							 {83, 65, 85}, 
							 {78, 87, 65}, 
							 {85, 75, 83}, 
							 {91, 94, 100}, 
							 {76, 72, 84}, 
							 {87, 93, 73}
							};
		
		MultipleGradeBook obj1 = new MultipleGradeBook("Java 101", grades );
		
		//obj1.processGrades();
		
		//obj1.outputGrades();
		//obj1.getMinimum();
		//obj1.getMaximum();
		//obj1.getAverage();
		//obj1.displayBarChart();
		obj1.processGrades();
	 }


}