package com.kochetkov.impl;

import com.kochetkov.Operation;
import com.kochetkov.Operations;
import com.kochetkov.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public int readFirst() {
        return sc.nextInt();
    }

    @Override
    public int readSecond() {
        return sc.nextInt();
    }

    @Override
    public Operation readOperation() throws IllegalArgumentException {
        return Operations.lookup(sc.next().charAt(0)).getImplementation();
    }
}