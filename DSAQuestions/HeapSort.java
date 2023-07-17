public class HeapSort{
    public static void heapSort(int[] array){
        int n = array.length;

        //Build Max Heap
        for(int i = n/2 -1; i >= 0; i--){
            heapify(array, n, i);
        }

        //Extract elements from the heap one by one.
        for (int i = n-1; i > 0; i--){
            //Move the current root (max element) to the end.
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Heapify the reduced heap.
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i){
        int largest = i; //Initialize largest element as the root.
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;

        // If the left is larger than the root.
        if (leftChild < n && array[leftChild] > array[largest]){
            largest = leftChild;
        }
        // If the right child is larger than the root.
        if (rightChild < n && array[rightChild] > array[largest]){
            largest = rightChild;
        }

        // If the largets element is not the root , swap them and heapify the affected sub-tree
        if (largest != i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }

    public static void main(String[] args){
        int[] array = {5, 2, 8, 12, 1, 6, 3, 5};
        System.out.println("Array before sorting:");
        printArray(array);

        heapSort(array);

        System.out.println("Array after sorting:");
        printArray(array);
    }

    public static void printArray(int[] array){
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}