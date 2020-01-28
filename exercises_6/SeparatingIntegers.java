package exercises_6;

import java.util.Scanner;
public class SeparatingIntegers {

    static Scanner input = new Scanner(System.in);
    static int a; static int b; static String convert; static int count =0;

    public static void main(String... args) {
        System.out.println("Enter value to separate");
        display();
    }

    static int quotientF() { return a / b; }
    static int remainderF() { return a % b; }

    static void display() {
        a = input.nextInt(); convert = Integer.toString(a);
        //Get the length of number and find the thousandth value
        b = convert.length()-1; b= (int) Math.pow(10,b);
        if (1 <= a && a <= 99_999) {
            while (count < convert.length()) {
                int c = quotientF();
                a = remainderF();
                System.out.printf("%-4d ", c);
               b/=10;
                count ++;
            }
        }
        else System.out.println("Error: Enter values from 1 - 99,999");
    }

}



