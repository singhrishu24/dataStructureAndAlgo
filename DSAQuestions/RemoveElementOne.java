//Remove Element from the array.
//Given an array and a value, remove all instances of that value in place and return the new length.

//Time Complexity: O(n)
//Space Complexity: O(1)

public class RemoveElementOne
{
    public static int removeElement(int[] nums, int val)
    {
        int i = 0;
        for (int j = 0; j < nums.length; j++)
        {
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    //Driver Code
    public static void main(String[] args)
    {
        int[] nums = {3,5,6,8,9,4,5,4,6};
        int val = 4;

        int length = removeElement(nums, val);
        System.out.println("Length of the array after removing the element: " + length);
        System.out.println("Array after removing the element: ");
        for (int i = 0; i < length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}