package exercises_6;

import java.util.Scanner;
public class DistanceCalculator {
    static Scanner input = new Scanner(System.in);
    static double x1=0; static double x2=0; static double y1=0; static double y2=0;

    public static void main (String... args){
        System.out.println("Enter Coordinates of Point 1");
        x1 = input.nextDouble(); x2= input.nextDouble();

        System.out.println("EEnter Coordinates of Point 2");
        y1 = input.nextDouble(); y2= input.nextDouble();

        System.out.printf("The distance between both points is %.2f", distanceF());
    }

    static double distanceF() {
        double distance = 0;
        double MaxX = Math.max(x1, x2); double MinX = Math.min(x1, x2);
        double MaxY = Math.max(y1, y2); double MinY = Math.min(y1, y2);

        double d1 = Math.pow((MaxX - MinX), 2); double d2 = Math.pow((MaxY - MinY), 2);
        distance = Math.sqrt((d1 + d2));

        return distance;
    }
}
