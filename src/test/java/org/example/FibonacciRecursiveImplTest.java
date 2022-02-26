package org.example;

import org.junit.Test;

public class FibonacciRecursiveImplTest {

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentTest() {
        new FibonacciTest(new FibonacciRecursiveImpl()).illegalArgumentTest();
    }

    @Test
    public void arrayTest() {
        new FibonacciTest(new FibonacciRecursiveImpl()).arrayTest();
    }

    @Test(expected = RuntimeException.class)
    public void overflowTest() {
        new FibonacciTest(new FibonacciRecursiveImpl()).overflowTest();
    }
}