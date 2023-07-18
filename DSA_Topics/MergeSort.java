public class MergeSort
{
    public static void mergeSort(int[] array){
        if (array.length <= 1){
            return; // Base Case : already sorted.
        }

        // Divide the array into two halves.
        int mid = array.length/2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, mid, right, 0, right.length);

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves.
        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] array){
        int i = 0; //Index for the left subarray.
        int j = 0; //Index for the right subarray.
        int k = 0; //Index for the merged array.

        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){
                array[k] = left[i];
                i++;
            }else{
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left subarray.
        while (i < left.length){
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right subarray.
        while (j < right.length){
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args){
        int[] array = {5,2,8,12,1,6,3,8,4};
        System.out.println("Array before sorting:");
        printArray(array);

        mergeSort(array);

        System.out.println("Array after sorting:");
        printArray(array);
    }

    public static void printArray(int[] array){
        for (int num : array){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}