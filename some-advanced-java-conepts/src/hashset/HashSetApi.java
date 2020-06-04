package hashset;

import java.lang.management.ClassLoadingMXBean;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetApi {

    public static void main (String... args){

        // we use the default hashSet constructor
        HashSet<String> hashSet = new HashSet<>();

        // NB: HashSet because it is a set does not allow duplicate values
        hashSet.add("Patrick");
        hashSet.add("Mayowa");
        hashSet.add("Boluwatife");
        hashSet.add("Florence");

        System.out.println("Size: "+hashSet.size());
        System.out.println("Is set empty: "+ hashSet.isEmpty());
        System.out.println("Does set contain Mayowa: "+hashSet.contains("Mayowa"));
        System.out.println("Does set contain Sola: "+hashSet.contains("Sola"));


        // let's use hashSet iterators to loop through the sset
        //NB: hashset iterator does noe use hasPrevious method

        Iterator<String> itr = hashSet.iterator();

        System.out.println("Print elements out using iterator");

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Remove elements using iterator");
        while (itr.hasNext()){
            hashSet.remove(itr.next());
        }

        //clone hashset
        System.out.println("Cloned Elements: "+hashSet.clone());

        hashSet.clear();

        System.out.println("hashSet size after clear: "+hashSet.size());








    }
}
