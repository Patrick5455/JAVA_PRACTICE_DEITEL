package exercises_7;

import javax.crypto.SecretKey;
import java.util.Arrays;
import java.security.SecureRandom;
public class ArrayStatements{
    public static  void main (String... args) {

        SecureRandom randomValue =new SecureRandom();
                        //Write Java statements to accomplish each of the following tasks:

        //1.Display the value of element 6 of array f.
        int[] f = new int[7];
        System.out.println(f[6]);

        //2.Initialize each of the five elements of one-dimensional integer array g to 8.
        int [] g = {8,8,8,8,8};

        //Total the 100 elements of floating-point array c
        double [] c = new double[100];

        for(double e: c){
            double total=0;
            total+=e;
        }

        //Copy 11-element array a into the first portion of array b, which contains 34 elements.
        int [] a = {1,2,3,4,5,6,7,8,9,10,11};
        int [] b = new int [34];
        System.arraycopy(a,0,b,0,11);
        for(int i =0; i<11; i++){
            int ele = b[i];
            System.out.printf("%d ",ele);
            System.out.println();
        }

        //Determine and display the smallest and largest values contained in 99-element floating point array w
        double [] w = new double [99];

        for(int i =0; i<w.length; i++){
            w[i]= randomValue.nextDouble();
        }
        double smallest = w[0]; double largest = w[0];

        //Print out randomly generated values in array
        for(int i =0; i<w.length; i++){
            if(i%5==0 && i!=0) System.out.println();
            System.out.printf(" %.1f  ",w[i]);
        }

        for (int i =0; i<w.length; i++){
            if (w[i]<smallest) smallest = w[i];
            if (w[i]>largest) largest = w[i];
        }
        System.out.printf("%nSmallest : %.1f%n", smallest);
        System.out.printf("Largest : %.1f%n", largest);
        }
}

