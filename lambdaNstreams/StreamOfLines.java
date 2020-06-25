package lambdaNstreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StreamOfLines {

    public static void main(String[] args) throws FileNotFoundException {
        File trust = new File("/home/patrick/Documents/Semicolon/Java/Java Program/Java_With_Paul_Deitel" +
                "/Algorithm_Solutions/lambdaNstreamstest.txt");

        PrintWriter writer = new PrintWriter(trust);

        writer.write("In God We Trust, Other things we test");
        writer.close();
    }


}
