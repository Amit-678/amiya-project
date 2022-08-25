package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Bhai Bhai, yeh project kaam kar raha hai!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
