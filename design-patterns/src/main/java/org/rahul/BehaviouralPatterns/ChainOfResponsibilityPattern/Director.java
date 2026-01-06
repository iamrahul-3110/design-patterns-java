package org.rahul.BehaviouralPatterns.ChainOfResponsibilityPattern;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("Director handling: " + request.getDescription());
    }
}