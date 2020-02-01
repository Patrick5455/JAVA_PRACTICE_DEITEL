package classworks_assignments;

public class PrintStarsReverse {

    public static void main (String... args){
        int counter =5;
        int row =1;

        while (row<counter) {
            int columna = 5;
            int columnb =5;
            int space =0;
            //COLUMN A
            while (columna > row) {
                System.out.print("*");
                columna--;
            }
            //SPACES
            while (space<row){
                System.out.print("  ");
                ++space;
            }
            //COLUMN B
            while (columnb > row){
                System.out.print("*");
                columnb--;
            }
            System.out.println();
            row++;
            }
        }
    }
