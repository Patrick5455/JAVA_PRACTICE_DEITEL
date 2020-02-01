package randomAlgorithm;

import java.util.Scanner;
public class Addarray {
    public static void main(String... args){
        int [] arr = new int [10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a set of ten numbers to sum");
        int total =0;
        for (int i=0; i<arr.length; i++){
            System.out.printf("Number %d%n", i+1);
            int num = input.nextInt();
            arr[i]=num; total+=arr[i];
        }
        System.out.printf("Total is %d", total);




    }
}
