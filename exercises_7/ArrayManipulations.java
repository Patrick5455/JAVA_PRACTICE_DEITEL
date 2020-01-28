package exercises_7;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayManipulations {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        //Consider a two-by-three integer array t.
        //a) Write a statement that declares and creates t
        int[][] t = new int[2][3];

        //Write access expressions for all the elements in row 1 of t.
        int a = t[1][0];
        int b = t[1][1];
        int c = t[1][2];
        //Write a single statement that sets the element of t in row 0 and column 1 to zero.
        int ele = t[0][1] = 0;
        //Write individual statements to initialize each element of t to zero.
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

//        //Write a nested for statement that initializes each element of t to zero.
        for (int[] row : t) {
            for (int column : row) column = 0;
        }
        //Write a nested for statement that inputs the values for the elements of t from the user.
        for (int row = 0; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++) {

                System.out.printf("Enter Value for row [%d] column [%d]%n", row, column);
                t[row][column] = input.nextInt();
            }
        }

        // Print the New Values in the array
        for (int row = 0; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++) {
                System.out.printf("Value for row [%d] column [%d] = %d%n", row, column, t[row][column]);
            }
        }

        //Write a series of statements that determines and displays the smallest value in t.
        int smallest = t[0][0];
        for (int[] row : t) {
            for (int column : row) {
                if (column < smallest) smallest = column;
            }
        }
        System.out.printf("Smallest NUmber is %d%n", smallest);

        //Write a single printf statement that displays the elements of the first row of t.
        System.out.printf("Elements of the first row are: %n%d %d %d%n", t[0][0], t[0][1], t[0][2]);

        //Write a statement that totals the elements of the third column of t. Do not use repetition.

        int total = 0;
        for (int row = 0; row < t.length; row++) {
            total += t[row][2];
        }
        System.out.printf("Total of third column in array t is %d%n", total);

        //Write a series of statements that displays the contents of t in tabular format.
        // List the column indices as headings across the top, and list the row indices at the left of each row.

        System.out.print("\t");
        for (int column = 0; column < t.length + 1; column++)
            System.out.printf(" Column %d\t", column + 1);

        for (int row = 0; row < t.length; row++) {
            System.out.printf("%n%nRow %d\t", row + 1);
            for (int column = 0; column < t[row].length; column++) {
                System.out.printf("%d\t\t\t", t[row][column]);
            }
            System.out.println();
        }
    }
}

















