package jenkovLambda;

public class LambdaInterfaceImpl {

    public static void main(String[] args) {

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


    }

}
