package exercises_7;

import java.util.Arrays;
public class ArrayStatements2 {

    //Write statements that perform the following one-dimensional-array operations:
    public static void main (String... args){
//a) Set the 10 elements of integer array counts to zero.
        int [] counts = new int  [10];
        Arrays.fill(counts, 0);
       for (int i: counts){
           System.out.printf("%d ",i);
       }
        System.out.println();

       //b) Add one to each of the 15 elements of integer array bonus.

        int [] bonus = new int [15];
       for(int i : bonus){
           i+=1;
       }
//c) Display the five values of integer array bestScores in column format.
        int [] bestScores =  {1,2,3,4,5};

       for (int i : bestScores){
           System.out.println(i);
       }




    }
}
