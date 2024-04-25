package org.example;

public class Calculator {

    public static float divide(float dividend, float divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Sıfıra bölme hatası!");
        }
        return dividend / divisor;
    }
}
