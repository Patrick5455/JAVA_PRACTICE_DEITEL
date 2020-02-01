package classworks_assignments;

import  java.util.Scanner;
public class EvenNum {

    public static void main(String... args){
        Scanner input = new Scanner (System.in);

        int counter =0;
        System.out.println("Enter the range of even No to sum");
        int range = 2*input.nextInt();
        int total = 0;

        while (counter<=range) {
        counter++;
        if (counter%2==0)
        total+=counter;
        }
    System.out.println(total);
    }
}
