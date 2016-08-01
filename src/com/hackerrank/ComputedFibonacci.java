package com.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by vetras on 01/08/2016.
 */
public class ComputedFibonacci {
    private List<Integer> sequence;

    public ComputedFibonacci() {
        this.sequence = new ArrayList<>();
    }

    public void save(int nless1) {
        sequence.add(nless1);
    }

    public Iterator<Integer> Iterator() {
        return sequence.iterator();
    }
}
