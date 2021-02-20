package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double dollarPrice, amount, payValue;

        System.out.printf("What is the dollar price? ");
        dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        amount = sc.nextDouble();

        payValue = CurrencyConverter.dollarToBrl(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais: %.2f", payValue);

    }
}
