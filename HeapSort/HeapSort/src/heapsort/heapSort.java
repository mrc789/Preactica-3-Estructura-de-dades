package heapsort;

import java.util.Arrays;
import java.util.Comparator;

public class heapSort {
    public static <E> void sort(
            E[] elements, Comparator<? super E> cmp) {
        new BinaryHeap<>(elements, cmp).heapSort(elements);
    }

    public static <E extends Comparable<? super E>> void sort(E[] elements) {
        sort(elements, Comparator.naturalOrder());
    }

    static class BinaryHeap<E> {
        final E[] elements;
        final Comparator<? super E> comparator;
        int heapSize;

        BinaryHeap (E[] elements, Comparator<? super E> comparator) {
            this.elements = elements;
            this.comparator = comparator;
            this.heapSize = 0;
        }

        void heapSort(E[] elements) {
            if (doHeapSort(elements)) {
                buildMaxHeap(elements);
                for (int i = heapSize; i > 0; i--) {
                    swap(0, i);
                    heapSize--;
                    maxHeap(elements, 0);
                }
                System.out.println("Array ordenado");
                System.out.println(Arrays.toString(elements));
            }
        }

        public void swap(int i, int j) {
            E temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
        }

        private void maxHeap(E[] elements, int i) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            int max;
            if (l <= heapSize && comparator.compare(elements[l], elements[i]) > 0) { // hay que usar comparator
                max = l;
            } else max = i;
            if (r <= heapSize && comparator.compare(elements[r], elements[max]) > 0) { // hay que usar comparator
                max = r;
            }
            if (max != i) {
                swap(i, max);
                maxHeap(elements, max);
            }
        }

        private void buildMaxHeap(E[] elements) {
            heapSize = elements.length - 1;
            for (int i = (heapSize / 2) ; i >= 0; i--) {
                maxHeap(elements, i);
            }
        }

        private boolean doHeapSort(E[] elements) {
            boolean bool = true;
            if (elements == null || elements.length == 0) {
                System.out.println("Array vacio o null");
                bool = false;
            } else if (elements.length == 1) {
                System.out.println("Array ordenado");
                System.out.println(Arrays.toString(elements));
                bool = false;
            }
            return bool;
        }

    }
}
