// Java Code for returning indices of two numbers in an array that add up to a target number
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if (numMap.containsKey(complement))
            {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};

        int[] result = twoSum(arr, 45);
        
        if (result.length == 0){System.out.println("No solution found");}
        else {System.out.println(result[0] + " " + result[1]);}
    }
}