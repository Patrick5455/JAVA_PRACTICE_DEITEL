package exercises_6;
 import java.util.Scanner;

public class Calculations {
    static final Scanner input = new Scanner(System.in);

    public static void main(String... args) {
        //sphereVolume();
        //roundingNumbers();
        displayRoundedNumbers();
    }

    //Write a Java application that prompts the user for the double radius of a sphere, calls s
    // sphereVolume to calculate the volume and displays the result.
    public static double sphereVolume() {
        System.out.println("Enter Radius Number");
        int radius;
        radius = input.nextInt();
        radius = 3;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("%n%nVolume is %.2f", volume);
        return volume;
    }

    //Write an application that reads double values and uses the preceding statement to round each of the numbers to the nearest integer.
// For each number processed, display both the original number and the rounded number.
    public static void roundingNumbers() {
        double x = 0;
        double y = 0;
        double xFloor = 0;
        double yFloor = 0;

        System.out.println("Enter value for x");
        x = input.nextDouble();
        System.out.println("Enter value for y");
        y = input.nextDouble();

        xFloor = Math.floor(x);
        yFloor = Math.floor(y);

        System.out.printf("The floor value for %.2f is %.2f%n%n", x, xFloor);
        System.out.printf("The floor value for %.2f is %.2f%n%n", y, yFloor);
    }

    static double roundToInteger(double number) {
         double numberFloor = Math.floor(number);
        return numberFloor;
    }

    static double roundToTenths(double number) {
         double numberFloor = Math.floor(number * 10 + 0.5) / 10;
         return numberFloor;
    }

    static double roundToHundrendths(double number) {
         double numberFloor = Math.floor(number * 100 + 0.5) / 100;
         return numberFloor;
    }

    static double  roundToThousandths(double number){
         double numberFloor = Math.floor(number*1000+0.5)/1000;
         return numberFloor;
    }

    static void displayRoundedNumbers(){
        System.out.println("Enter Number to be rounded");
        double number = input.nextDouble();

        System.out.println("The Rounded Positions for " + number);
        System.out.printf("%n Integer = %.1f%n Tenth = %.2f%n Hundrendth = %.3f%n Thousandth = %.4f%n", roundToInteger(number),
                roundToTenths(number), roundToHundrendths(number), roundToThousandths(number));
    }
}


