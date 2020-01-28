package exercises_6;
import java.util.Scanner;
public class Multiples {
   static final Scanner input = new Scanner (System.in);
    public static void main (String... args){

        System.out.println("Enter pair of single integers\n " +
                "To cancel programee press \"Ctrl+Z\" on Windows or \"Ctrl+D\" " +
                "on linux or Mac");
        isMultiples();
    }

    static void isMultiples(){
        while(input.hasNext());
        {
            int x = input.nextInt();
            int y = x % 10;
            x = x / 10;
            System.out.printf("%B %n", x / y == y);
        }
    }
}
