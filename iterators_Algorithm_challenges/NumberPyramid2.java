package iterators_Algorithm_challenges;

public class NumberPyramid2{
    public static void main(String... args){

        int row =1; int column =0; int counter = 5;
        int number =1; int space =5;
        for (row =0; row<counter; row++) {
            for (space = 5; space > row; space--)
                System.out.print(" ");
            for (int x=number; x>1; x--)
               System.out.printf("%d", x);
            for (column = 1; column <=number; column++) {
               System.out.printf("%d", column);
            }
            number++;
            System.out.println();
        }
        } }
