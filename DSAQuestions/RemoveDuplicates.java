//Java Code for removing teh duplicates from a sorted array and return the number of unique elements.
//Time Complexity: O(n)
//Space Complexity: O(1)

public class RemoveDuplicates 
{
    public static int removeDuplicates (int[] nums)
    {
        if(nums.length == 0 || nums.length == 1 || nums == null) 
        return nums.length;
        
        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i-1]){
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

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