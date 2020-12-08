package com.intrafoundation;

public class SelectionSort extends BaseSort {

    public void sort(int[] arr) {
        if(arr.length <= 1) return;

        swaps = 0;

        final int end = arr.length - 1;
        int partition = 0;
        do {
            // look through remaining partition and find lowest value
            // we are only interested in it's index -- called "index"
            int minValue = arr[partition];
            int index = partition;
            for (int i = partition; i <= end; i++) {
                if (arr[i] < minValue) {
                    index = i;
                    minValue = arr[i];
                }
            }

            //
            final int a = arr[partition];
            final int b = arr[index];
            if (a > b) {
                arr[partition] = b;
                arr[index] = a;
                swaps++;
            }
        } while (++partition < end);
    }

}


