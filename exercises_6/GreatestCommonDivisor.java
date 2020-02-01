package exercises_6;

import java.util.Scanner;
public class GreatestCommonDivisor {
    static int a = 0; static int b = 0;
    static int gcd = 0; static int r;
    static Scanner input = new Scanner(System.in);

    public static void main(String... args) {
        System.out.println("\t\t\tGreatest Common Divisor (GCD) Calculator");
        System.out.println("Enter first no");
        a = input.nextInt();
        System.out.println("Enter second no");
        b = input.nextInt();
        gcdF();
        System.out.printf("GCD is %d",gcdF());
    }
    static int gcdF() {
        if (a==0) gcd = b; else if (b==0) gcd = a;
        else {
            int big = Math.max(a,b); int small = Math.min(a,b);
            r = big%small;
            if (r==0) gcd=small;
            else{
                while(r!=0){
                    big=small; small=r; r=big%small;
                    if (r==0) gcd=small;
                }
            }

        }
        return gcd;
    }
}