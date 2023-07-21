# String Reversal Code in Python.

class StringReversal :
    @staticmethod
    def reverse_string_sb(s):
        return s[::-1]
    
    @staticmethod
    def reverse_string_ca(s):
        char_array = list(s)
        start = 0
        end = len(char_array) - 1

        while start < end:
            char_array[start], char_array[end] = char_array[end], char_array[start]
            start  += 1
            end -= 1
        return ''.join(char_array)

# Driver Code 
input_string = "Hello, World!"
reversed_string_ca = StringReversal.reverse_string_ca(input_string)
reversed_string_sb = StringReversal.reverse_string_sb(input_string)

print("Reverse String using char array reversal:", reversed_string_ca)
print("Reversed string using slicing:", reversed_string_sb)