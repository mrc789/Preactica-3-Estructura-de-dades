package heapSort.test;

import heapsort.heapSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSortTest {
    @Test
    public void empty() {
        Integer[] array = {};
        Integer[] expectedArray = {};

        heapSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void zero() {
        Integer[] array = {0, 0, 0, 0, 0, 0, 0};
        Integer[] expectedArray = {0, 0, 0, 0, 0, 0, 0};

        heapSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void singleton() {
        Integer[] array = {5};
        Integer[] expectedArray = {5};

        heapSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void sortedPair() {
        Integer[] array = {5, 12};
        Integer[] expectedArray = {5, 12};

        heapSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void unsortedPair() {
        Integer[] array = {12, 5};
        Integer[] expectedArray = {5, 12};

        heapSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void unsorted() {
        Integer[] array = {5, 2, 9, 1, 7, 6, 3, 8};
        Integer[] expectedArray = {1, 2, 3, 5, 6, 7, 8, 9};

        heapSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void sortedNegative() {
        Integer[] array = {-9, -8, -7, -6, -5, -3, -2, -1};
        Integer[] expectedArray = {-9, -8, -7, -6, -5, -3, -2, -1};

        heapSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void unsortedNegative() {
        Integer[] array = {-5, -2, -9, -1, -7, -6};
        Integer[] expectedArray = {-9, -7, -6, -5, -2, -1};

        heapSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void unsortedNegPos() {
        Integer[] array = {-5, 2, -9, -1, 7, -6};
        Integer[] expectedArray = {-9, -6, -5, -1, 2, 7};

        heapSort.sort(array);

        assertArrayEquals(expectedArray, array);
    }
}
