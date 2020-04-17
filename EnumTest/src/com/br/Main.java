package com.br;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMANT);
        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.PROCESSING;
        OrderStatus os2 = OrderStatus.valueOf("PENDING_PAYMANT");

        System.out.println(os1);
        System.out.println(os2);
    }
}
