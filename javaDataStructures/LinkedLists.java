package javaDataStructures;

import exercises_7.SalesAggregator;

import java.util.LinkedList;
public class LinkedLists {

    public static void  main(String... args) {
        //LinkedListis similiar to arrayList but they are different in terms of performance nad usage.

        LinkedList<String> names = new LinkedList<String>();

        names.add("Patrick");
        names.add("Ojunde");
        names.add("Opeyemi");

        for (String name :names){
            System.out.println(name); }

        names.addLast("Kayode");
        names.addFirst("Caroline");
        names.addFirst("x-remove");
        names.removeFirst();

        for (String name :names){  System.out.println(name); }

        System.out.println(names.size());

        names.add(1,"Family");
        names.remove(1);

        names.set(2, "index 2 -Damilare");

        for (String name :names){  System.out.println(name); }

        //you can also sort with sort method.


     }
}
