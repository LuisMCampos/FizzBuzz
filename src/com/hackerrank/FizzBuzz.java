package com.hackerrank;

import java.lang.System;

public class FizzBuzz {

    public void Recursive(int a) {
        if (a == 0) {
            System.out.println(a);
            return;
        }

        if ((a % 3) == 0 && ((a % 5) == 0)) {
            Recursive(a - 1);
            System.out.println("fizzBuzz");
            return;
        }
        if ((a % 3) == 0) {
            Recursive(a - 1);
            System.out.println("fizz");
            return;
        }
        if ((a % 5) == 0) {
            Recursive(a - 1);
            System.out.println("buzz");
            return;
        }

        Recursive(a - 1);
        System.out.println(a);

        return;
    }

    public void Sequential(int a) {

        for (int i = 0; i < a; i++) {
            if (i == 0) {
                System.out.println(i);
            } else if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }

}
