package listIterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {

    public static void main(String... args){

        /*
        NB: ListIterator has four methods viz:
        *1. public boolean hasNext();
        * 2. public Object next();
        *3. public boolean hasPrevious();
        * public object previous();
        * */

        // let's use arraylist default constructor
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Patrick");
        arr.add("Mayowa");
        arr.add("Bolu");

        // create an object of listIterator
        ListIterator <String> itr = arr.listIterator();

        System.out.println("Using hasNext and next");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Using hasPrevious and previous");
        while ((itr.hasPrevious())){
            System.out.println(itr.previous());
        }



    }
}
