package exercises_4;

import java.util.Scanner;
public class eulaCalculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the eula series to calculate");
		int eulaF = input.nextInt();

		float e = 1; int factorial = 1; int number=1; int j =1;
		
		for (int i = 2; i <=eulaF; i++)
		{
			while(j <i){j++;
				factorial *= j;
				e +=(float) 1 / factorial;
			}
		}
		System.out.printf("Eula figure at factorial %d  is %.2f", eulaF, e);
	}
}


