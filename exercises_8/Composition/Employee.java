package exercises_8.Composition;

public class Employee {

    private  final String firstName; // once initialised, the name cannot be changed
    private final  String lastName; // once initialised, the name cannot be changed
    private Date birthDate;
    private Date hireDate;


    public Employee(String firstName, String lastName, Date birthDate, Date hireDate){

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }


    public String toString(){

        return String.format("%S, %S, Hired: %S, Birthday: %S", firstName, lastName, hireDate, birthDate);
    }

}
