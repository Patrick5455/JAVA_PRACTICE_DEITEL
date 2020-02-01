package exercises_6;

import java.security.SecureRandom;

//statements that displays a random number from each of the following sets:

public class RandomSets{
    private static final  SecureRandom randomValue = new SecureRandom();

    public static void main (String... args){
        displayRanges();
    }

    static void setA() {
        int setA=0;
        for (int number = 0; number < 5; number++) {
            setA = 2 + 2 * randomValue.nextInt(5);
            System.out.printf(" %d",setA);
            }
        System.out.println();
    }

    static void setB() {
        int setB=0;
        for (int number = 0; number < 5; number++) {
            setB = 3 + 2 * randomValue.nextInt(5);
            System.out.printf(" %d", setB);
        }
        System.out.println();
    }

        static void setC(){
             int setC=0;
            for (int number =0; number<5; number++) {
                setC = 6 + 4 * randomValue.nextInt(5);
                System.out.printf(" %d", setC);
            }
            System.out.println();
        }

        static void displayRanges(){
            System.out.println("The following are random values in ranges:");
           setA();  setB(); setC();
        }
}
