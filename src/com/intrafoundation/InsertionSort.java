package com.intrafoundation;

import java.util.Arrays;

public class InsertionSort implements BaseSort {
    protected int swaps = 0;
    protected int runTime = 0;

    public void sort(int[] arr) {
        swaps = 0;
        int len = arr.length;
        for (int pass = 1; pass < len; pass++) {
            int key = arr[pass];
            int scan = pass - 1;
            while ((scan > -1) && (arr[scan] > key)) {
                arr[scan + 1] = arr[scan];
                scan--;
                swaps++;
            }
            arr[scan + 1] = key;
        }
    }

    public int getSwaps() {
        return swaps;
    }

    public int getRunTime() {
        return runTime;
    }

}


