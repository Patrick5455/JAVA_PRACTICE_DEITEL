package recursion;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void  factorialWIthInt(){

        int answer = Calculator.factorial(5);
        assertEquals(120, answer);
    }

//    @Test
//    void factorialWithBigInteger(){
//
//        BigInteger ourNUmber = new BigInteger("5");
//        BigInteger answer = Calculator.factorial(ourNUmber);
//        assertEquals(120, answer.intValue());
//    }



}