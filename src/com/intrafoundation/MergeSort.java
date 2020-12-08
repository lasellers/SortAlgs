package com.intrafoundation;

// note: still refactoring this ...
public class MergeSort extends BaseSort {

    public void sort(int[] arr) {
        if (arr.length <= 1)
            return;

        swaps = 0;
        mergeSort(arr, arr.length);
    }

    public void mergeSort(int[] arr, final int len) {
        if (len < 2) {
            return;
        }

        final int mid = len / 2;
        final int lenmid = len - mid;

        int[] l = new int[mid];
        int[] r = new int[lenmid];

        System.arraycopy(arr, 0, l, 0, mid);
        if (lenmid >= 0)
            System.arraycopy(arr, mid, r, 0, lenmid);
/*        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }*/

        mergeSort(l, mid);
        mergeSort(r, lenmid);

        merge(arr, l, r, mid, lenmid);
        swaps++;
    }

    public static void merge(
            int[] a, int[] l, int[] r, final int left, final int right
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

}

