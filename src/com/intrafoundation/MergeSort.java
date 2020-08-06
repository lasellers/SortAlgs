package com.intrafoundation;

public class MergeSort implements BaseSort {
    protected int swaps = 0;
    protected int runTime = 0;

    public void sort(int[] arr) {
        swaps = 0;
        mergeSort(arr, arr.length);
    }

    public void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
        swaps++;
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right
    ) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public int getSwaps() {
        return swaps;
    }

    public int getRunTime() {
        return runTime;
    }

}

