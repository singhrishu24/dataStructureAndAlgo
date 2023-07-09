def removeDuplicates(nums):
    if len(nums) == 0 or len(nums) <= 2:
        return len(nums)
    
    uniqueCount = 2

    for i in range(2, len(nums)):
        if nums[i] != nums[uniqueCount-2]:
            nums[uniqueCount] = nums[i]
            uniqueCount += 1
    return uniqueCount

# Driver Code
nums = [1,2,2,3,4,4,5,6,6,6,7,8,9,9,9] 
length = removeDuplicates(nums)
print("Length of the array after removing the duplicates: ", length)
print("Array after removing the duplicates: ")
for i in range(length):
    print(nums[i], end=" ") 