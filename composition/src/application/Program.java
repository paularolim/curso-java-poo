package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        System.out.println("Enter worker data");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        double salary = sc.nextDouble();

        Worker worker = new Worker(name, WorkLevel.valueOf(level), salary, new Department(department));

        System.out.println();
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<n; i++){
            System.out.println("Enter contract #" + (i+1) + " data");

            System.out.print("Date (dd/mm/yyyy): ");
            Date date = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            double perHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();

            HourContract hourContract = new HourContract(date, perHour, hours);
            worker.addContract(hourContract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (mm/yyyy): ");
        String monthYear = sc.nextLine();
        int month = Integer.parseInt(monthYear.substring(0,2));
        int year = Integer.parseInt(monthYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
