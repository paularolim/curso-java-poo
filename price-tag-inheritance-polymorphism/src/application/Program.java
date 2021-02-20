package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product product1 = new ImportedProduct("Tablet", 260.0, 20.0);
        Product product2 = new Product("Notebook", 1100.0);
        Product product3 = new UsedProduct("Iphone", 400.00, sdf.parse("19/02/2021"));

        System.out.println("PRICE TAGS");
        System.out.println(product1.priceTag());
        System.out.println(product2.priceTag());
        System.out.println(product3.priceTag());
    }
}
