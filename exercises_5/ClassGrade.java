package Algorithm_Solutions.exercises_5;
import java.util.Scanner;
public class ClassGrade{

	public static void main (String... args){
	
		int total = 0;
		int score =0;
		double average =0;
		int gradeA = 0;
		int gradeB = 0;
		int gradeC = 0;
		int gradeD = 0;
		int gradeF = 0;
		int gradeCounter = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Enter Score. To terminate on windows, press \"ctrl+ z\" To terminate on Unix/Linux/macOS, press \"ctrl+ d\"");
		
		while (input.hasNext()){
			
			score = input.nextInt();
			
			total += score;
			
			switch ( score/10){
				
				case 9:
				case 10:
				++gradeA;
				break;
				
				case 8:
				++gradeB;
				break;
				
				case 7:
				++gradeC;
				break;
				
				case 6:
				++gradeD;
				break;
				
				default:
				++gradeF;
				break;
			}
				
			++gradeCounter;
			
		}
		
		if (gradeCounter != 0){
			
			average = (double)total/gradeCounter;
			
			System.out.printf("Total Score of  %d students is %d with an average score of %,.2f%n", gradeCounter, total, average);
			
			System.out.printf(" Grade A Students = %d%n Grade B Students = %d%n Grade C Students = %d%n Grade D Students = %d%n Grade F Students = %d%n", gradeA, gradeB, gradeC, gradeD, gradeF);
		}
		
		else{System.out.println ("No grades were entered");
		}


	}
}