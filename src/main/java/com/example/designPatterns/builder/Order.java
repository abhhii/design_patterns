package com.example.designPatterns.builder;

import lombok.Data;

@Data
public class Order {
    private String orderId;
    private String orderType;
    private String referenceId;
    private String orderTime;
    private String postalCode;

    private Order(){}

    public static OrderBuilder builder(){
        return new OrderBuilder();
    }
    public static class OrderBuilder{

        private String orderId;
        private String orderType;
        private String referenceId;
        private String orderTime;
        private String postalCode;

        public Order build(){
            Order order = new Order();
            order.setOrderId(this.orderId);
            order.setOrderTime(this.orderTime);
            order.setOrderType(this.orderType);
            order.setPostalCode(this.postalCode);
            order.setReferenceId(this.referenceId);
            return order;
        }


        public OrderBuilder orderId(String orderId){
            this.orderId = orderId;
            return this;
        }

        public OrderBuilder orderType(String orderType){
            this.orderType = orderType;
            return this;
        }

        public OrderBuilder referenceId(String referenceId){
            this.referenceId = referenceId;
            return this;
        }

        public OrderBuilder orderTime(String orderTime){
            this.orderTime = orderTime;
            return this;
        }

        public OrderBuilder postalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }


    }
}
