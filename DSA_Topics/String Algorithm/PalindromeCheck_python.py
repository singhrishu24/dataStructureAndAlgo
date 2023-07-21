# Palindrome Check code in python

class PalindromeCheck:
    @staticmethod
    def is_palindrome(s):
        left = 0
        right = len(s) - 1

        while left < right:
            left_char = s[left].lower()
            right_char = s[right].lower()

            if not left_char.isalnum():
                left += 1
            elif not right_char.isalnum():
                right -= 1 
            else:
                if left_char != right_char:
                    return False
                left += 1
                right -= 1
        return True

# Driver Code
input1 = "A man, a plan, a canal: Panama"
input2 = "race a car"

print("Is '", input1, "' a palindrome? ", PalindromeCheck.is_palindrome(input1))
print("Is '", input2, "' a palindrome? ", PalindromeCheck.is_palindrome(input2))