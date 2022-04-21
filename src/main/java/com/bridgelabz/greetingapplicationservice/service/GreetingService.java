package com.bridgelabz.greetingapplicationservice.service;

public class GreetingService {
    public String getMessage() {
        return "Hello World";
    }
    public String getGreetingMessage(String fName, String lName) {
        return "Hello "+fName+""+lName;
    }
    public String postMessage(String fName,String lName) {
        return "Hello "+fName+""+lName;
    }
}
