package classworks_assignments;

import java.util.Scanner;
public class SmallestLargestNum {

    public static void main(String... args){
        Scanner input = new Scanner (System.in);
        int smallest=0; int largest=0;

        System.out.println("Enter Numbers  and \"ctrl+d\" to cancel");

        int currentNum = input.nextInt();

        smallest = currentNum; largest = currentNum;

        while(input.hasNext()){

            int nextNum = input.nextInt();

            if (nextNum < smallest) smallest = nextNum;
            //else {largest= nextNum;}
            if (nextNum>largest) largest = nextNum;
        }
        System.out.printf("Smallest Number is %d %n Largest Number is %d", smallest, largest);
    }
}
