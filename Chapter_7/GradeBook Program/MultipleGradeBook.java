public class MultipleGradeBook{
	
	private String courseName; private int [] [] grades;
	
	public MultipleGradeBook (String courseName, int [] [] grades){
		
		this.courseName = courseName;
		this.grades =grades;
	}
	
	public void setCourseName (String courseName){
		this.courseName = courseName;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void processGrades(){
		
		System.out.println("\n\nGrade Book Result\n");
		System.out.printf(" %n%20s Grades%n%n", courseName);
		outputGrades();
		
		System.out.printf("%n%n Lowest Score is: %d%n%n",getMinimum());
	
		System.out.printf("%n%n Highest Score is: %d%n%n",getMaximum());
		
		System.out.printf("%n%n Overall Distribution of score in %S%n%n", courseName);
		displayBarChart();
	}
	
	public void outputGrades(){
		int student=0;
		
		System.out.printf("%n%n\t\t");
		
		for (int test =0; test<grades[0].length; test++)
				System.out.printf("Test %d\t",test+1);
		System.out.printf("%s","Average");
		System.out.println("\n");
			
		for (int [] row: grades){
		
			student++;
			System.out.printf("Student %d ", student);
			
			for (int column =0; column<row.length; column++){	
				System.out.printf("%8d", row[column]);
			}
			System.out.printf("\t%.2f", getAverage(row));
			System.out.println("\n");
		}
	}
	
	
	public int getMinimum(){
		
		int minimum = grades [0][0];
		
		for (int [] row: grades){
			
			for (int column: row){
				
				if (column<minimum)
					
				minimum = column;
			}
		}
	return minimum;
	}
	
	public int getMaximum(){
		
		int maximum = grades [0][0];
		
		for (int [] row: grades){
			
			for (int column: row){
				
				if (column>maximum)
					maximum = column;
			}
		}
		return maximum;
	}
	
	public double getAverage(int [] studentGrades){
		
			int total =0;
			double average=0;
			for (int grade=0; grade<studentGrades.length; grade++){
				
				total+=studentGrades[grade];
			
			 average = (double) total/studentGrades.length;
	
			}
		return average;
	}
	
	public void displayBarChart(){
		
		int [] frequency = new int [11];
	
		for (int [] row: grades){
			
			for (int column: row)
				++frequency [column/10];
		}
			
		for (int counter =0; counter<frequency.length; counter++){	
			
				switch (counter){
					case 10:
					System.out.printf("%5d ", 100);
					break;
					
					case 9:
					case 8:
					case 7:
					case 6:
					case 5:
					case 4:
					case 3:
					case 2:
					case 1:
					case 0:
					System.out.printf("%02d-%02d ", counter*10, counter*10+9);
					break;
					
					default:
					break;
				}
				
				for (int bar =0; bar<frequency[counter]; bar++)
					System.out.print("*");
				
				System.out.println();
		}			
	}
	
}
