package com.example.designPatterns.chainOfResponsibility;

public class PreviousPaymentHandler extends RequestHandler{
    public PreviousPaymentHandler(RequestHandler _nextHandler) {
        super(_nextHandler);
    }

    @Override
    public void processRequest(AppRequest request) {
        System.out.println("Checking previous payment status");
        if(request.getPreviousPaymentStatus().equals(PreviousPaymentStatus.COMPLETE)){
            System.out.println("No outstanding payments! Proceed to ride booking\n");
            if(this.getNextHandler()!=null){
                this.getNextHandler().processRequest(request);
            }
        }

    }
}
