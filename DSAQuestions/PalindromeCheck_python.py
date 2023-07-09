'''
Python Code for checking if the string provided is a Palindrome.
Time Complexity  : O(n)
Space Complexity : O(1)
'''

def is_palindrome(s):
    clean_string = ''.join(c.lower() for c in s if c.isalnum())
    left = 0
    right = len(clean_string)-1

    while left < right:
        if clean_string[left] != clean_string[right]:
            return False
        left += 1
        right -= 1
    return True

#Driver Code 
if __name__ == "__main__":
    s = "Pikachu"
    result = is_palindrome(s)
    print("Is Palindrome: ", result)    
