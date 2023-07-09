def mergeSortedArray(nums1, m, nums2, n):
    i = m - 1
    j = n - 1
    k = m + n - 1

    while i >= 0 and j >= 0:
        if nums1[i] > nums2[j]:
            nums1[k] = nums1[i]
            i -= 1
        else:
            nums1[k] = nums2[j]
            j -= 1
        k -= 1

    # Copy remaining elements from nums2 to nums1 if any
    while j >= 0:
        nums1[k] = nums2[j]
        j -= 1
        k -= 1

    return nums1

# Driver Code
nums1 = [1, 2, 3, 0, 0, 0]
nums2 = [2, 5, 6]

result = mergeSortedArray(nums1, 3, nums2, 3)
print("Result:", result)
