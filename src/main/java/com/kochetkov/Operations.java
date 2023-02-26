package com.kochetkov;

import com.kochetkov.impl.DivOperation;
import com.kochetkov.impl.MultOperation;
import com.kochetkov.impl.SubOperation;
import com.kochetkov.impl.SumOperation;

public enum Operations {
    SUM(new SumOperation()),
    MULT(new MultOperation()),
    DiV(new DivOperation()),
    SUB(new SubOperation());

    private final Operation operation;

    Operations(Operation operation) {
        this.operation = operation;
    }

    public Operation getImplementation() {
        return operation;
    }

    public static Operations lookup(char symbol){
        for (Operations value : values()) {
            if (value.getImplementation().getSymbol() == symbol)
                return value;
        }
        throw new IllegalArgumentException("Incorrect symbol: " + symbol);
    }
}