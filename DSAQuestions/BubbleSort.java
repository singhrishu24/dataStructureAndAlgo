public class BubbleSort
{
    public static void bubbleSort(int[] array){
        int n = array.length;
        boolean swapped;

        for (int i=0; i < n - 1; i++){
            swapped = false;
            for (int j = 0; j < n-i-1; j++){
                if (array[j] > array[j+1]){
               // Swap array[j] and array[j+1]
                int temp   = array[j];
                array[j]   = array[j+1];
                array[j+1] = temp;
                swapped    = true;
                }
            }
        

        // If no elements were swapped, the array is already sorted.
            if (!swapped){
                break;
            }
        }    
    }

    public static void main(String[] args){
        int[] array = {5,2,6,15,3,6,9};
        System.out.println("Array before Sorting: ");
        printArray(array);

        bubbleSort(array);

        System.out.println("Array after Sorting: ");
        printArray(array);
    }

    public static void printArray(int[] array){
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}