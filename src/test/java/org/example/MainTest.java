package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void calculate() {
        Main main = new Main();
        int calculate = main.calculate();
        assertEquals(calculate, 4);
    }
}