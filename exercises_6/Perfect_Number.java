package exercises_6;

import java.util.Scanner;
public class Perfect_Number {
    static Scanner input = new Scanner(System.in);
    static int numbers;
    static int factor;

    public static void main(String... args) {
        System.out.println("Enter Range of numbers to find perfect numbers");
        numbers = input.nextInt();
        for (int num = 1; num <= numbers; num++) {
            if (isPerfect(num)==true) {
                System.out.printf("Factors of %d are:%n", num);
                for (factor = 1; factor < num; factor++) {
                    if (num % factor == 0) {
                        System.out.println(factor);
                    }
                }
            }
        }
    }

    public static boolean isPerfect(int number){
        if (number==0)
            System.out.println("Sorry Divide by Zero ERROR. Enter Correct input");
        int pFactors=0;
        for (factor=1; factor<number; factor++) {
            if (number % factor == 0) {
                pFactors += factor;
            }
        }
        if (pFactors == number) {
            System.out.printf("%d is a perfect number%n", number); }

        return  (pFactors == number ? true : false);
        }

}
