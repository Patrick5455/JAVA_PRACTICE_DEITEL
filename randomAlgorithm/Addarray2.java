package randomAlgorithm;

import java.util.Scanner;

public class Addarray2 {

    static Scanner input = new Scanner(System.in);

    static int user;  static int total = 0;

    public static void main(String... args) {

        System.out.println("Enter a set of  numbers to sum. To stop entry, press 0");

        user = input.nextInt();
        addNums(user);
        while (user != 0) {
            user = input.nextInt();
            addNums(user);
        }
        System.out.printf("Total is %d", addNums(user));
    }

    public static int addNums(int... numbers) {

            for (int num: numbers)
                total+=num;
            return total;
    }
}
