package com.example.designPatterns.chainOfResponsibility;

public class Client {
    public static void main(String[] args){
        AppRequest request = AppRequest.builder()
                .requestName("BOOKING")
                .authToken("123")
                .loginStatus(LoginStatus.LOGGED_OUT)
                .previousPaymentStatus(PreviousPaymentStatus.COMPLETE)
                .build();
        RequestHandler handler = new LoginHandler(new PreviousPaymentHandler(new BookingHandler(null)));
        handler.processRequest(request);
    }
}
