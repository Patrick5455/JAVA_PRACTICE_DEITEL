package exercises_7;

import java.util.Arrays;
import java.util.Scanner;
public class DuplicateEliminate {
    public static void main (String... args){
        Scanner input = new Scanner(System.in);
        int [] frequency = new int [101];

       for (int count=0; count<5; count++){
           System.out.println("Enter a Number between 10 & 100");
           int user = input.nextInt();
           if (user>=10&&user<=100){
               ++frequency[user];
           }
           else{System.out.println("Enter a number between 10 & 100");}
           }
        System.out.println("Unique Array Values: ");
        for(int i =0; i<frequency.length; i++){
            if (frequency[i]==1){
                System.out.printf("%d%n",i);
            }
       }


    }
}
