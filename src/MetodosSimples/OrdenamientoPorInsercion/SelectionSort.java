package MetodosSimples.OrdenamientoPorInsercion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SelectionSort {
    public static ArrayList<Integer> selectionSort(int size) {
        ArrayList<Integer> list = generateRandomList(size);
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Encontrar el índice del elemento mínimo en el subarray sin ordenar
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Intercambiar el elemento mínimo con el primer elemento del subarray sin ordenar
            Collections.swap(list, minIndex, i);
        }

        return list;
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
