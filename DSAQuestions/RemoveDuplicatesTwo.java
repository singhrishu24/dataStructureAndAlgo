//remove duplicates from an array in a sorted array in a manner so that unique element repeats at most twice.
//Time Complexity: O(n)
//Space Complexity: O(1)

//import java.util.Arrays;

public class RemoveDuplicatesTwo 
{
    public static int removeDuplicates(int[] nums)
    {
        /* if (nums.length == 0 || nums.length <= 2 || nums == null)
        return nums.length;

        int uniqueCount = 1;
        int count       = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i-1]){
                nums[uniqueCount] = nums[i];
                uniqueCount++;
                count = 1;
            } else {
                if (count < 2){
                    nums[uniqueCount] = nums[i];
                    uniqueCount++;
                    count++;
                }
            }
        }
        return uniqueCount;*/

        //Another approach : Using Two Pointers
        if (nums.length == 0 || nums.length <= 2 || nums == null)
        return nums.length;

        int uniqueCount = 2; 

        for (int i = 2; i < nums.length; i++)
        {
            if (nums[i] != nums[uniqueCount-2]){
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        //nums = Arrays.copyOfRange(nums, 0, uniqueCount);
        return uniqueCount;
        //Array.copyOfRange() method copies the specified range of the specified array into a new array.
        //The initial index of the range (from) must lie between zero and original array length minus one;
        //otherwise, a runtime exception will be thrown.
        //The value at original index (to) is not copied. 
    }

    //Driver Count 
    public static void main(String[] args)
    {
        int[] nums = {1,2,2,3,4,4,5,6,6,7,8,9,9};
        int length = removeDuplicates(nums);
        System.out.println("Length of the array after removing the duplicates: " + length);
        System.out.println("Array after removing the duplicates: ");
        for (int i = 0; i < length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}