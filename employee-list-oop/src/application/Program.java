package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int increaseId = sc.nextInt();

        Employee increaseEmployee = employees.stream().filter(e -> e.getId() == increaseId).findFirst().orElse(null);
        if (increaseEmployee != null) {
            System.out.print("Enter the percentage: ");
            double increasePercentage = sc.nextDouble();
            increaseEmployee.increaseSalary(increasePercentage);
        } else {
            System.out.println("This id does not exists");
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        sc.close();
    }
}
