package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String number, name;
        char question;
        double deposit, withdraw;
        Account account;

        System.out.print("Enter account number: ");
        number = sc.nextLine();

        System.out.print("Enter account holder: ");
        name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        question = sc.next().charAt(0);

        if (question == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();

            account = new Account(number, name, initialDeposit);
        } else {
            account = new Account(number, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.printf(account.toString());

        System.out.println();
        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account: ");
        System.out.printf(account.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account: ");
        System.out.printf(account.toString());

        sc.close();
    }
}
