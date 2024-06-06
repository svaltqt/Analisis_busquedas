package MetodosSimples.OrdenamientoBurbuja;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 1000000};

        for (int size : sizes) {
            long startTime = System.nanoTime();
            ArrayList<Integer> sortedList = BubbleSort.bubbleSort(size);
            long endTime = System.nanoTime();

            System.out.println("Lista ordenada de tamaño " + size + ": " + sortedList);
            System.out.println("Tiempo de ejecución: " + (endTime - startTime) / 1000000 + " ms");
            System.out.println();
        }
    }
}