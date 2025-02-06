package heapSort.test;

import heapsort.heapSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OpetarionsTest {
    
    @Test
    public void addZero() {
        Integer[] array = {5};
        Integer[] expectedArray = {0, 5};

        array = heapSort.addElement(array, 0);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void addPositive() {
        Integer[] array = {9, 7, 3, 0, 2};
        Integer[] expectedArray = {0, 2, 3, 7, 9, 11};

        array = heapSort.addElement(array, 11);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void addNegative() {
        Integer[] array = {5, 12, 6, 8, 2};
        Integer[] expectedArray = {-3 ,2, 5, 6, 8, 12};

        array = heapSort.addElement(array, -3);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void maxElement() {
        Integer[] array = {5, 12, 6, 8, 2};
        Integer[] expectedArray = {2, 5, 6, 8};

        array = heapSort.deleteRoot(array);

        assertArrayEquals(expectedArray, array);
    }

}
