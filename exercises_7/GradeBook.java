package exercises_7;

import java.util.Scanner;
public class GradeBook {
	
	Scanner input = new Scanner (System.in);
	
	private String courseName; private int [] grades;
	
	public GradeBook (String courseName, int [] grades ){
		
		this.courseName = courseName;
		this.grades = grades;
	}
	
	public void setCourseName(){
		
		courseName = input.nextLine();
	}
	
	public String getCourseName(){
		
		return courseName;
	}
	
	public void processGrades(){
		
		System.out.printf("Grade Book Total is %,d%n%n", total());
		
		System.out.printf("Grade Book Average is %.2f%n%n", average());
		
		System.out.printf("Grade Book Minimum score is %d%n%n", minimum());
		
		System.out.printf("Grade Book Maximum  score is %d%n%n", maximum());
		
		System.out.println("The Student Scores are as follow:\n");
		displayGrades();
		
		System.out.println("\n\nThe Grade Book Chart\n");
		barChart();
		
	}
	
	
	public int  total (){
		int total;
		total =0; 
		for (int grade: grades)
			total+=grade;
		
		return total;
	}
	
	public double average(){
		double average =0;
		average = (double) total()/grades.length;
		
		return average;
	}
	
	public int minimum(){
		int minimum;
		minimum = grades[0];
		 
		for(int grade: grades){
			
			if (grade<minimum) minimum = grade;
		}
		return minimum;
	}
	
	public int maximum(){
		int maximum =0;
		for(int grade: grades){
			
			if (grade>maximum) maximum = grade;
		}
		return maximum;
	}
	
	public void displayGrades(){
		
		System.out.printf("%5S%12S%n","STUDENT","GRADE");
		
		for (int student =0; student<grades.length; student++){
			System.out.printf(" Student %d:\t%d%n ", student+1, grades[student]);
			//for (int space =0; space<=student; space++)
			//if (student%4==0) System.out.print("\n");
		}
	}
	
	public void barChart(){
		
		int [] frequency = new int [11];
		
		for (int grade: grades){
			++frequency[grade/10];
		}
		
		for (int counter =0; counter<frequency.length; counter++){
			
			if (counter ==10) System.out.printf("%5d\t", 100);
			else System.out.printf("%d-%d\t", counter*10, counter*10+9);
			
			for (int bars =0; bars<frequency[counter]; bars++){
				System.out.print("*");
			}
			System.out.println();
			
		}	
	}
	

}