package com.intrafoundation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseSortTest {

    @Test
    void sort() {
        BaseSort s = new BaseSort();
        int[] arr = new int[]{2, 3, 1};

        s.sort(arr);

        Assertions.assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    void getSwaps() {
        BaseSort s = new BaseSort();
        Assertions.assertEquals(0, s.getSwaps());

        int[] arr = new int[]{1, 2, 3};
        s.sort(arr);

        Assertions.assertEquals(0, s.getSwaps());
    }

    /* Test
    void getRunTime() {
    } */

    @Test
    void swap() {
        BaseSort s = new BaseSort();
        int[] arr = new int[]{1, 2, 3};

        s.swap(arr, 0, 1);

        Assertions.assertArrayEquals(new int[]{2, 1, 3}, arr);
    }
}