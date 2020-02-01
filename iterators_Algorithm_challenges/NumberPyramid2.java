package iterators_Algorithm_challenges;

public class NumberPyramid2 {
    public static void main(String... args){

        int row =1; int column =0; int counter = 5;
        int number =1; int space =5;

        for (row =1; row<=counter; row++){
            for (space =5; space>row; space--){
                System.out.print(" ");
            }
            for (int column2 = number; column2>1; column2--){
                System.out.printf("%d", column2);
            }
             for (column=1; column<=row; column++){
                System.out.printf("%d", column);
            }
            number++;
            System.out.println();
        }

    }
}
