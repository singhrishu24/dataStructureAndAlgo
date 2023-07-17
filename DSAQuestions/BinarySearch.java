public class BinarySearch
{
    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if (array[mid] == target){
                return mid;
            } else if (array[mid] < target){
                left = mid+1; // Target in right half.
            } else {
                right = mid+1; // Target in left half.
            }
        }
        return -1; 
    }

    public static void main(String[] args){
        int[] array = {1,3,5,7,9,11,12};
        int target = 7;

        int result = binarySearch(array, target);
        if (result != -1){
            System.out.println("Target found at index " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}