package com.intrafoundation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sort0() {
        int[] arr = SortData.getSortDataInt0();
        InsertionSort s = new InsertionSort();
        s.sort(arr);
        Assertions.assertArrayEquals(SortData.getSortDataInt0Sorted(), arr);
        Assertions.assertEquals(0, s.getSwaps());
    }

    @Test
    void sort4() {
        int[] arr = SortData.getSortDataInt4();
        InsertionSort s = new InsertionSort();
        s.sort(arr);
        Assertions.assertArrayEquals(SortData.getSortDataInt4Sorted(), arr);
        Assertions.assertEquals(3, s.getSwaps());
    }

    @Test
    void sort6() {
        int[] arr = SortData.getSortDataInt6();
        InsertionSort s = new InsertionSort();
        s.sort(arr);
        Assertions.assertArrayEquals(SortData.getSortDataInt6Sorted(), arr);
        Assertions.assertEquals(8, s.getSwaps());
    }

    @Test
    void sortBigData() {
        InsertionSort s = new InsertionSort();
        int[] arr = SortData.getSortDataIntBigData();
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        s.sort(arr);
        Assertions.assertArrayEquals(sorted, arr);
        Assertions.assertTrue( arr.length > 0);
    }

    @Test
    void getSwaps() {
    }

    @Test
    void getRunTime() {
    }
}