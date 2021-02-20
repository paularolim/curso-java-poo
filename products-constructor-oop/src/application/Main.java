package application;

import entities.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("TV", 900.0, 10);
        System.out.println(product);

        product.setName("Computer");
        product.setPrice(1200.0);
        System.out.println(product);

        product.addProducts(1);
        System.out.println(product);

        product.removeProducts(3);
        System.out.println(product);
    }
}
