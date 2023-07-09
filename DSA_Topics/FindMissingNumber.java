// Java code to implement the approach
//import java.io.*;
//import java.util.*;

class FindMissingNumber {

	//////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
    // Using Hashing
    // Time Complexity : O(n)
    // Space Complexity : O(n)
	public static void findMissing(int arr[], int N)
	{
		int i;
		int temp[] = new int[N + 1];
		for (i = 0; i <= N; i++) {
			temp[i] = 0;
		}

		for (i = 0; i < N; i++) {
			temp[arr[i] - 1] = 1;
		}

		int ans = 0;
		for (i = 0; i <= N; i++) {
			if (temp[i] == 0)
				ans = i + 1;
		}
		System.out.println(ans);
	}
	/* 
    // Driver Code
	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 7, 5, 6, 2 };
		int n = arr.length;
		findMissing(arr, n);
	}
    */

    ///////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////
    // Using Summation of first N natural numbers
    // Time Complexity : O(n)
    // Space Complexity : O(1)    
    public static int findMissing2(int arr[], int n)
    {
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)   
        sum -= arr[i];
        return sum;
    }
    // Driver Code
    /*public static void main(String[] args)
    {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;
        System.out.println(findMissing2(arr, n));
    }*/
    // This may cause overflow if n is large, thus subtract a number
    // from sum to avoid this.
    
    ///////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////
    // Using Binary Operations
    // Time Complexity : O(n)
    // Space Complexity : O(1)

    static int getMissingNo(int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        for(int i = 1; i < n; i++)
            x1 = x1 ^ a[i];
        for(int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;


            return (x1 ^ x2);
    }
    // Driver Code
    /*public static void main(String args[])
    {
        int arr[] = {1, 2, 4, 5, 6};
        int n = arr.length;
        int miss = getMissingNo(arr, n);
        System.out.println(miss);
    }*/
    ///////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////
    // Using Cyclic Sort
    // Time Complexity : O(n)
    // Space Complexity : O(1)

    static int getMissingNo2(int[] arr, int n)
    {
        int i = 0;
        while (i < n)
        {
            int correctpos = arr[i] - 1;
            if (arr[i] < n && arr[i] !== arr[correctpos])
            {
                swap(arr, i , correctpos);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++)
        {
            if (arr[index]!= index + 1)
            {
                return index + 1;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int i, int correctpos)
    {
        int temp        = arr[i];
        arr[i]          = arr[correctpos];
        arr[correctpos] = temp;
    }
    // Driver Code
    public static void main(String args[])
    {
        int arr[] = {1, 2, 4, 5, 6};
        int n     = arr.length;
        int ans   = getMissingNo2(arr, n);
        System.out.println(ans);
    }
}
