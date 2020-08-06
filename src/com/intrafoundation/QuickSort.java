package com.intrafoundation;

public class QuickSort implements BaseSort {
    protected int swaps = 0;
    protected int runTime = 0;

    public void sort(int[] arr) {
        swaps = 0;
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            final int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        final int pivot = arr[end];
        int slidingIndex = (begin - 1);

        for (int loopIndex = begin; loopIndex < end; loopIndex++) {
            if (arr[loopIndex] <= pivot) {
                swap(arr, ++slidingIndex, loopIndex);
            }
        }

        swap(arr, ++slidingIndex, end);

        return slidingIndex;
    }

    private void swap(int[] arr, int indexA, int indexB) {
        int swapTemp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = swapTemp;
        swaps++;
    }

    public int getSwaps() {
        return swaps;
    }

    public int getRunTime() {
        return runTime;
    }

}
