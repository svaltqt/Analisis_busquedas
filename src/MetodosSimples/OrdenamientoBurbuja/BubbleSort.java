package MetodosSimples.OrdenamientoBurbuja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BubbleSort {
    public static ArrayList<Integer> bubbleSort(int size) {
        ArrayList<Integer> list = generateRandomList(size);
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
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