package lambdaNstreams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamsTest {


    @Test
    void  streamIntegers (){

        Integer [] values = {2,9,5,0,3,7,1,4,8,6};

        System.out.printf("Sorted Values %s%n", Arrays.stream(values)
                                                       .filter(value -> value>4)
                                                       .collect(Collectors.toList()));
    }



}