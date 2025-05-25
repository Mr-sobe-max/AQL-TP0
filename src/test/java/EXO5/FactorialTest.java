package EXO5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO5.Factorial;

class FactorialTest {
    @Test
    void factorialShouldReturnOneForZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void factorialShouldReturnCorrectValueForPositiveN() {
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void factorialShouldThrowExceptionForNegativeN() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }

    @Test
    void factorialShouldHandleLargeN() {
        assertEquals(3_628_800, Factorial.factorial(10));
    }
}