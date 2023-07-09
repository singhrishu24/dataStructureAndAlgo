//Returning Majority Element in an array, which occurs more than n/2 times.
//Time Complexity: O(n)
//Space Complexity: O(1)
//Boyer-Moore Voting Algorithm

public class MajorityElement {
    public static Integer findMajorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int majorityElement = 0;
        int count = 0;

        // Iterate through the array
        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
                count = 1;
            } else if (num == majorityElement) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if the majority element occurs more than n/2 times
        count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }

        return count > nums.length / 2 ? majorityElement : null;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 5, 4, 2, 2};
        Integer majorityElement = findMajorityElement(nums);
        if (majorityElement != null) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element found.");
        }
    }
}
