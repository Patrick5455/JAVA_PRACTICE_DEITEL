package exercises_8.Composition;

public class Date {

    private int day;
    private int month;
    private int year;

    private static final int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year) {

        //check if month in range
        if (month < 0 || month > 12)
            throw new IllegalArgumentException ("Month out of range");

        //check if day in range for month
        if (day<0 || (day>daysInMonth[month] && !(month ==2 && day == 29)))
            throw  new IllegalArgumentException("Day out of range for selected month");

        //check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100!=0 )))
            throw  new IllegalArgumentException("day out of range for the specified month and year");

        this.day = day;
        this.month = month;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);

    }

    // NB: The toString explicitly declared here is overiding the Java.lang.Object toString method.
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}
