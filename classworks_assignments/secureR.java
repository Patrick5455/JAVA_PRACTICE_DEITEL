package classworks_assignments;

import java.security.SecureRandom;
public class secureR {

   public static void main (String... args){

        SecureRandom randomValue = new SecureRandom();

        for (int c =0; c<=20;c++ ){
            int obj = randomValue.nextInt();
            if (obj%3==0) System.out.println(obj);
        }
   }
}
