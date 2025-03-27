package EXO5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO5.Factorial;

class FactorialTest {

    @Test
    void testFactorialBaseCases() {
        assertEquals(1, Factorial.factorial(0), "0! should be 1");
        assertEquals(1, Factorial.factorial(1), "1! should be 1");
    }

    @Test
    void testFactorialSmallNumbers() {
        assertEquals(2, Factorial.factorial(2), "2! should be 2");
        assertEquals(6, Factorial.factorial(3), "3! should be 6");
        assertEquals(24, Factorial.factorial(4), "4! should be 24");
        assertEquals(120, Factorial.factorial(5), "5! should be 120");
    }

    @Test
    void testFactorialLargerNumbers() {
        assertEquals(720, Factorial.factorial(6), "6! should be 720");
        assertEquals(5040, Factorial.factorial(7), "7! should be 5040");
        assertEquals(40320, Factorial.factorial(8), "8! should be 40320");
    }

    @Test
    void testFactorialNegativeNumberThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
        assertEquals("n must be positive", exception.getMessage(), "Exception message should match");
    }
}

