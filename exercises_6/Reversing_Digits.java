package exercises_6;

import java.util.Scanner;

public class Reversing_Digits {
    static int a;       static  double total=1;
    static int counter=0;
    static  int b=10;
    static Scanner input = new Scanner(System.in);

    public static void main(String... args){
        System.out.println("Enter Value you want its output reversed");
        reverseDigit();
    }

    static int quotientF() { return a / b; }
    static int remainderF() { return a % b; }

    static void reverseDigit() {
        a=input.nextInt();

        int c = remainderF();
        System.out.printf("%-4d", c);
        a = quotientF();

        while (a != 0) {
            c = remainderF();
            System.out.printf("%-4d", c);
            a = quotientF();

        }
    }




}
