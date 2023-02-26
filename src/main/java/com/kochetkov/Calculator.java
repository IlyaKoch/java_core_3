package com.kochetkov;

public class Calculator {

    private final Reader reader;

    public Calculator(Reader reader) {
        this.reader = reader;
    }

    public String run() {
        System.out.println("First number: ");
        int first = reader.readFirst();
        System.out.println("Second number: ");
        int second = reader.readSecond();
        System.out.println("Operation: ");
        Operation operation = reader.readOperation();
        return "Result: " + operation.doOperation(first, second);
    }
}