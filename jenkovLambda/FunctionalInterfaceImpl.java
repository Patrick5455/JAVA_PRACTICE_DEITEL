package jenkovLambda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FunctionalInterfaceImpl {

    //Java Lambda expressions can implement interfaces with a single
    // unimplemented method (abstract) method.
    //But as many default or static method as you like.

    // Such interface is called the Functional Interface


    public static void main(String[] args) throws FileNotFoundException {

        FunctionalInterface functionalInterface = () -> System.out.println("must implement abstract");

        // must implement abstract
        functionalInterface.mustImplement();

        // may implement default
        functionalInterface.printToFile("May Implement default.\nPrinted to file", new FileOutputStream("here.txt"));


        //may implement static
        FunctionalInterface.justPrint();

    }


}
