package iterators_Algorithm_challenges;

public class NumberPyramid {
    public static void main(String... args){

        int row =1; int column =0; int counter = 5;
        int number =1; int space =5; int columns=0;

        for (row =0; row<counter; row++){
            columns+=2;
            for (space =5; space>row; space--){
                System.out.print(" ");
            }
            for (column=1; column<columns; column++){
                System.out.printf("%d", number);
            }
            number++;
            System.out.println();
        }

    }
}
