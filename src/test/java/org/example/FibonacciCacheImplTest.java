package org.example;

import org.junit.Test;

public class FibonacciCacheImplTest {

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentTest() {
        new FibonacciTest(new FibonacciCacheImpl()).illegalArgumentTest();
    }

    @Test
    public void arrayTest() {
        new FibonacciTest(new FibonacciCacheImpl()).arrayTest();
    }

    @Test(expected = RuntimeException.class)
    public void overflowTest() {
        new FibonacciTest(new FibonacciCacheImpl()).overflowTest();
    }
}