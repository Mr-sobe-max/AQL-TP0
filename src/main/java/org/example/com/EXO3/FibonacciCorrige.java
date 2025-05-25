package org.example.com.EXO3;

import java.math.BigInteger;

public class FibonacciCorrige {
    public static BigInteger fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }
        return fibonacci(n - 1).add(fibonacci(n - 2));
    }
}
