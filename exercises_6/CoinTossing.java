package exercises_6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing{

    private static Scanner input = new Scanner(System.in);
    private static SecureRandom randomValue = new SecureRandom();
    private static enum Coin {HEAD, TAIL}
    static int frequencyHead =0; static int frequencyTail =0;
    static Coin coinFace;

    public static void main (String... args){
        System.out.println("Press \"1\" to toss coin and \"Ctrl+d to cancel\"");
        while(input.hasNext()){
            System.out.println("\nPress \"1\" to toss coin again or \"Ctrl+d to cancel\"");
            int user = input.nextInt();
            if (user==1) tossCounter();
            else {System.out.println("Please Press \"1\" to toss coin");}
        }
        System.out.printf("Total No of Coin Head is %d%n " +
                "Total No of Coin Tail is %d", frequencyHead, frequencyTail);
    }

    static void tossCounter(){
        int coinValue = flip();
        switch(coinValue){
            case 1:
                coinFace = Coin.HEAD;
                frequencyHead++;
                break;
            case 2:
                coinFace = Coin.TAIL;
                frequencyTail++;
                break;
        }
    }

    static int flip(){
     int tossCoin = 1+randomValue.nextInt(2);
    return tossCoin;
    }
}
