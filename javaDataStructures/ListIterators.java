package javaDataStructures;

import java.util.*;
import java.util.ListIterator;

public class ListIterators {

    public static void main(String... args){
        /* List Iterators:
        public boolean hasNext();
        public object next();
        public boolean hasPrevious();
        public Object previous();
        */

        ArrayList <String> names = new ArrayList<>();

        names.add("Mark");
        names.add("tom");
        names.add("john");
        names.add("jack");
        names.add("patrik");

        //creating a lis iterator object
        ListIterator<String>  lis = names.listIterator();

        //prints in ascending order
        while (lis.hasNext())
            System.out.println(lis.next());

        System.out.println("");

        //prints in reverse order
        while (lis.hasPrevious())
            System.out.println(lis.previous());


    }

}
