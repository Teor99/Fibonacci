package org.example;

import org.junit.Test;

public class FibonacciLoopAndLessMemoryImplTest {

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentTest() {
        new FibonacciTest(new FibonacciLoopAndLessMemoryImpl()).illegalArgumentTest();
    }

    @Test
    public void arrayTest() {
        new FibonacciTest(new FibonacciLoopAndLessMemoryImpl()).arrayTest();
    }

    @Test(expected = RuntimeException.class)
    public void overflowTest() {
        new FibonacciTest(new FibonacciLoopAndLessMemoryImpl()).overflowTest();
    }
}