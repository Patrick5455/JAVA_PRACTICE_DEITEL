package Algorithm_Solutions.exercises_3;
import java.util.Scanner;
public class DateTest{

	public static void main (String... args){
		
		Scanner input = new Scanner(System.in);
			
		Date dates = new Date (00, 00, 0000);
		
		
		System.out.println("Enter Month");
		
		int m = input.nextInt();
		
		dates.setMonth(m);
		dates.getMonth();
		
		
		System.out.println("Enter day");
		
		int d = input.nextInt();
		
		dates.setDay(d);
		dates.getDay();
		
		
		System.out.println("Enter Year");
		
		int y = input.nextInt();
		
		dates.setYear(y);
		dates.getYear();
		
		
		dates.displayDate();
	
			
	}


}