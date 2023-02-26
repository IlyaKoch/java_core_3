package com.kochetkov.impl;

import com.kochetkov.Operation;

public class DivOperation extends Operation {

    public DivOperation() {
        super("деление", '/');
    }

    @Override
    public int doOperation(int first, int second) {
        return first / second;
    }
}