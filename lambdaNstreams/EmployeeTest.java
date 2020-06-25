package lambdaNstreams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
    }



}