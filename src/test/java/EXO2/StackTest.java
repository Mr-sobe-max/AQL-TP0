package EXO2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO2.Stack;

class StackTest {

    @Test
    void testPushAndPeek() {
        Stack stack = new Stack();
        stack.push(5);
        assertEquals(5, stack.peek(), "Peek should return the last pushed element");
    }

    @Test
    void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(10);
        assertEquals(10, stack.pop(), "Pop should return the last pushed element");
        assertTrue(stack.isEmpty(), "Stack should be empty after popping the only element");
    }

    @Test
    void testMultiplePushAndPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop(), "Pop should return last pushed element");
        assertEquals(2, stack.pop(), "Pop should return the previous element");
        assertEquals(1, stack.pop(), "Pop should return the first element pushed");
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }

    @Test
    void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty(), "New stack should be empty");
        stack.push(100);
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element");
    }

    @Test
    void testSize() {
        Stack stack = new Stack();
        assertEquals(0, stack.size(), "New stack should have size 0");
        stack.push(5);
        stack.push(10);
        assertEquals(2, stack.size(), "Stack size should be 2 after pushing two elements");
    }

    @Test
    void testPopOnEmptyStackThrowsException() {
        Stack stack = new Stack();
        Exception exception = assertThrows(IllegalStateException.class, stack::pop);
        assertEquals("Stack is empty", exception.getMessage(), "Exception message should be 'Stack is empty'");
    }

    @Test
    void testPeekOnEmptyStackThrowsException() {
        Stack stack = new Stack();
        Exception exception = assertThrows(IllegalStateException.class, stack::peek);
        assertEquals("Stack is empty", exception.getMessage(), "Exception message should be 'Stack is empty'");
    }

    @Test
    void testExpandArray() {
        Stack stack = new Stack();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(15, stack.size(), "Stack should have expanded and contain 15 elements");
        assertEquals(14, stack.peek(), "Top element should be 14");
    }
}
