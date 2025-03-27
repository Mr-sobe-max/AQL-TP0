package EXO3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO3.Fibonacci;

class FibonacciTest {

    @Test
    void testFibonacciBaseCases() {
        assertEquals(0, Fibonacci.fibonacci(0), "F(0) should be 0");
        assertEquals(1, Fibonacci.fibonacci(1), "F(1) should be 1");
    }

    @Test
    void testFibonacciRecursiveCases() {
        assertEquals(1, Fibonacci.fibonacci(2), "F(2) should be 1");
        assertEquals(2, Fibonacci.fibonacci(3), "F(3) should be 2");
        assertEquals(3, Fibonacci.fibonacci(4), "F(4) should be 3");
        assertEquals(5, Fibonacci.fibonacci(5), "F(5) should be 5");
        assertEquals(8, Fibonacci.fibonacci(6), "F(6) should be 8");
        assertEquals(13, Fibonacci.fibonacci(7), "F(7) should be 13");
    }

    @Test
    void testFibonacciNegativeNumberThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
        assertEquals("n must be positive", exception.getMessage(), "Exception message should match");
    }
}
