package classworks_assignments;

public class PrintStars {

    public static void main (String... args){
        int counter =5;
        int row =1;

        while (row<counter) {
            int columna = 0;
            int columnb =0;
            int space =5;
            //COLUMN A
            while (columna < row) {
                System.out.print("*");
                columna++;
            }
            //SPACES
            while (space>row){
                System.out.print("  ");
                --space;
            }
            //COLUMN B
            while (columnb < row){
                System.out.print("*");
                columnb++;
            }
            System.out.println();
            row++;
            }
        }
    }
