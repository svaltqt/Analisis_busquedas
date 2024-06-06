package MetodosComplejos.QuickSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuickSort {
    public static ArrayList<Integer> quickSort(int size) {
        ArrayList<Integer> list = generateRandomList(size);
        quickSortHelper(list, 0, list.size() - 1);
        return list;
    }

    private static void quickSortHelper(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(list, low, high);
            quickSortHelper(list, low, partitionIndex - 1);
            quickSortHelper(list, partitionIndex + 1, high);
        }
    }

    private static int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                Collections.swap(list, i, j);
            }
        }

        Collections.swap(list, i + 1, high);
        return i + 1;
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
