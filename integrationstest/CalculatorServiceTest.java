package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    void testAddAndMultiply() {
        CalculatorService service = new CalculatorService();
        assertEquals(15, service.addAndMultiply(2, 3, 3)); // (2+3)*3 = 15
    }
}
