def removeDuplicates(nums):
    if len(nums) == 0 or len(nums) == 1:
        return len(nums)
    
    unique_count = 1
    for i in range(1, len(nums)):
        if nums[i] != nums[i-1]:
            nums[unique_count] = nums[i]
            unique_count += 1

    return unique_count

#Driver Code 
nums = [1,2,2,3,4,4,5,6,7,8,9,9]
length = removeDuplicates(nums)
print("Length of the array after removing the duplicates: ", length)
print("Array after removing the duplicates: ")
for i in range(length):
    print(nums[i], end=" ")        