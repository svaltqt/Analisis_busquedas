package MetodosComplejos.HeapSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HeapSort {
    public static ArrayList<Integer> heapSort(int size) {
        ArrayList<Integer> list = generateRandomList(size);
        heapify(list, list.size());
        int n = list.size();

        for (int i = n - 1; i > 0; i--) {
            Collections.swap(list, 0, i);
            heapify(list, i);
        }

        return list;
    }

    private static void heapify(ArrayList<Integer> list, int n) {
        int startIdx = (n / 2) - 1;

        for (int i = startIdx; i >= 0; i--) {
            heapRoot(list, i, n);
        }
    }

    private static void heapRoot(ArrayList<Integer> list, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < n && list.get(left) > list.get(largest))
            largest = left;

        if (right < n && list.get(right) > list.get(largest))
            largest = right;

        if (largest != i) {
            Collections.swap(list, i, largest);
            heapRoot(list, largest, n);
        }
    }

    private static ArrayList<Integer> generateRandomList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(size * 10));
        }

        return list;
    }
}
