def twoSum(nums, target):
    numMap = {}
    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in numMap:
            return [numMap[complement], i]
        numMap[nums[i]] = i
    return []

# Driver Code
arr = [2,7,11,15]
result = twoSum(arr, 45)
if len(result) == 0:
    print("No Solution Found.")
else:
    print(result[0], result[1])        