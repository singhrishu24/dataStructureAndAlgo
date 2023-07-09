def removeElement(nums, val):
    i = 0
    for j in range(len(nums)):
        if nums[j] != val:
            nums[i] = nums[j]
            i += 1
    return i

# Driver Code
nums = [3,5,6,8,9,4,5,4,6]  
val = 4
length = removeElement(nums, val)   
print("Length of the array after removing the element :", length)
print("Array after removing the element :")
for i in range(length):
    print(nums[i], end=" ")
