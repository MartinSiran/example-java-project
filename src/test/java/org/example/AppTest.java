package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(3.0, calculator.add(1.0,2.0));
    }

    @Test
    public void testDivide() {
        assertThrows(Exception.class, () -> calculator.divide(2.0, 0.0));
    }

}
