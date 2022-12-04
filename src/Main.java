import ordenacao.MergeSort;
import ordenacao.QuickSort;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 18, 24, 0, 5, -2 };
        int[] aux = Arrays.copyOf(arr, arr.length);


//        MergeSort.mergesort(arr, aux, 0, arr.length - 1);
        QuickSort.quickSort(arr,0,arr.length - 1);

        for (int i = 0; i < args.length; i++) {
            System.out.println(arr[i]);
        }

    }
}