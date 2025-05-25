package EXO3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO3.Fibonacci;

class FibonacciTest {
    @Test
    void fibonacciShouldReturnZeroForNEqualsZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void fibonacciShouldReturnOneForNEqualsOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void fibonacciShouldReturnCorrectValueForPositiveN() {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    void fibonacciShouldThrowExceptionForNegativeN() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }

    @Test
    void fibonacciShouldHandleLargeN() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }
}