package com.kochetkov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OperationsLookupTest {

    @CsvSource({
            "+, сложение",
            "-, вычитание",
            "/, деление",
            "*, умножение"
    })

    @ParameterizedTest
    void lookupTest(char symbol, String expected){
        Operations result = Operations.lookup(symbol);
        Assertions.assertEquals(expected, result.getImplementation().getName());
    }
}