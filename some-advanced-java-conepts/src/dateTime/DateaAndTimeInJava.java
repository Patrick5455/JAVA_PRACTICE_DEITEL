package dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateaAndTimeInJava {

    public static void main(String... args){

        Date date = new Date();

        System.out.println(date.toString());

        System.out.println(date.getTime()); // get the milliseconds

        // other methods such as getMonth, getYear and getDay have all been deprecated

       // System.out.println(date.getDate());
//        System.out.println(date.getHours());
//        System.out.println(date.getYear());
//        System.out.println(1900 + date.getYear()); // you need to add 1900 to get the correct year
//        System.out.println(date.getMonth() + 1); // you need to add 1 to get the correct year

        // customise the date output using SimpleDateFormat from  java.text package

        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss"); // our own customization
        System.out.println(sdf.format(date));
    }
}
