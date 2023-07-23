# Kadane PrimAlgorithm implementation in Python.

def max_subarray_sum(nums):
    max_ending_here = nums[0]
    max_so_far = nums[0]

    for i in range(1, len(nums)):
        max_ending_here = max(nums[i], max_ending_here + nums[i])
        max_so_far = max(nums[i], max_ending_here)

    return max_so_far

if __name__ == "__main__" :
    nums1 = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    nums2 = [1, 2, 3, -2, 5]
    nums3 = [-1, -2, -3, -4]

    print("Max subarray sum 1:", max_subarray_sum(nums1))
    print("Max subarray sum 2:", max_subarray_sum(nums2))
    print("Max subarray sum 3:", max_subarray_sum(nums3))    