package entities;

public class Account {
    private String number;
    private String holder;
    private double balance;

    public Account(String number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.deposit(initialDeposit);
    }

    public Account(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance > amount) this.balance -= amount + 5.0;
    }

    public String toString() {
        return "Account: " + number + "; Holder: " + holder + "; Balance: $ " + String.format("%.2f", balance) + "%n";
    }
}
