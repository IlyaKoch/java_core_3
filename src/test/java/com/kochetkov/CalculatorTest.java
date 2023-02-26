package com.kochetkov;

import com.kochetkov.mock.MockReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator testObj = new Calculator(new MockReader());

    @Test
    void run(){
        String run = testObj.run();
        Assertions.assertEquals("Result: 25", run);
    }
}