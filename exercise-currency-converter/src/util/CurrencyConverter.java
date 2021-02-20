package util;

public class CurrencyConverter {
    public static double IOF = 6.0;

    public static double dollarToBrl(double dollarPrice, double amount) {
        return dollarPrice * amount + dollarPrice * amount * IOF / 100;
    }
}
