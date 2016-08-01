package com.hackerrank;

/**
 * Created by vetras on 01/08/2016.
 */
public class Fibonacci {

    public int Recursive(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return Recursive(n - 1) + Recursive(n - 2);
    }

    public void Sequential(int n) {
        int nless1 = 0;
        int nless2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(nless1);
            int temp = nless2;
            nless2 = nless1 + nless2;
            nless1 = temp;
        }
    }

    public ComputedFibonacci ComputeUpTo(int n) {
        ComputedFibonacci fib = new ComputedFibonacci();
        int nless1 = 0;
        int nless2 = 1;
        for (int i = 0; i < n; i++) {
            fib.save(nless1);
            int temp = nless2;
            nless2 = nless1 + nless2;
            nless1 = temp;
        }
        return fib;
    }

}
