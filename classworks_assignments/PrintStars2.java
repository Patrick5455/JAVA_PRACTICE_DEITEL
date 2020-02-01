package classworks_assignments;

public class PrintStars2 {

    public static void main(String... args) {
        int counter = 5;
        int row = 0;

        while (row < counter) {
            int column = 5;

            while (column > row) {
                System.out.print("*");
                --column;
            }
            System.out.println();
            --counter;

        }
    }
}
