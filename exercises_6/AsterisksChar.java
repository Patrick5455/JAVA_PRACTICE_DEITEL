package exercises_6;

import java.util.Scanner;

public class AsterisksChar {
    static final Scanner input = new Scanner(System.in);
        public static void main (String... args){

            squareOfAsterisks();
        }

        static void squareOfAsterisks(){
            System.out.println("Enter number of sides of square to print out");
            int side = input.nextInt();

            System.out.println("Enter type of character to print out");
            char type = input.next().charAt(0);

            for (int row =0; row<=side; row++ ){
                for (int column =0; column<=side; column++){
                    System.out.print(type);
                }
                System.out.println();
            }
        }
}

