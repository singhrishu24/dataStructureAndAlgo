import java.util.Arrays;
import java.util.*;

public class ExponentialSearch
{
    /*static int expSearch(int arr[], int n, int x)
    {
        if( arr[0]== x) return 0;

        int i =1;
        while(i < n && arr[i] <= x) 
        i *= 2; // i = i*2
        return Arrays.binarySearch(arr, i/2, Math.min(i,n-1), x);
        //                        (arr, fromIndex, toIndex, key)
    }

    ////////////////////////////////////////////////////
    //             Driver method                      //
    ////////////////////////////////////////////////////

    public static void main(String[] args)
    {
        int arr[]  = {11,22,32,45,51,58,64,78,90,100};
        int x      = 51;
        int result = expSearch(arr, arr.length, x);
        System.out.println(x + " is at index " + result);
    }*/

     /////////////////////////////////////////////////////////////
    //             Iterative method                            //
    // Used when the size of array is too large and it has to be passed as a list//
    // We don't call binarySearch Func from Arrays class  because it req an Array but we have Array as List      //
    // Time Complexity : O(Log n)                               //
    // Space Complexity : O(1)                                  //
    
    static int expo_Search(ArrayList<Integer> arr, int x)
    {
        int n = arr.size();
        if (n == 0) return -1;
      //  if(arr.get(0) == x) return 0;
        int i = 1;
        while(i < n && arr.get(i)< x) 
        i *= 2;
        // Perform Binary Search 
        int left = i/2;
        int right = Math.min(i, n-1);
        while (left<=right)
        {
            int mid = (left + right)/2;
            if (arr.get(mid) == x) return mid;
            else if (arr.get(mid) < x) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    ////////////////////////////////////////////////////
    //             Driver method                      //
    ////////////////////////////////////////////////////

    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(11,22,32,45,51,58,64,78,90,100));
        int x = 51;
        int result = expo_Search(arr, x);
        if (result == -1) System.out.println("Element not found");
        else System.out.println("Element found at index " + result);
    }
}