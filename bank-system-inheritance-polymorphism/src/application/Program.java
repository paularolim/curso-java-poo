package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        /*Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(2002, "Maria", 0.0, 500.0);

        // upcasting
        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(3003, "Bob", 0.0, 300.0);
        Account account3 = new SavingsAccount(4004, "Ana", 0.0, 0.01);

        // downcasting
        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100.0);

        if (account3 instanceof BusinessAccount) {
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(100.0);
            System.out.println("Loan");
        }
        if (account3 instanceof SavingsAccount) {
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Update");
        }*/

        Account account = new Account(1001, "Alex", 0.0);
        Account businessAccount = new BusinessAccount(2002, "Maria", 0.0, 500.0);
        Account savingsAccount = new SavingsAccount(3003, "Bob", 0.0, 0.01);

        account.deposit(300.0);
        account.withdraw(100.0);
        System.out.println(account);

        businessAccount.deposit(300.0);
        businessAccount.withdraw(100.0);
        System.out.println(businessAccount);

        savingsAccount.deposit(300.0);
        savingsAccount.withdraw(100.0);
        System.out.println(savingsAccount);
    }
}
