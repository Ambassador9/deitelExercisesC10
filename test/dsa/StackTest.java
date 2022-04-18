package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }

    @Test
    public void stackCanBeCreatedTest() {
        assertNotNull(stack);
    }

    @Test
    public void stack_isEmptyTest() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushOneElement_stackIsNotEmptyTest() {
        stack.push(15);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_popX_stackShouldBeEmptyTest() {
        stack.push(15);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushXandY_popX_stackShouldNotBeEmptyTest() {
        stack.push(15);
        stack.push(20);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushXandY_popXandY_stackShouldBeEmptyTest() {
        stack.push(15);
        stack.push(20);
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushX_popX_elementShouldBeXTest() {
        stack.push(34);
        int element = stack.pop();
        assertEquals(34, element);
    }

    @Test
    public void pushXandYandZ_popZandY_elementShouldBeXTest() {
        stack.push(34);
        stack.push(30);
        stack.push(50);
        int element = stack.pop();
        assertEquals(50, element);
        element = stack.pop();
        assertEquals(30, element);
    }

    @Test
    public void pushXandY_peekReturnsYTest() {
        stack.push(32);
        stack.push(22);
        int element = stack.peek();
        assertEquals(22, element);
        element = stack.pop();
        assertEquals(22, element);
        element = stack.peek();
        assertEquals(32, element);

    }
}
