package exercises_8.enumTypes;

public enum Book {

    //n an enum declaration, it’s a syntax error to declare enum constants after the enum type’s
    //constructors, fields and methods.

    CHTP("C How to Program",
            "2013"),
    CPPHTP("C++ How to Program",
            "2014"),
    CSHARPHTP("Visual C# How to Program",
            "2014"),
    IW3HTP("Internet & World Wide Web How to Program",
            "2012"),
    JHTP("Java How to Program",
            "2015"),
    VBHTP("Visual Basic How to Program",
            "2014");


    private String title;
    private String year;


    Book(String title, String year) {

        this.title = title;
        this.year = year;
    }


    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }
}
