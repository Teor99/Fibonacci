package org.example;

import org.junit.Test;

public class FibonacciLoopAndMemoryImplTest {

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentTest() {
        new FibonacciTest(new FibonacciLoopAndMemoryImpl()).illegalArgumentTest();
    }

    @Test
    public void arrayTest() {
        new FibonacciTest(new FibonacciLoopAndMemoryImpl()).arrayTest();
    }

    @Test(expected = RuntimeException.class)
    public void overflowTest() {
        new FibonacciTest(new FibonacciLoopAndMemoryImpl()).overflowTest();
    }
}