package polymorphism_Inheritance;

public class Execute2 {

    public static void main(String... args){

        //Polymorphism involves the reference of a base/superclass pointing to the
        // object of any of its derived/sub class.

        Bank abc = new Bank_ABC();
        Bank def = new Bank_DEF();
        Bank xyz = new Bank_XYZ();

        System.out.println(abc.getInterestRate());
        System.out.println(def.getInterestRate());
        System.out.println(xyz.getInterestRate());


    }
}
