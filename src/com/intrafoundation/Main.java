package com.intrafoundation;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BaseSort s = new BaseSort();
        int[] arr = new int[]{2, 3, 1};
        s.sort(arr);
        System.out.println("Main: BaseSort = " + Arrays.equals(new int[]{1, 2, 3}, arr));
    }
}
