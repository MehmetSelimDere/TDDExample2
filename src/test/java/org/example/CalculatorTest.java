/*
Student number: [B211202059]
First name and last name: [Mehmet Selim Dere]
Course name and homework Info: Yazılım Doğrulama ve Onaylama - Homework 1
GitHub repository address: [https://github.com/MehmetSelimDere/TDDExample2.git]
*/

package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 2.5, 5",
            "10, 2.5, 4",
            "12.5, 5, 2.5"
    })
    void testDivision(float dividend, float divisor, float expected) {
        float result = Calculator.divide(dividend, divisor);
        assertEquals(expected, result);
    }
}
