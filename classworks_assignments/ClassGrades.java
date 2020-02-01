package classworks_assignments;

import java.util.Scanner;
public class ClassGrades {
    static Scanner input = new Scanner(System.in);

    static double grade = 0;
    static int counter = 0;
    static int frequency = 0;
    static double mean = 0;
    static int mode = 0;
    static double totalGrade = 0;

    public static void main(String... args) {
        totalF();
        System.out.printf("The mean is %.2f and the mode is %d",meanF(),frequency);

    }

    static void totalF() {
        System.out.println("Enter Grade or -1 to terminate");
        grade = input.nextDouble();
        while (grade != -1) {
            if (grade <= 50) {
                totalGrade += grade;
                frequency++;}
            else totalGrade = totalGrade;
            grade = input.nextDouble();

        }
    }
    static double meanF(){
        mean = totalGrade/frequency;
        return mean;
    }
}

