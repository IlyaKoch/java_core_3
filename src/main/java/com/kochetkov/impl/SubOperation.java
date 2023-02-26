package com.kochetkov.impl;

import com.kochetkov.Operation;

public class SubOperation extends Operation {

    public SubOperation() {
        super("вычитание", '-');
    }

    @Override
    public int doOperation(int first, int second) {
        return first - second;
    }
}