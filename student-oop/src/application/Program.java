package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Type the name and 3 scores: ");
        student.name = sc.nextLine();
        student.score1 = sc.nextDouble();
        student.score2 = sc.nextDouble();
        student.score3 = sc.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE = %.2f ", student.finalGrade());
        System.out.printf(student.finalResult());

        sc.close();
    }
}
