package exercises_6;

import java.util.Scanner;
public class AsterisksSquare {
   static final  Scanner input = new Scanner(System.in);

    public static void main (String... args){
        System.out.println("Enter number of sides of square to print out");
        squareOfAsterisks();
    }

    static void squareOfAsterisks(){
        int side = input.nextInt();
        for (int row =0; row<=side; row++ ){
            for (int column =0; column<=side; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
