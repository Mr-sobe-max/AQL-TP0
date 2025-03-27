package EXO4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO4.Prime;

class PrimeTest {

    @Test
    void testNegativeAndSmallNumbers() {
        assertFalse(Prime.isPrime(-5), "-5 should not be prime");
        assertFalse(Prime.isPrime(0), "0 should not be prime");
        assertFalse(Prime.isPrime(1), "1 should not be prime");
    }

    @Test
    void testPrimeNumbers() {
        assertTrue(Prime.isPrime(2), "2 should be prime");
        assertTrue(Prime.isPrime(3), "3 should be prime");
        assertTrue(Prime.isPrime(5), "5 should be prime");
        assertTrue(Prime.isPrime(7), "7 should be prime");
        assertTrue(Prime.isPrime(11), "11 should be prime");
        assertTrue(Prime.isPrime(13), "13 should be prime");
    }

    @Test
    void testNonPrimeNumbers() {
        assertFalse(Prime.isPrime(4), "4 should not be prime");
        assertFalse(Prime.isPrime(6), "6 should not be prime");
        assertFalse(Prime.isPrime(8), "8 should not be prime");
        assertFalse(Prime.isPrime(9), "9 should not be prime");
        assertFalse(Prime.isPrime(10), "10 should not be prime");
    }

    @Test
    void testLargePrimeNumber() {
        assertTrue(Prime.isPrime(7919), "7919 should be prime");
    }

    @Test
    void testLargeNonPrimeNumber() {
        assertFalse(Prime.isPrime(10000), "10000 should not be prime");
    }
}
