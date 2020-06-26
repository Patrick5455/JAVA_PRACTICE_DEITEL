package recursion;

import java.math.BigInteger;

public class Calculator {

    public static void main(String[] args) {

    }

    static  int factorial(int number){
        if(number <=1){
            return BigInteger.ONE.intValue();
        }
        else {
            return number * factorial(number-1);
        }
    }


//    static  Integer factorial(BigInteger number){
//        if(number <= BigInteger.ONE){
//            return BigInteger.ONE.intValue();
//        }
//        else {
//            return number * factorial(number-1);
//        }
//    }


}
