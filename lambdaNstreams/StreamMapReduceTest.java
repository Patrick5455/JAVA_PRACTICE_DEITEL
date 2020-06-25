package lambdaNstreams;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class StreamMapReduceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void sumIntegers(){

      int sum =   IntStream.rangeClosed(1, 10)
                            .sum();

    assertEquals(55, sum);
    }


    @Test
    void summitMapping(){

    }


}