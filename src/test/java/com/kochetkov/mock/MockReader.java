package com.kochetkov.mock;

import com.kochetkov.Operation;
import com.kochetkov.Operations;
import com.kochetkov.Reader;

public class MockReader implements Reader {

    @Override
    public int readFirst() {
        return 15;
    }

    @Override
    public int readSecond() {
        return 10;
    }

    @Override
    public Operation readOperation() {
        return Operations.SUM.getImplementation();
    }
}
