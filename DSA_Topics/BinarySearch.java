// For using Binary search the data must be Sorted.
// Access to any element takes constant time.

class BinarySearch
{
    // Implementation of Iterative Binary Search
    /*int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) 
        {
            int m = l + (r - l) / 2;

            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m +1;

            else
                r = m - 1;        
        }
        return -1;
    }

    ////////////////////////////////////////////////////////////////
    //                       Driver method                        //
    ////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[]       = {2,3,5,10,36};
        int n           = arr.length;
        int x           = 10;
        int result      = ob.binarySearch(arr, x);
        if (result == -1) 
            System.out.println("Element not present in the array.");
        else
            System.out.println("Element is present at index " + result);    
    }*/


    ////////////////////////////////////////////////////////////////////
    //         Implementation of Recursive Binary Search             //
    ///////////////////////////////////////////////////////////////////

    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= 1)
        {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) return mid;
            if (arr[mid]  > x) return binarySearch(arr, l, mid - 1, x);
            else return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    //////////////////////////////////////////////
    //              Driver method               //
    //////////////////////////////////////////////
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[]       = {2,3,4,10,34,24};
        int n           = arr.length;
        int x           = 10;
        int result      = ob.binarySearch(arr, 0, n-1, x);
        if (result == -1) System.out.println("Element not present in array.");
        else System.out.println("element present at index " + result);
    }
}