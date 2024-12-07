package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void testSortAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortUnsortedArray() {
        int[] array = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortArrayWithDuplicates() {
        int[] array = {4, 2, 4, 3, 1};
        int[] expected = {1, 2, 3, 4, 4};

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortEmptyArray() {
        int[] array = {};
        int[] expected = {};

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortSingleElementArray() {
        int[] array = {42};
        int[] expected = {42};

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }
}