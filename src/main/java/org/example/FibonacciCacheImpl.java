package org.example;

import java.util.ArrayList;
import java.util.List;

// выделяем кеш структуру данных под хранение
public class FibonacciCacheImpl implements Fibonacci {
    private final List<Integer> cacheList;

    public FibonacciCacheImpl() {
        cacheList = new ArrayList<>();
        cacheList.add(0);
        cacheList.add(1);
    }

    @Override
    public int fib(int n) {
        if (n < 0) throw new IllegalArgumentException("Only zero or positive numbers are allowed");

        while (cacheList.size() - 1 < n) {
            int sum = cacheList.get(cacheList.size() - 1) + cacheList.get(cacheList.size() - 2);
            if (sum < 0)
                throw new RuntimeException(String.format("Fibonacci sum (n-1) + (n-2) overflow. input number = %d", n));
            cacheList.add(sum);
        }

        return cacheList.get(n);
    }
}
