package com.example.designPatterns.chainOfResponsibility;

public class LoginHandler extends RequestHandler {
    public LoginHandler(RequestHandler _nextHandler) {
        super(_nextHandler);
    }

    @Override
    public void processRequest(AppRequest request) {
        System.out.println("Logging into customer account");
        if(request.getAuthToken() != null){
            System.out.println("User authenticated");
            request.setLoginStatus(LoginStatus.LOGGED_IN);
            if(this.getNextHandler() != null){
                this.getNextHandler().processRequest(request);
            }
        }
    }
}
