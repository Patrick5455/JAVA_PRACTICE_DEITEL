package lambdaNstreams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {



    @Test
    void EmployeeStream(){

       Employee [] employees = {

               new Employee("Jimoh", "Ahmed", 5000.0, "IT"),
               new Employee("Odeku", "Odenson", 7600.0, "IT"),
               new Employee("Omosare","Omogbagi", 3587.5 , "sales"),
               new Employee("James", "Jameson", 4700.77, "Marketing"),
               new Employee("Luk", "Lukmon", 6200, "IT"),
               new Employee("Ikare", "Omo", 3200, "Sales")
       };

        List<Employee> employeeList = Arrays.asList(employees);

        System.out.println("Complete lsit of employees: ");
        employeeList.stream().forEach(System.out::println);

        Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        System.out.printf("Employees earning between 4000 & 6000 per month sorted by salary %n:");
        employeeList.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);


        System.out.printf("%nFirst Employee who earns between $4000-$6000%n%s",

        employeeList.stream()
                .filter(fourToSixThousand)
                .findFirst()
                .get());


        //Functions for getting first and last name

        Function<Employee, String>  byFirstName = Employee::getFirstName;

        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThanFirst = Comparator.comparing(byLastName)
                                                        .thenComparing(byFirstName);

        System.out.printf("%nEmployees in ascending order by last name then first name%n");

        employeeList.stream()
                .sorted(lastThanFirst)
                .forEach(System.out::println);



    }



}