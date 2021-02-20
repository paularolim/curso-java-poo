package application;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ana", 50, 100.00);
        Employee employee2 = new OutsourcedEmployee("Bob", 50, 100.00, 200.0);

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
