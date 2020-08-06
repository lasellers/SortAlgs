package com.intrafoundation;

public class BaseSort {
    protected int swaps = 0;
    protected int runTime = 0;

    public void sort(int[] arr) {

    }

    public int getSwaps() {
        return swaps;
    }

    public int getRunTime() {
        return runTime;
    }

    protected void swap(int[] arr, int indexA, int indexB) {
        final int swapTemp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = swapTemp;
        swaps++;
    }
}
