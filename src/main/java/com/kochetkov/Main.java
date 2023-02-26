package com.kochetkov;

import com.kochetkov.impl.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        String result = new Calculator(new ConsoleReader()).run();
        System.out.println(result);
    }
}