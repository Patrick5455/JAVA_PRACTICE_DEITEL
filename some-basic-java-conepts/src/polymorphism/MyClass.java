package polymorphism;

public class MyClass {

    /* polymorphism is the ability of an object to have different forms
    *the property of a class object to have different forms
    *
    * */

    public static void main (String... args){

        Bank abc = new Bank_abc();
        Bank def = new Bank_def();

        System.out.println(abc.getInerestRate());
        System.out.println(def.getInerestRate());
    }
}
