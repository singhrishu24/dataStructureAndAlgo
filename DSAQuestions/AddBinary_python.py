#Adding two binary String and giving result as Binary String
#Time Complexity : O(1)
#Space Complexity : O(1)

"""
def addBinary(a, b) :
    result = ''
    carry = 0
    i = len(a) - 1
    j = len(b) - 1
    
    while i >= 0 or j >= 0 or carry != 0 :
        digit_a = int(a[i]) if i >= 0 else 0
        digit_b = int(b[j]) if j >= 0 else 0

        # Compute the sum of current digits and carry 
        digit_sum = digit_a + digit_b + carry

        # Append the least significant bit of the sum of result
        result = str(digit_sum % 2) + result

        # Update the carry 
        carry = digit_sum//2

        #Move to the next digits
        i -= 1
        j -= 1

    return result
"""

# Using Bit Manipulation technique
# Time complexity and Space Complexity : O(N)

def addBinary(a, b):
    x = int(a, 2) #Convert binary string a to decimal 
    y = int(b, 2) #Convert binary string b to decimal 

    while y != 0:
        #Perform Bitwise Operation 
        sum_result = x ^ y
        carry = (x&y)<<1

        x = sum_result
        y = carry 

    return bin(x)[2:] #Convert decimal back to binary string     


# Driver Code 
a = '101'
b = '1101'
result = addBinary(a, b)
print(" Result is : ", result)     