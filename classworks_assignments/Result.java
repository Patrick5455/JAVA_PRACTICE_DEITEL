package classworks_assignments;
import java.util.Scanner;

public class Result {
    public static void main (String[]   args){
      Scanner input = new Scanner(System.in);
        int grade;
        System.out.println("Enter Student Grade:");
        grade = input.nextInt();
        if (grade >= 90){
            System.out.println ("A");
        }
        else
                if (grade >= 80)
                    System.out.println("B");
                else
                        if (grade >= 70)
                            System.out.println("C");
                            else
                                if (grade >= 60)
                                    System.out.println("D");
    }
}
