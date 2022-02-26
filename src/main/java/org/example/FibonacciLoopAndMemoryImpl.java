package org.example;

import java.util.ArrayList;
import java.util.List;

// реализация в цикле - с использовнием памяти
public class FibonacciLoopAndMemoryImpl implements Fibonacci {

    @Override
    public int fib(int n) {
        if (n < 0) throw new IllegalArgumentException("Only zero or positive numbers are allowed");

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        while (list.size() - 1 < n) {
            int sum = list.get(list.size() - 1) + list.get(list.size() - 2);
            if (sum < 0) throw new RuntimeException(String.format("Fibonacci sum (n-1) + (n-2) overflow. input number = %d", n));
            list.add(sum);
        }

        return list.get(n) ;
    }
}
