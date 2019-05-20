package com.sda.sda9.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void testAddElementToStack(){
        Stack stack = new Stack(2);
        stack.push(100);
        stack.push(101);
        int actual = stack.pop(); //removes value from stack and returns it;
        int expected = 101;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOverflowAndUnderflow(){
        Stack s = new Stack(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int actual = s.pop();
        int expected = 4;
        Assert.assertEquals(expected, actual);

        s.pop(); // only the first element remains in stack (3)
        int actualPopResult = s.pop();
        int expectedPopResult = -1;
        Assert.assertEquals(expectedPopResult, actualPopResult);

    }
}
