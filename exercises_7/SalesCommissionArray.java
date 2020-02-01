package exercises_7;

import java.util.Scanner;
public class SalesCommissionArray {

    Scanner input = new Scanner(System.in);

    private int[] salaries = new int[10];
    private String week;

    public void setSalaries() {

        System.out.println("Enter Salary");
        System.out.println("To cancel press Ctrl+Z on windows or Ctrl+D on linux/Mac");
        for (int i = 0; i < salaries.length; i++) {
            System.out.printf("Salary %d%n", i + 1);
            int user = input.nextInt();
            int gross = grossPay(user);
            salaries[i] = gross;
        }
    }

    public static int grossPay(int salary) {
        return (int) (200 + salary * (1 + 0.09));
    }

    public void displaySalary() {
        System.out.println("Salesperson\tGross Pay");
        for (int no = 0; no < salaries.length; no++) {
            System.out.printf("%5d%14d%n", no + 1, salaries[no]);
        }
        System.out.println();
    }

    public void frequencyD() {
        int[] frequencyCount = new int[11];
        for (int salary : salaries) {
            int x = (int) (salary / 100);
            if (x > 10) {
                ++frequencyCount[10];
            } else {
                ++frequencyCount[x];
            }
        }
        System.out.printf("%s\t%s%n", "Salary Range", "Frequency");
        for (int i = 2; i < frequencyCount.length; i++) {
            if (i == 10) System.out.printf("%d and Others %8d%n", i * 100, frequencyCount[i]);
            else {
                System.out.printf("%d-%d\t\t%10d%n", i * 100, i * 100 + 99, frequencyCount[i]);
            }
        }
    }

}
