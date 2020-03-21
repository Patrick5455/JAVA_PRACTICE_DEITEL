package polymorphism_Inheritance;

public class Execute {

    public static void main(String... args){

        Rectangle rec = new Rectangle();
        Triangle triag = new Triangle();

        rec.setValues(6,5);
        triag.setValues(7,5);

        System.out.printf("Area of Rectangle is %d%n", rec.area());
        System.out.printf("Area of Triangle is %d%n", triag.area());

    }
}
