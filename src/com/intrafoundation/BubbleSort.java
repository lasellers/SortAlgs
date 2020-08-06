package com.intrafoundation;

import java.util.Arrays;

public class BubbleSort implements BaseSort {
    protected int swaps = 0;
    protected int runTime = 0;

    public void sort(int[] arr) {
        swaps = 0;
        final int end = arr.length - 1;

        boolean swapped;
        do {
            swapped = false;
            for (int inner = 0; inner < end; inner++) {
                final int a = arr[inner];
                final int b = arr[inner + 1];
                if (a > b) {
                    arr[inner] = b;
                    arr[inner + 1] = a;
                    swaps++;
                    swapped = true;
                }
            }
        } while (swapped);

    }

    public int getSwaps() {
        return swaps;
    }

    public int getRunTime() {
        return runTime;
    }

}
