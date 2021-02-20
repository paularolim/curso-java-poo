package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Client client = new Client("Alex Green", "alex@gmail.com", sdf.parse("18/02/1986"));
        Order order = new Order(OrderStatus.valueOf("PROCESSING"), client);
        OrderItem item1 = new OrderItem(1, 1000.0, new Product("TV", 1000.0));
        OrderItem item2 = new OrderItem(2, 40.00, new Product("Mouse", 40.0));
        order.addItem(item1);
        order.addItem(item2);

        System.out.println(order);
    }
}
