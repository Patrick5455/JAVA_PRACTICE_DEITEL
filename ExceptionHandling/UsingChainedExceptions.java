package ExceptionHandling;

// chained Exceptions
public class UsingChainedExceptions {

    public static void main(String[] args) {

        try{

            method1();
        }

        catch (Exception ex){
            // exceptions thrown from method1
            ex.printStackTrace();
        }
    }

    private static void method1()  throws Exception{

        try{

            method2();
        }
        catch (Exception ex){

            //exception thrown from method 2

            throw new Exception("Exception thrown in method1", ex);
        }
    }

    //call method3: throw exceptions back to method1
    public static void method2() throws Exception{

        try {
            method3();
        }
    catch (Exception exception){

            // exception thrown from method3
        throw new Exception("Exception thrown in method2", exception);
        }

    }

    // throw exception back to method 2
   public static void method3() throws Exception{

        throw new Exception("Exception thrown in method3");
   }


}
