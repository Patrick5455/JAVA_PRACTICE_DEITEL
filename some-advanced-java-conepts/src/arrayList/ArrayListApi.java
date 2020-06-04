package arrayList;

import java.util.ArrayList;
public class ArrayListApi {

    int [] simpleArray = new int [5];

    public static void main(String... args){

        // Declaring an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(10);

        // Adding elements to an arrayList
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(14);
        arrayList.add(16);
        arrayList.add(18);

        System.out.println("Printing elements inside an array");
        for(int x : arrayList)
            System.out.println(x);


        // ArrayList methods

        // check size of array
        System.out.println("Size of the array: "+ arrayList.size());


        // trim array size
        System.out.println("Array Size before trim: "+ arrayList.size());
        arrayList.trimToSize();
        System.out.println("ArrayList after Trim: "+ arrayList.size());

        // remove element from array
        System.out.println("Remove element @ index 0: "+ arrayList.remove(0) + " Removed!");
        System.out.println("New size of arrayList: "+ arrayList.size());

        //change element at a particular index:
        System.out.println("Element at index 2 before change: "+ arrayList.get(2));
        arrayList.set(2, 100);
        System.out.println("Element at index 2 after change: "+ arrayList.get(2));

        // check if a arrayList contains a particular element:
        System.out.println("Does arrayList contains 100: "+ arrayList.contains(100));
        System.out.println("Does arrayList contains 1000: "+ arrayList.contains(1000));

        // trim array size
        System.out.println("Array Size before trim: "+ arrayList.size());
        arrayList.trimToSize();
        System.out.println("ArrayList after Trim: "+ arrayList.size());

        //clear all elements in an array
        System.out.println("Array size before clear: "+ arrayList.size());
        arrayList.clear();
        System.out.println("Array list after clear "+ arrayList.size());


    }
}
