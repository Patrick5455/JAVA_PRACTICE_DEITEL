package javaDataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSets {
    //HashSet belongs to the set category in java.
    //The difference is that set can contain duplicate elements but set can only contain unique elements

    //Also the iterator for the set in java does not have hasPrevious method and previous value.

    public static void main(String... args){

        HashSet <String> name = new HashSet<String>(6);

        //note the difference in the iterator names of sets and lists
        Iterator<String> hash = name.iterator();

        name.add("Mark");
        name.add("Tom");
        name.add("Patrick");
        name.add("Gold");
        name.add("Silver");
        name.add("Bronze");


        while (hash.hasNext())
            System.out.println(hash.next());

        //only ListIterator has hasPrevious() and previous value.

        System.out.println(name.remove("Bronze"));



    }


}
