package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxNumberTest {

    @Test
    public void testMax() {
        MaxNumber math = new MaxNumber();

        int result = math.max(10, 20);

        assertEquals(20, result, "Should return the larger of two numbers");
    }
}