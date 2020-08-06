package com.intrafoundation;

import java.util.Arrays;

public class SortData {
    /**
     * This uses the in-built sort function to sort any generated big data
     * where we don't know what the result should be before hand.
     * We trust the built in sort works and can compare it to our custom sort data.
     * @param arr
     * @param s
     * @return
     */
    public static int[] getSortedReference(int[] arr, BaseSort s)
    {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        s.sort(arr);
        return sorted;
    }

    public static int[] getSortDataInt0() {
        return new int[]{};
    }

    public static int[] getSortDataInt0Sorted() {
        return new int[]{};
    }

    public static int[] getSortDataInt4() {
        return new int[]{3, 1, 2, 4};
    }

    public static int[] getSortDataInt4Sorted() {
        return new int[]{1, 2, 3, 4};
    }

    public static int[] getSortDataInt6() {
        return new int[]{7, 1, 100, -1, 3, 4};
    }

    public static int[] getSortDataInt6Sorted() {
        return new int[]{-1, 1, 3, 4, 7, 100};
    }

    public static int[] getSortDataIntBigData() {
        final int MAX = 200;
        int[] arr = new int[MAX + 1];

        for (int index = 0; index < MAX; index++) {
            arr[index] = randomMinMax(-5, 100);
        }
        return arr;
    }

    protected static int randomMinMax(int minV, int maxV) {
        return (int) (Math.random() * (maxV - minV + 1) + minV);
    }

/*    protected static double randomMinMax(int min, int max) {
        return Math.random() * (max - min + 1) + min;
    }*/

    /* public static double[] getSortDataFloat10() {
        return new double[]{0.3, 7.7, 9.3, 10.1, 11.4, 15.4, 19.9, 34.8, 40.9, 46.4, 52.2, 54.3, 62.3, 69.9, 70.5, 73.2,
                79.9, 82.8, 88.2, 90.9, 94.7, 96.6, 96.8, 100.1, 103.7};
    } */

}