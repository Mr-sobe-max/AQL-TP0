package EXOBONUS2;

import org.example.com.EXOBONUS2.Matrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    private Matrix matrix;

    @BeforeEach
    void setUp() {
        matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);
    }

    @Test
    void setAndGetShouldWorkCorrectly() {
        assertEquals(1, matrix.get(0, 0));
        assertEquals(2, matrix.get(0, 1));
        assertEquals(3, matrix.get(1, 0));
        assertEquals(4, matrix.get(1, 1));
    }

    @Test
    void addShouldAddMatricesCorrectly() {
        Matrix other = new Matrix(2);
        other.set(0, 0, 1);
        other.set(0, 1, 1);
        other.set(1, 0, 1);
        other.set(1, 1, 1);
        matrix.add(other);
        assertEquals(2, matrix.get(0, 0));
        assertEquals(3, matrix.get(0, 1));
        assertEquals(4, matrix.get(1, 0));
        assertEquals(5, matrix.get(1, 1));
    }

    @Test
    void addShouldThrowExceptionForNullMatrix() {
        assertThrows(NullPointerException.class, () -> matrix.add(null));
    }

    @Test
    void addShouldThrowExceptionForDifferentSize() {
        Matrix other = new Matrix(3);
        assertThrows(IllegalArgumentException.class, () -> matrix.add(other));
    }

    @Test
    void multiplyShouldMultiplyMatricesCorrectly() {
        Matrix other = new Matrix(2);
        other.set(0, 0, 1);
        other.set(0, 1, 0);
        other.set(1, 0, 0);
        other.set(1, 1, 1);
        matrix.multiply(other);
        // Expected: [[1*1 + 2*0, 1*0 + 2*1], [3*1 + 4*0, 3*0 + 4*1]] = [[1, 2], [3, 4]]
        assertEquals(1, matrix.get(0, 0));
        assertEquals(2, matrix.get(0, 1));
        assertEquals(3, matrix.get(1, 0));
        assertEquals(4, matrix.get(1, 1));
    }

    @Test
    void multiplyShouldThrowExceptionForNullMatrix() {
        assertThrows(NullPointerException.class, () -> matrix.multiply(null));
    }

    @Test
    void multiplyShouldThrowExceptionForDifferentSize() {
        Matrix other = new Matrix(3);
        assertThrows(IllegalArgumentException.class, () -> matrix.multiply(other));
    }

    @Test
    void transposeShouldSwapRowsAndColumns() {
        matrix.transpose();
        // Expected: [[1, 3], [2, 4]]
        assertEquals(1, matrix.get(0, 0));
        assertEquals(3, matrix.get(0, 1));
        assertEquals(2, matrix.get(1, 0));
        assertEquals(4, matrix.get(1, 1));
    }

    @Test
    void toStringShouldReturnCorrectFormat() {
        String expected = "[1, 2]\n[3, 4]\n";
        assertEquals(expected, matrix.toString());
    }

    @Test
    void constructorShouldThrowExceptionForNonPositiveSize() {
        assertThrows(NegativeArraySizeException.class, () -> new Matrix(0));
        assertThrows(NegativeArraySizeException.class, () -> new Matrix(-1));
    }
}
