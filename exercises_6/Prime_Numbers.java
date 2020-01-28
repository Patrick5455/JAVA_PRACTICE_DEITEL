package exercises_6;

import java.util.Scanner;
public class Prime_Numbers {
    static Scanner input = new Scanner (System.in);

    public static void main(String... args){
        System.out.println("Enter range of prime number to find:");
        int range = input.nextInt();
        for (int number=2; number<=range; number++)
            isPrime(number);
        }
    static void isPrime(int num){
        int pCount =0;
        if (num<2) System.out.println("Enter a number greater than 1");
        for (int factor=1; factor<=num; factor++ )
            if (num%factor==0) pCount++;
        if (pCount==2) System.out.printf("%d is a prime number%n", num);
    }
}
