package randomAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;
public class AddArrayList {
    public static void main (String... args){
        ArrayList <Integer> arr = new ArrayList<Integer> ();
        Scanner input = new Scanner(System.in);
        int total =0; int counter=0;
        while (input.hasNext()){
            int num = input.nextInt();
            arr.add(num);
            total+=arr.get(counter);
            counter++;
        }
        System.out.printf("Total is %d",total);




    }
}
