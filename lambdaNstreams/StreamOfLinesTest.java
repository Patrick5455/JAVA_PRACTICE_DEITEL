package lambdaNstreams;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamOfLinesTest {


    @Test
     void streamLines()  throws IOException {

        //Regex that matches one or more
        Pattern pattern = Pattern.compile("\\s+");

        //count occurences of each word in a Stream<String> sorted by word
        Map<String, Long> wordCounts=
                Files.lines(Paths.get("/home/patrick/Documents/Semicolon/Java" +
                        "/Java Program/Java_With_Paul_Deitel" +
                        "/Algorithm_Solutions/lambdaNstreamstest.txt"))
                .map(line -> line.replaceAll("(?!)\\p{P}", ""))
                .flatMap(line -> pattern.splitAsStream(line))
                .collect(Collectors.groupingBy(String::toLowerCase,
                        TreeMap::new, Collectors.counting()));

        //display the words grouped by starting letter
        wordCounts.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(entry -> entry.getKey().charAt(0),
                        TreeMap::new, Collectors.toList()))
                .forEach((letter, wordList) ->
        {
            System.out.printf("%n%C%n", letter);
            wordList.stream().forEach(word -> System.out.printf("%13s: %d%n", word.getKey(), word.getValue()));

        });



    }

}