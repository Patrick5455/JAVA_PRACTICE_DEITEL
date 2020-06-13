package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFiles{

    public static void main(String... args){

        BufferedReader buffer = null;

        try {
            buffer = new BufferedReader(
                    new FileReader(
                            "testJavaFile.txt"));

            System.out.println(buffer.lines());

            String lines = buffer.readLine();
            while (lines != null){
                System.out.println(lines);
            }

        }

        catch (IOException e){
            e.printStackTrace();
        }


    }
}