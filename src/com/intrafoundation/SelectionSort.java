package com.intrafoundation;

public class SelectionSort implements BaseSort {
    protected int swaps = 0;
    protected int runTime = 0;

    public void sort(int[] arr) {
        swaps = 0;
        for (int pass = 0; pass < arr.length - 1; pass++) {
            int index = pass;
            for (int scan = pass + 1; scan < arr.length; scan++) {
                if (arr[scan] < arr[index]) {
                    index = scan;
                    swaps++;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[pass];
            arr[pass] = smallerNumber;
        }
    }

    public int getSwaps() {
        return swaps;
    }

    public int getRunTime() {
        return runTime;
    }

}


