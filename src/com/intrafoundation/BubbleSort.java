package com.intrafoundation;

import java.util.Arrays;

public class BubbleSort implements BaseSort {
    protected int swaps = 0;
    protected int runTime = 0;

    public void sort(int[] arr) {
        swaps = 0;
        int len = arr.length;
        for (int pass = 0; pass < len - 1; pass++) {
            for (int scan = 0; scan < len - pass - 1; scan++) {
                if (arr[scan] > arr[scan + 1]) {
                    int temp = arr[scan];
                    arr[scan] = arr[scan + 1];
                    arr[scan + 1] = temp;
                    swaps++;
                }
            }
        }
    }

    public int getSwaps() {
        return swaps;
    }

    public int getRunTime() {
        return runTime;
    }

}
