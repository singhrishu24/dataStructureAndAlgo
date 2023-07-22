// Kadane's Algorithm  : For finding the contiguous subarray with the largest sum in an array of integers.


public class KadaneAlgorithm{
    public static int maxSubArraySum(int[] nums){
        int maxEndingHere = nums[0]; // maximum sum subarray ending at the current position.
        int maxSoFar = nums[0]; // maximum sum subarray found so far.

        for (int i = 1; i < nums.length; i++){
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args){
        int [] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int [] nums2 = {1, 2, 3, -2, 5};
        int [] nums3 = {-1, -2, -3, -4};

        System.out.println("Max subarray in sum 1: " + maxSubArraySum(nums1));
        System.out.println("Max subarray in sum 2: " + maxSubArraySum(nums2));
        System.out.println("Max subarray in sum 3: " + maxSubArraySum(nums3));
    }
}