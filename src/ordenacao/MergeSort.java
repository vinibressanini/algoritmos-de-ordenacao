package ordenacao;

public class MergeSort {
    public static void mergesort(int[] arr, int[] aux, int low, int high)
    {
        // Caso base
        if (high == low) {        // se o tamanho da execução == 1
            return;
        }

        // encontra o ponto médio
        int mid = (low + ((high - low) >> 1));

        // divide recursivamentemente as corridas em duas metades até o tamanho da corrida == 1,
        // então mescle-os e retorne a cadeia de chamadas

        mergesort(arr, aux, low, mid);          // divide/merge metade esquerda
        mergesort(arr, aux, mid + 1, high);     // divide/merge metade direita

        merge(arr, aux, low, mid, high);        // mescla as duas meias corridas
    }

    public static void merge(int[] arr, int[] aux, int low, int mid, int high)
    {
        int k = low, i = low, j = mid + 1;

        // Enquanto houver elementos nas execuções da esquerda e da direita
        while (i <= mid && j <= high)
        {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            }
            else {
                aux[k++] = arr[j++];
            }
        }

        // Copia os elementos restantes
        while (i <= mid) {
            aux[k++] = arr[i++];
        }

        // Não há necessidade de copiar a segunda metade (já que os itens restantes
        // já estão em sua posição correta no array auxiliar)

        // copia de volta para o array original para refletir a ordem ordenada
        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }
    }
}
