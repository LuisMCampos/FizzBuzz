package com.hackerrank;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*FizzBuzz foo = new FizzBuzz();
        foo.Recursive(20);
        System.out.println("------------------------");
        foo.Sequential(20);*/

        Fibonacci fib = new Fibonacci();
        fib.Sequential(0);

        ComputedFibonacci sequence = fib.ComputeUpTo(10);
        DisplayToConsole display = new DisplayToConsole(sequence);
        display.show();
        display.show();
    }
}
