def productExceptSelf (nums):
    n = len(nums)
    result = [1] * n

    #Calculate Prefix Products
    for i in range(1, n):
        result[i] = result[i-1] * nums[i-1]

    #Calculate suffix product and update the result
    right_product = 1
    for i in range(n-1, -1, -1):
        result[i] *= right_product
        right_product *= nums[i]

    return result

# Runtime Optimization beats previous one : 
'''class Solution(object):
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [1] * n

        # Calculate prefix products
        prefix_product = 1
        for i in range(n):
            result[i] *= prefix_product
            prefix_product *= nums[i]

        # Calculate suffix products and update the result
        suffix_product = 1
        for i in range(n-1, -1, -1):
            result[i] *= suffix_product
            suffix_product *= nums[i]

        return result'''

# Driver Code 
nums = [1,2,3,4]
result = productExceptSelf(nums)   
print(result)