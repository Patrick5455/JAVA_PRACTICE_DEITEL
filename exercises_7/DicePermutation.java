package exercises_7;

import  java.util.Random;
public class DiceRolling {

    static Random randValue = new Random();
    static int dice1;
    static int dice2;
    static int diceArray [] = new int[13];

    static int noOfRolls = 600+randValue.nextInt(36000);

    public static int rolldices(){
        dice1 = 1+randValue.nextInt(6);
        dice2 = 1+randValue.nextInt(6);
        return dice1+dice2;
    }

    public static void actionTime(){
        int face=0;
        for (int times =0; times<=noOfRolls; times++){
            ++diceArray[rolldices()];
        }
    }

    public static void frequencyTable(){
          System.out.printf("Dice Sum\tFrequency%n");
        for (int diceSum =2; diceSum<diceArray.length; diceSum++){
            System.out.printf("%4d %,14d%n", diceSum, diceArray[diceSum]);
        }
    }

    public static void main(String... args){
        System.out.printf("A TABLE OF POSSIBLE COMBINATIONS FOR TWO DICES - %d TIMES%n", noOfRolls);
        actionTime();
        frequencyTable();
    }
}
