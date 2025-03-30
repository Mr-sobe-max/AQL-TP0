package EXO2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO2.Stack;

class StackTest {
    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void pushShouldAddElementToEmptyStack() {
        stack.push(1);
        assertEquals(1, stack.size());
        assertEquals(1, stack.peek());
    }

    @Test
    void pushShouldAddMultipleElements() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
        assertEquals(2, stack.peek());
    }

    @Test
    void pushShouldExpandArrayWhenFull() {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.push(10); // Should trigger expansion
        assertEquals(11, stack.size());
        assertEquals(10, stack.peek());
    }

    @Test
    void popShouldReturnAndRemoveTopElement() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.size());
        assertEquals(1, stack.peek());
    }

    @Test
    void popShouldThrowExceptionWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

    @Test
    void peekShouldReturnTopElementWithoutRemoving() {
        stack.push(1);
        assertEquals(1, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    void peekShouldThrowExceptionWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }

    @Test
    void isEmptyShouldReturnTrueForEmptyStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void isEmptyShouldReturnFalseForNonEmptyStack() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void sizeShouldReturnZeroForEmptyStack() {
        assertEquals(0, stack.size());
    }

    @Test
    void sizeShouldReturnCorrectCount() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
    }
}