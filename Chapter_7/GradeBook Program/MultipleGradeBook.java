//import java.util.Scanner;
public class MultipleGradeBook{
	
	//Scanner input = new Scanner(System.in);
	
	private String courseName; private int [] [] grades;
	
	public MultipleGradeBook (String courseName, int [] [] grades){
		
		this.courseName = courseName;
		this.grades =grades;
	}
	
	public void setCourseName (String courseName){
		//System.out.println("Enter Course Name");
		//courseName = input.nextLine();
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
		
		System.out.printf("%n%n Average Score is: %d%n%n",getAverage());
		
		System.out.printf("%n%n Distribution of score in %s%n%n", courseName);
		displayBarChart();
	}
	
	public void outputGrades(){
		int student =0;
		for (int [] row: grades){
			
			for (int column =0; column<row.length; column++){
				student++;
				
				System.out.printf(" Student %s - %d", student, row[column]);
				
			}
				System.out.println();
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
		
		//System.out.printf("Minimum Value is: %d%n ", minimum);
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
		//System.out.printf("Maximum Value is: %d%n ", maximum);
		return maximum;
	}
	
	public int getAverage(){
		int total =0;
		int average =0;
		int count =0;
		
		for (int [] row: grades){
			for (int column: row){
				count++;
				total+=column;
				average = total/count;
			}
		}
		//System.out.printf("Average Value is: %d%n ", average);
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
					System.out.printf("%5d", 100);
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
					System.out.printf("%d-%d", counter*10, counter*10+9);
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
