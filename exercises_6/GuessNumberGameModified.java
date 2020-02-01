package exercises_6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberGameModified {
        static Scanner input = new Scanner (System.in);
        static final SecureRandom randomValue = new SecureRandom();
        static  int frequencyWin=0; static int frequencyLose=0;
        static int frequencyAttempt=0;

        public static void main(String... args){
            gamePlay();
        }

        static int guessNo(){
            int guess = 1+randomValue.nextInt(1000);
            return guess; }

         static void gamePlay(){
             System.out.printf("Ready to play! %n Guess a number between 1 and 1000");
             while (input.hasNext()){
                 int guessValue = guessNo();
                 int userGuess = input.nextInt();
                 //WINNING
                 if (guessValue==userGuess){
                     System.out.println("Congratulations. You\n" +
                         "guessed the number!");
                     System.out.println("Press Continue or press \"Ctrl+d to cancel\"");
                     frequencyWin++;
                     if (frequencyWin>=10) System.out.println("Either you know the secret\n" +
                             "or you got lucky!");
                 if (frequencyWin==10 && frequencyAttempt==10)
                     System.out.println("Aha! You know the secret!");
                 }
                 //LOSING
                 else if (guessValue<userGuess) {
                     System.out.println("Too high. Try again!");
                     frequencyLose++;
                 if (frequencyLose>=10) System.out.println("You should be able to do better!");}
                 else if (guessValue>userGuess) {
                     System.out.println("Too Low. Try again!");
                 frequencyLose++;}
                 //TOTAL GAME PLAYS
                 frequencyAttempt++;
             }
        }
}