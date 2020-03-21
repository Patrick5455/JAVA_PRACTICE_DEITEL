package randomAlgorithm;

public class Recursion {

    //N! = N x (N-1) X (N-2) X...X 2 X 1


    public static int factorial(int n){
        if(n<=1)
        return 1;

        else return (n* factorial(n-1));
    }

    public static void main (String... args){

        System.out.println( factorial(5));

    }


}
