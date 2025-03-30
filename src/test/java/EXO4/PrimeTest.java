package EXO4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO4.Prime;

class PrimeTest {
    @Test
    void isPrimeShouldReturnTrueForPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(17));
    }

    @Test
    void isPrimeShouldReturnFalseForNonPrimeNumbers() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(9));
    }

    @Test
    void isPrimeShouldReturnFalseForNumbersLessThanTwo() {
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(-1));
    }

    @Test
    void isPrimeShouldHandleLargePrime() {
        assertTrue(Prime.isPrime(97));
    }
}