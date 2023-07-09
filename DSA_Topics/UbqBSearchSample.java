import java.util.Arrays;

class UbqBSearchSample {
    public static int ubiquitousBinarySearch(int[][] arrays, int x) {
        int numArrays = arrays.length;
        int left = 0;
        int right = Integer.MAX_VALUE;
        int[] lengths = new int[numArrays];
        
        for (int i = 0; i < numArrays; i++) {
            lengths[i] = arrays[i].length;
            right = Math.min(right, lengths[i]);
        }
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int compareResult = compare(arrays, lengths, x, mid);
            
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }   
        return -1;
    }
    
    private static int compare(int[][] arrays, int[] lengths, int x, int mid) {
        int numArrays = arrays.length;
        int numLess = 0;
        int numEqual = 0;
        
        for (int i = 0; i < numArrays; i++) {
            int index = Arrays.binarySearch(arrays[i], 0, Math.min(lengths[i], mid + 1), x);
            
            if (index >= 0) {
                numEqual++;
            } else if (index == -1) {
                numLess++;
            } else {
                numLess += -index - 1;
            }
        }
        
        if (numEqual > 0) {
            return 0;
        } else if (numLess < numArrays) {
            return -1;
        } else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        int[][] arrays = {{1, 3, 5}, {2, 4, 6}, {7, 8, 9}};
        int x = 4;
        int result = ubiquitousBinarySearch(arrays, x);
        
        if (result == -1) {
            System.out.println("Element not found in the arrays");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
