package com.kochetkov;

import com.kochetkov.impl.DivOperation;
import com.kochetkov.impl.MultOperation;
import com.kochetkov.impl.SubOperation;
import com.kochetkov.impl.SumOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationTest {

    private Operation operation;

    @Test
    void multTest() {
        operation = new MultOperation();
        Assertions.assertEquals(6, operation.doOperation(3, 2));
    }

    @Test
    void subTest() {
        operation = new SubOperation();
        Assertions.assertEquals(1, operation.doOperation(3, 2));
    }

    @Test
    void sumTest() {
        operation = new SumOperation();
        Assertions.assertEquals(5, operation.doOperation(3, 2));
    }
    @Test
    void divTest() {
        operation = new DivOperation();
        Assertions.assertEquals(3, operation.doOperation(6, 2));
    }
}