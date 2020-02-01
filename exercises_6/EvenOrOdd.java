package exercises_6;

import java.util.Scanner;
public class EvenOrOdd {

   static final  Scanner input = new Scanner (System.in);

   public static void main (String... args){

       System.out.println("Enter pair of single integers\n " +
               "To cancel programee press \"Ctrl+Z\" on Windows or \"Ctrl+D\" " +
               "on linux or Mac");
       isEven();
   }

   static void isEven (){

       while (input.hasNext()) {
           int number = input.nextInt();

           System.out.printf("%B", number%2==0);
       }
   }


}
