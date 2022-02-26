package org.example;

// реализация в цикле - сокращаем использование памяти
public class FibonacciLoopAndLessMemoryImpl implements Fibonacci {

    @Override
    public int fib(int n) {
        if (n < 0) throw new IllegalArgumentException("Only zero or positive numbers are allowed");

        if (n <= 1) return n;

        int nMinusOne = 1;
        int nMinusTwo = 0;

        for (int i = 2; i < n; i++) {
            int sum = nMinusOne + nMinusTwo;

            if (sum < 0) throw new RuntimeException(String.format("Fibonacci sum (n-1) + (n-2) overflow. input number = %d", n));

            nMinusTwo = nMinusOne;
            nMinusOne = sum;
        }

        return nMinusOne + nMinusTwo;
    }
}
