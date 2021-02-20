package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f", rectangle.area());
        System.out.printf("%nPERIMETER = %.2f", rectangle.perimeter());
        System.out.printf("%nDIAGONAL = %.2f", rectangle.diagonal());
    }
}
