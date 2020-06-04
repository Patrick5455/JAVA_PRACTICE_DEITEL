package recursionInJava;

public class Factorial {

    // recusrion is when a method calls itself in itself

    public static int factorial(int n){
        if (n<=1)
            return 1;
        else return n * (factorial(n-1));
    }

    public static void main(String... args){
        System.out.println(factorial(5));
    }
}
