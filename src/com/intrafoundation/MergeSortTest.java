package com.intrafoundation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sort0() {
        int[] arr = SortData.getSortDataInt0();
        MergeSort s = new MergeSort();
        s.sort(arr);

        Assertions.assertArrayEquals(SortData.getSortDataInt0Sorted(), arr);
        Assertions.assertEquals(0, s.getSwaps());
    }

    @Test
    void sort4() {
        int[] arr = SortData.getSortDataInt4();
        MergeSort s = new MergeSort();
        s.sort(arr);

        Assertions.assertArrayEquals(SortData.getSortDataInt4Sorted(), arr);
        Assertions.assertEquals(3, s.getSwaps());
    }

    @Test
    void sort6() {
        int[] arr = SortData.getSortDataInt6();
        MergeSort s = new MergeSort();
        s.sort(arr);

        Assertions.assertArrayEquals(SortData.getSortDataInt6Sorted(), arr);
        Assertions.assertEquals(5, s.getSwaps());
    }

    @Test
    void sortBigData() {
        MergeSort s = new MergeSort();
        int[] arr = SortData.getSortDataIntBigData();
        int[] sorted = SortData.getSortedReference(arr, s);
        s.sort(arr);

        Assertions.assertArrayEquals(sorted, arr);
        Assertions.assertTrue( arr.length > 0);
    }

    @Test
    void mergeSort() {
    }

    @Test
    void merge() {
    }

}