package exercises_7;

public class VariableLengthArgument2 {

    public static int product(int... series){
        int productTotal=1;

        for (int x: series)
            productTotal *= x;

        return productTotal;
    }


    public static  void main (String... args){

        int series1 = 30;int series2 =40;int series3 =50;
        int series4 =60; int series5 =70;

        System.out.printf(" %d * %d = %,d%n ", series1, series2, product(series1,series2));
        System.out.printf("%d * %d * %d = %,d%n ", series1, series2, series3, product(series1,series2, series3));
        System.out.printf("%d * %d * %d * %d = %,d%n ", series1, series2, series3, series4, product(series1,series2, series3, series4));
        System.out.printf("%d * %d * %d * %d * %,d = %,d%n ", series1, series2, series3, series4,series5,
                product(series1,series2, series3, series4, series5));


    }
}

