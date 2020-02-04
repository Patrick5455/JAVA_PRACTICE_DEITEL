package exercises_7;

public class ThreeByFiveArrays {

//    Label the elements of three-by-five two-dimensional array sales
//    which they’re set to zero by the following program segment:
//    to indicate the order in
//for (int row = 0; row < sales.length; row++)
//    {
//        for (int col = 0; col < sales[row].length; col++)
//        {
//            sales[row][col] = 0;
//        }
//    }
//


    public static void main(String... args){

        int [] [] sales = new int [3] [5];

        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = 0;
            }
        }

    }

}
