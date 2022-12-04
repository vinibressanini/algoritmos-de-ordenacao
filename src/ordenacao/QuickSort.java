package ordenacao;

public class QuickSort {
    public static void quickSort(int[] array, int initial, int end) {
        int i, j, aux, pivo;

        i = initial;
        j = end;

        pivo =  array[(initial + end) >> 1];

        while (i <= j) {
            while (array[i] < pivo) {
                i++;
            }
            while (array[j] > pivo) {
                j--;
            }
            if (i <= j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }
        if (initial < j) {
            quickSort(array,initial,j);
        }
        if (i < end) {
            quickSort(array,i,end);
        }
    }
}
