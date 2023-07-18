public class InsertionSort 
{
    public static void insertionSort(int[] array){
        int n = array.length;
        for (int i=1; i<n; i++){
            int key = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    public static void main(String[] args){
        int[] array = {5,2,8,12,1,6,3,8,4};
        System.out.println("Array before sorting:");
        printArray(array);

        insertionSort(array);

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