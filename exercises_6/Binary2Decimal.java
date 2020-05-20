package exercises_6;

import java.util.Scanner;

public class Binary2Decimal {

    static int a;
    static  int total=1;
    static int counter=0;
    static  int b=10;
    static Scanner input = new Scanner(System.in);


    public static void main(String... args){

        System.out.println("Enter Value to convert to binary");

        convert2Binary();

        System.out.println("Binary Value: "+ total);
    }

    static int quotientF() { return a / b; }
    static int remainderF() { return a % b; }

    static void convert2Binary() {
        a=input.nextInt();

        int c = remainderF();
        a = quotientF();
        total = c* (int)Math.pow(2,counter);
        counter++;
//        System.out.println("w"+total);


        while (a != 0) {
            c = remainderF();
            total+= c* (int)Math.pow(2,counter);
            counter++;
//            System.out.println("w"+total);
            a = quotientF();

        }
    }


}
