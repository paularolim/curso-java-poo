package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(123, new Date(), OrderStatus.SHIPPED);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.PENDING_PAYMENT;
        OrderStatus os2 = OrderStatus.valueOf("PENDING_PAYMENT");

        System.out.println(os1);
        System.out.println(os2);
    }
}
