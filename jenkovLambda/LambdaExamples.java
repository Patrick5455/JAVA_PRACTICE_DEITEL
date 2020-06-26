package jenkovLambda;

import java.util.Comparator;
import java.util.stream.Stream;

public class LambdaExamples {

    public static void main(String[] args) {

        // overridden implementation of compratator interface defalut method
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        };


        System.out.printf("%s:%n %d%n","Normal Implementation",
                stringComparator.compare("Patrick", "Ojunde"));


    // achieving the above with lambda

 //   String a = "Patrick"; String b = "Ojunde";

    Comparator<String> stringComparatorLambda =
            // use of "String" before a and b is optional in the lambda implementation
            // also the use of return in curly braces is optional
            (a, b) -> a.compareTo(b);


     System.out.printf("%s:%n %d","Lambda Implementation",
             stringComparatorLambda.compare("Patrick", "Ojunde"));


}

}
