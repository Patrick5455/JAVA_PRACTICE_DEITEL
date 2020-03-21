package exercises_8.Composition;

public class EmployeeTest {

    public static void main(String... args){

        Date hire = new Date(17, 02, 2020);
        Date birth = new Date(21, 02, 1997);

        Employee patrick = new Employee("Patrick", "Ojunde", birth, hire);

        System.out.println(patrick);



    }



}
