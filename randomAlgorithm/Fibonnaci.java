package randomAlgorithm;

import java.util.Scanner;
public class Fibonnaci {
    static Scanner input = new Scanner (System.in);
    static int firstNum =0;
    static int secondNum =1;
    static int count = 1;
    static int series;
    static int limit;

    public static void main (String... args) {
        System.out.println("Enter the Fibonnaci series you want to find.");
        fibonacciSeries();
        //System.out.println("Enter the Fibonnaci limit you want to find.");
        //fibonnaciLimit();
    }
        static void fibonacciSeries(){
            series = input.nextInt();
            System.out.printf("Fibonnaci numbers of %d are:%n", series);
            System.out.printf("%d%n%d%n", firstNum, secondNum);
            while (count<series){
                int nextNum = firstNum + secondNum;
                System.out.printf("%d%n",nextNum);
                firstNum = secondNum;
                secondNum = nextNum;
                count++;
                 }
    }

    static void fibonnaciLimit (String... args){
        limit = input.nextInt();
        System.out.printf("Fibonnaci numbers below %d are:%n", limit);
        System.out.printf("%d%n%d%n", firstNum, secondNum);
        while (secondNum<limit){
            count++;
            int nextNum = firstNum + secondNum;
            System.out.printf("%d%n",secondNum);
            firstNum = secondNum;
            secondNum = nextNum;
           }


    }
}
