package exercises_6;

import java.util.Scanner;

public class Minimum_Value {
    static Scanner input = new Scanner (System.in);
    static  double a;
    static double b;
    static double c;

    public  static void main (String... args){

        minimum3();
    }
    static void minimum3(){
        System.out.println("Enter 1 of 3 values to find minimum");
        a = input.nextDouble();
        System.out.println("Enter 2 of 3 values to find minimum");
        b = input.nextDouble();
        System.out.println("Enter 3 of 3 values to find minimum");
        c = input.nextDouble();
        double minimum = Math.min(a,Math.min(b,c));
        System.out.printf("%.2f is the minimum value", minimum);
    }

}
