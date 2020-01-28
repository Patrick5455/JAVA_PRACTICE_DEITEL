package exercises_6;

import java.util.Scanner;
public class QualityPoints {
static Scanner input = new Scanner (System.in);

    public static void main(String... args){
        System.out.println("Enter Student Average");
        qualityPoints();
    }

    static void qualityPoints(){
        int user = input.nextInt();
         if (user >=90 && user <=100) System.out.println(4);
         else if (user>=80 && user<=89) System.out.println(3);
         else if (user>=70 && user<=79) System.out.println(2);
        else  if (user>=60 && user<=69) System.out.println(1);
        else if (user<60) System.out.println(0);
        }
}

