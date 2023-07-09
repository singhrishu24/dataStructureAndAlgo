// Rotate the array to the right by k steps, where k is non-negative.
//Time Complexity: O(n)
//Space Complexity: O(1)
import java.util.Arrays;

public class RotateArray
{
    public static void rotateArray(int[] nums, int k)
    {
        k %= nums.length; //Normalize if the value of k is greater than the length of the array. So that we can avoid the unnecessary rotations.
        //rotation = remainder
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1); 
    }
    
    //Defining Reverse Function
    public static void reverse(int[] nums, int start, int end)
    {
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }

    //Driver Code
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5};
        int k      = 6;
        System.out.println("OrigInal Rotation : " + Arrays.toString(nums));
        rotateArray(nums, k);
        System.out.println("After Rotation : " + Arrays.toString(nums));
    }
}