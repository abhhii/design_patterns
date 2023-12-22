package com.example.designPatterns.chainOfResponsibility;

public class BookingHandler extends RequestHandler{
    public BookingHandler(RequestHandler _nextHandler) {
        super(_nextHandler);
    }

    @Override
    public void processRequest(AppRequest request) {
        if(request.getLoginStatus().equals(LoginStatus.LOGGED_IN) && request.getPreviousPaymentStatus().equals(PreviousPaymentStatus.COMPLETE)){
            System.out.println("Fetching drivers to book you a ride.");
            for(int i=0;i<10000;i++){}
            System.out.println("Ride booking successful!");

            if(this.getNextHandler() != null){
                this.getNextHandler().processRequest(request);
            }

        }
    }
}
