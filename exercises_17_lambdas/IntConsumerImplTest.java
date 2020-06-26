package exercises_17_lambdas;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Key;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static exercises_6.CrapsGameModified.value;
import static org.junit.jupiter.api.Assertions.*;

class IntConsumerImplTest {

    @Test
    void testIntConsumer(IntConsumer consumer){



    }


    @Test
    void square(){

    }

    @Test
    void DirectoryStream() throws IOException {
        Stream<Path> pathStream = Files.list(Paths.get("/home/patrick/Documents/").toAbsolutePath());
        Map<String, Long> files;
        files = pathStream.filter(Files::isRegularFile)
                .map(f -> f.getFileName().toString())
                .map(n -> n.substring(n.lastIndexOf(".")+1))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        files.forEach((key, value) -> System.out.printf("%s %s%n", key, value));



    }
}