package exercises_6;

import java.security.SecureRandom;
public class Ranges {

    public static void main (String... args) {
        SecureRandom randomValue = new SecureRandom();

        int one = 1 + randomValue.nextInt(2);
        int two = 1 + randomValue.nextInt(100);
        int three = 0 + randomValue.nextInt(9);
        int four = 1000 + randomValue.nextInt(1112);
        int five = -1 + randomValue.nextInt(1);
        int six = -3 + randomValue.nextInt(11);

        System.out.printf("%d %d %d %d %d %d", one, two, three, four, five, six);
    }
}
