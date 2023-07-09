// Merging two sorted array into a single sorted array using Java.
// Time Complexity: O(n+m)
// Space Complexity: O(1)

// Using Two Pointer Approach 
public class MergeSortedArray 
{
    public static int[]  mergeSortedArray(int[] nums1,int m, int[] nums2, int n)
    {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (j>=0)
        {
            if (i >= 0 && nums1[i] > nums2[j])
            {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        return nums1;
    }
    // Driver Code
    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int[] result = mergeSortedArray(nums1, 3, nums2, 3);
        System.out.print("Result : ");
        for (int num : result){
            System.out.print(num + " ");}
    }
}

