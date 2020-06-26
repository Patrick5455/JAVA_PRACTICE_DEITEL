package jenkovLambda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public interface FunctionalInterface {

    // default interface method
    default void printToFile(String text, OutputStream outputStream) {

        try{
            outputStream.write(text.getBytes(StandardCharsets.UTF_8));
        }

        catch (IOException e) {
            e.printStackTrace();
            System.err.print("Error when working with file");
        }


    }

    // static interface method
    static void justPrint() {
        System.out.println("Static Method");
    }


    // abstract interface method
    void mustImplement();
}

