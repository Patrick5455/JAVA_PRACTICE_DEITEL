package exercises_6;

import java.util.Scanner;
import java.security.SecureRandom;

public class GuessNumberGame {
        static Scanner input = new Scanner (System.in);
        static final SecureRandom randomValue = new SecureRandom();

        public static void main(String... args){
            System.out.printf("Ready to play! %n Guess a number between 1 and 1000");
            while (input.hasNext()){
                int guessValue = guessNo();
                int user = input.nextInt();
                if (guessValue==user){ System.out.println("Congratulations. You\n" +
                        "guessed the number!");
                System.out.println("Press Continue or press \"Ctrl+d to cancel\"");}
                else if (guessValue<user) System.out.println("Too high. Try again!");
                else if (guessValue>user) System.out.println("Too Low. Try again!");
            }

        }
        static int guessNo(){
            int guess = 1+randomValue.nextInt(1000);
            return guess; }





}
