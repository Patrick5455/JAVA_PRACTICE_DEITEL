package exercises_6;
import java.util.Scanner;

public class TemperatureConversions {

    static final Scanner input = new Scanner(System.in);
    static double value;
    static int selection;

    public static void main(String... args) {

        System.out.println("Enter 1 to calculate celsius and 2 to calculate fahrenheit");
        selection = input.nextInt();

        switch(selection){
            case 1:
                System.out.println("Enter fahrenheit value to convert to celsius");
                celsiusF();
                break;
            case 2:
                System.out.println("Enter celsius value to convert to fahrenheit");
                fahrenheitF();
                break;
        }
    }

    static double celsiusF() {
        value = input.nextDouble();
        double celsius = 5.0 / 9.0 * (value - 32);
        System.out.printf("Celsius value for fahrenheit value at %.2f is %.2f", value, celsius);
        return celsius;
    }

    static double fahrenheitF(){
        value = input.nextDouble();
        double fahrenheit = 9.0/5.0*(value + 32);
        System.out.printf("Fahrenheit  value for celsius value at %.2f is %.2f", value, fahrenheit);
        return fahrenheit;
    }

}


