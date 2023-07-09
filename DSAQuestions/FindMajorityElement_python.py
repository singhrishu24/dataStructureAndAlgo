def findMajorityElement(nums):
    if not nums:
        return None
    
    majorityElement = 0
    count = 0

    # Iterate through Array 
    for num  in nums:
        if count == 0:
            majorityElement = num
            count = 1
        elif num == majorityElement:
            count += 1
        else:
            count -= 1

    # Verify if the Majority Element occurs n/2 times
    count = 0
    for num in nums:
        if num == majorityElement:
            count += 1
    return majorityElement if count > len(nums)//2 else None

# Driver Code 
nums = [2,2,3,5,6,2,2]
majorityElement = findMajorityElement(nums)
if majorityElement is not None:
    print("Majority Element: ", majorityElement)
else:
    print("No Majority Element found.")                        
