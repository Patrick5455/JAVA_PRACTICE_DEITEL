package linkedList;

import java.util.LinkedList;
public class LinkedListApi {

    // Note: The size of the linkedList is not specified at initialization
    public static void main(String... args){

        LinkedList<String> linkedList = new LinkedList<String>();

        // add elemeents to LikedList
        linkedList.add("Patrick");
        linkedList.add("Mayowa");
        linkedList.add("Boluwatife");
        linkedList.add("Florence");

        // add first and last elements to linkedList
        linkedList.addFirst("Daddy");
        linkedList.addLast("Mummy");

        // check size of list
        System.out.println("Size of linkedList before operations: "+linkedList.size());

        // print elements of list
        for(String x: linkedList)
            System.out.println(x);

        //remove first and list elements in list
        System.out.printf("First and last elements before removal: %s & %s ", linkedList.getFirst(), linkedList.getLast());
        linkedList.removeFirst(); linkedList.removeLast();
        System.out.printf("First and last elements after removal: %s & %s ", linkedList.getFirst(), linkedList.getLast());

        // using overloaded add method
        linkedList.add(2, "Visitor1");

        // setting the values in an index
        System.out.println("Value @ index 3 before reset: "+ linkedList.get(3));
        linkedList.set(3, "Visitor 2");
        System.out.println("Value @ index 3 after reset" + linkedList.get(3));

        // check if a particular element is in list or not
        System.out.println("Does linkedList contain Florence: "+ linkedList.contains("Florence"));
        System.out.println("Does linkedList contain Biodun: "+ linkedList.contains("Biodun"));

        // remove other elements in linkedList
        System.out.println("Remove elements @ index 4: "+ linkedList.remove(4)+ "Removed!");










    }
}
