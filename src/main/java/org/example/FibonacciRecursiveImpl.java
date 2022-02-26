package org.example;

// Рекурсивная реализация
public class FibonacciRecursiveImpl implements Fibonacci {

    @Override
    public int fib(int n) {
        if (n < 0) throw new IllegalArgumentException("Only zero or positive numbers are allowed");

        if (n <= 1) return n;

        int sum = fib(n-1) + fib(n-2);
        if (sum < 0) throw new RuntimeException(String.format("Fibonacci sum (n-1) + (n-2) overflow. input number = %d", n));
        return sum;
    }
}
