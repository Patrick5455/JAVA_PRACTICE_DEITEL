package errorHandling;

public class TryCatchFinally {




        //The finally block is used with the try block.
        // The finally block always executes whether the try block throws exception or not.
        // The finally block gives us the chance to always release our resources

        // It is a good practice to use finally block with your try catch block

        // The only time our finally block will not run it when System.exit(); method is called.
        // Where the System exists

    public static int returnInt () {

        int x = 100;



        try {
            x=x/0;

            // This would not execute because it is an Exception
            System.out.println("In Try Block but never printed" +x);

            return x;


        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

            System.out.println("In Catch Block: "+x);


            System.out.println("Before System Exit");

            // The only time our finally block will not run it when System.exit(); method is called.

           // System.exit(1);


        } finally {

            // because x is reassigned in te finnaly block, the return of the finally block will override the return from the try block

            x=5000;

            System.out.println("Finally Caught_--------- \n Resource closed------- \n Resource leak exterminated");

            // ideally, return statement should not be in the finally block
          //  return x;

        }

        System.out.println("After Finally: "+x);
        return x;
    }

    public static void main (String... args){

        returnInt();

    }
}
