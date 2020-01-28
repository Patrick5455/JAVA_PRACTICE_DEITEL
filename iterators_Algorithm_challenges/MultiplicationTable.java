package iterators_Algorithm_challenges;

import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String... args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number to print out multiplication table");

        int user = input.nextInt();

        for (int num = 1; num<=12; num++){
            System.out.printf("%d x %d = %d%n%n", user, num, user*num);
        }
    }
}
