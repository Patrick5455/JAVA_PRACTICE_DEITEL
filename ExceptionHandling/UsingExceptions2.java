package ExceptionHandling;

// Stack unwinding and obtaining data frm an exception object
public class UsingExceptions2 {

    public static void main(String[] args) {

        try {
            method1();
        }

        catch (Exception exception){

            // catch exception thrown in method1
            System.err.printf("%S%n%n", exception.getMessage());
            exception.printStackTrace();
            // obtain the stack-trace information
            StackTraceElement [] traceElements = exception.getStackTrace();
            System.err.printf("%nStack trace from getStackTrace: %n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");
            //loop through traceElements to get exception description


            for (StackTraceElement e: traceElements){

                System.out.printf("%s\t", e.getClassName());
                System.out.printf("%s\t", e.getFileName());
                System.out.printf("%s\t", e.getLineNumber());
                System.out.printf("%s\t", e.getMethodName());
                System.out.println();
            }
        }
    }

    // call method2; throws exceptions back to method1
    public static void method1() throws Exception{
        method2();
    }

    //call method3; throw exceptions back to method1
    public static void method2() throws Exception{
        method3();
    }

    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method3");
    }

}
