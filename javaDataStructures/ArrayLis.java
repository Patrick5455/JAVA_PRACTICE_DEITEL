package javaDataStructures;

import java.util.ArrayList;
public class ArrayLis {

    public static void main(String... args) {

        ArrayList<String> arr = new ArrayList<String>(3);

        arr.add("Patrick");
        arr.add("Bolu");
        arr.add("Mayowa");
        arr.add("FLorenece");

        for (int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println();

        System.out.println("Using enhanced for");
        for(String x: arr){
            System.out.println(x);
        }

        System.out.println();

        System.out.println("Array Size");
        System.out.println(arr.size());

        System.out.println();
        System.out.println("Remove item");

        //remove(); - remove a particluar element at an index
        //clear(); - clear all data in the array.
        //set(); change the value at a particular index
        //trimToSize(); - trims the array to the actual number of elements the array contains



    }




}
