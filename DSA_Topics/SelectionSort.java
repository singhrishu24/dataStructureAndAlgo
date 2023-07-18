public class SelectionSort
{
    public static void selectionSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args){
        int[] array = {5,2,8,12,1,6,3,8,4};
        System.out.println("Array before sorting:");
        printArray(array);

        selectionSort(array);

        System.out.println("Array after sorting:");
        printArray(array);
    }

    public static void printArray(int[] array){
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}