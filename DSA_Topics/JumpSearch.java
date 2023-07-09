// Java Implementation of Jump Search. 
// Time Complexity : O(√n)
// Space Complexity : O(1)
public class JumpSearch
{
    public static int jumpSearch(int[] arr, int x)
    {
        int n    = arr.length; //Get length of array.
        int step = (int)Math.floor(Math.sqrt(n)); //Calculate Step Size.
        int prev = 0; //Initialize previous step.
        int minStep = Math.min(step, n) -1; //Initialize minimum step.
        while (arr[Math.min(minStep,n -1)] < x) //Loop to find the block where element is present.
        {
            prev     = minStep;
            minStep  += step;
            if (prev >= n) return -1;
        }
        // Linear Search in Block.
        while (arr[prev] < x)
        {
            prev++;
            if (prev == Math.min(minStep, n)) return -1;
        }
        if (arr[prev] == x) return prev;
        else return -1;
    }

    //////////////////////////////////////////////
    //             Driver method               //
    //////////////////////////////////////////////

    public static void main(String[] args)
    {
        int arr[] = {11,22,32,45,51,58,64,78,90,100};
        int x     = 51;
        int index = jumpSearch(arr, x);
        System.out.println(x + " is at index " + index);
    }
}

