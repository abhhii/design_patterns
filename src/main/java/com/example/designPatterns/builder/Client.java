package com.example.designPatterns.builder;

public class Client {
    public static void main(String[] args){
        Order order = Order.builder().orderId("Order1")
                .orderTime("12:00")
                .postalCode("M1R345")
                .build();

        OrderGenerated order1 = OrderGenerated.builder().orderId("OrderGenerated")
                .orderTime("09:00")
                .postalCode("M1R345")
                .build();
        System.out.print(order);
    }
}
