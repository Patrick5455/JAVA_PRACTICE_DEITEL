package exercises_6;

public class HypotenuseCalculation {
//a^2+b^2 = c^2

    public static void main (String... args){

        hypotenuse(3.0, 4.0);
        hypotenuse(5.0, 12.0);
        hypotenuse(8.0, 12.0);
    }

    static void hypotenuse (double side1, double side2){
        double  hypo = 0;
        hypo = Math.pow(side1,2) + Math.pow(side2,2);
        System.out.printf("Hypotenuse of %.2f and %.2f is %.2f%n", side1, side2, Math.sqrt(hypo));
    }
}
