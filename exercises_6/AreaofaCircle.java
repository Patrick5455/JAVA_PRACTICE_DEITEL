package exercises_6;

import java.util.Scanner;
public class AreaofaCircle {
   static  Scanner input = new Scanner(System.in);

    public static void main(String... args){
        System.out.printf("Area of Circle is %.2f ", circleArea());
    }

    static double circleArea(){
    System.out.println("Enter number for radius");
    double radius = input.nextDouble();

    double area = Math.PI*Math.pow(radius,2);

    return area;

    }



}
