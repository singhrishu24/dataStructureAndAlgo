def plusOne(digits):
    n = len(digits)

    # Traverse array from "Right" to "Left"
    for i in range(n-1, -1, -1):
        #If current digit less than 9 then increment by 1 and return the array.
        if digits[i] < 9:
            digits[i] += 1
            return digits
        #If current digit is 9, then make it 0.
        digits[i] = 0

    # If all digits are 9, then create a new array with size n+1
    #and make the first element 1
    new_number = [0] * (n+1)
    new_number[0] = 1
    return new_number

# Driver Code 
digits = [9,9,9]
result = plusOne(digits)
print("Result: ", result)
