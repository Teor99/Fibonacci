package org.example;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private final Fibonacci fibonacci;

    // 47 elements, on 48 - int overflow
    private static final int[] fibonacciArray =
            {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
                987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368,
                75025, 121393, 196418, 317811, 514229, 832040, 1346269,
                2178309, 3524578, 5702887, 9227465, 14930352, 24157817,
                39088169, 63245986, 102334155, 165580141, 267914296,
                433494437, 701408733, 1134903170, 1836311903};

    public FibonacciTest(Fibonacci fibonacci) {
        this.fibonacci = fibonacci;
    }

    public void arrayTest() {
        for (int i = 0; i < fibonacciArray.length; i++) {
            assertEquals(fibonacciArray[i], fibonacci.fib(i));
        }
    }

    public void illegalArgumentTest() {
        fibonacci.fib(-1);
    }

    public void overflowTest() {
        fibonacci.fib(48);
    }
}