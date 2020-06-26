package jenkovLambda;

public class LambdaInterfaceImpl {

    public static void main(String[] args) {

        // Lambda expressions only implement one interface methods.
        // Except in the case of default methods

        // implementing with no parameter
       // LambdaInterface lambdaInterface = () -> System.out.print("Hello Word");


        // implementing with single parameter
      //  LambdaInterface lambdaInterface =
        //        (String name) -> System.out.println("Yes " + name );


        // Implementing with return statement and parameter
        LambdaInterface lambdaInterface = (name) -> {
            System.out.println("Hello World " + name);
            return "Hello World " + name;
        };

        lambdaInterface.lambdaImpl("Patrick");

        //NB:: The same way we had one paremeter declarations,
        // we can also have more than one parameters.
        // Also observe that the parameters does not required us to state its data type


    }

}
