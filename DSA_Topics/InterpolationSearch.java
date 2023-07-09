// Java implementation of Implementing Interpolation.


class InterpolationSearch
{
    public static int interpolationSearch(int arr[], int lo, int hi, int x)
    {
        int pos;
        if (lo <= hi && x >= arr[lo] && x <= arr[hi])
        {
            pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]));
            // Probing the position with keeping uniform distribution..
            if (arr[pos] == x) return pos;
            if (arr[pos] < x) return interpolationSearch(arr, pos + 1, hi, x);
            if (arr[pos] > x) return interpolationSearch(arr, lo, pos - 1, x);
        }
        return -1;
    }

    //////////////////////////////////////////
    //              Driver method           //
    /////////////////////////////////////////
    public static void main(String[] args)
    {
        int arr[] = {11,22,32,45,51,58,64,78,90,100};
        int n     = arr.length;
        int x     = 51;
        int index = interpolationSearch(arr, 0, n-1, x);
        if (index != -1) System.out.println("Element found at index " + index);
        else System.out.println("Element not found."); 
    }
}