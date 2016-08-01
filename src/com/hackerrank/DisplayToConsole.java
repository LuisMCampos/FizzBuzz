package com.hackerrank;

import java.util.Iterator;

/**
 * Created by vetras on 01/08/2016.
 */
public class DisplayToConsole {
    private ComputedFibonacci sequence;

    public DisplayToConsole(ComputedFibonacci sequence) {
        this.sequence = sequence;
    }

    public void show() {
        Iterator<Integer> it = sequence.Iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
