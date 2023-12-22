package com.example.designPatterns.chainOfResponsibility;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler _nextHandler){
        this.nextHandler = _nextHandler;
    }

    public abstract void processRequest(AppRequest request);

    public RequestHandler getNextHandler(){
        return nextHandler;
    }

}
