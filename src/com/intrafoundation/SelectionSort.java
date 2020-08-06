package com.intrafoundation;

import java.util.Arrays;

public class SelectionSort implements BaseSort {
    protected int swaps = 0;
    protected int runTime = 0;

    public void sort(int[] arr) {
        if(arr.length <= 1) return;

        // System.out.println(Arrays.toString(arr));

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
            // System.out.println("partition,end,index,minValue " + partition + "," + end + ","+ index + "," +minValue);

            //
            final int a = arr[partition];
            final int b = arr[index];
            // System.out.println("a,b " + a + "," +b);

            if (a > b) {
                arr[partition] = b;
                arr[index] = a;
                swaps++;
            }
            // System.out.println(Arrays.toString(arr));
        } while (++partition < end);
    }

    public int getSwaps() {
        return swaps;
    }

    public int getRunTime() {
        return runTime;
    }

}


