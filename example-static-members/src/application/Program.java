package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double radius, circumference, volume;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        circumference = Calculator.circumference(radius);
        volume = Calculator.volume(radius);

        System.out.printf("%nVolume: %.2f", volume);
        System.out.printf("%nCircumference: %.2f", circumference);
        System.out.printf("%nPi: %.5f", Calculator.PI);

        sc.close();
    }
}
