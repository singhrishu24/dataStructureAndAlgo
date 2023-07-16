def rotateArray(nums, k):
    k %= len(nums) 
    #Normalize the value to avoid unnecessary calculations
    reverse(nums, 0, len(nums)-1)
    print("Reverse 1:", nums)
    reverse(nums, 0, k-1)
    print("Reverse 2:", nums)
    reverse(nums, k, len(nums)-1)
    print("Reverse 3:", nums)

#Define the reverse function 
def reverse(nums, start, end):
    while start < end:
        nums[start], nums[end] = nums[end], nums[start]
        start += 1
        end -= 1

# Driver Code 
nums = [1,2,3,4,5]
k = 6
print("Original Array :", nums)
rotateArray(nums, k)
print("After Rotation: ", nums)            