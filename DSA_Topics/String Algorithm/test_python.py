class StringPermutation:
    @staticmethod
    def find_permutations(s):
        permutations = []
        chars = list(s)
        StringPermutation.backtrack(chars, 0, permutations)
        return permutations

    @staticmethod
    def backtrack(chars, start, permutations):
        if start == len(chars):
            # Base case: When the 'start' index reaches the end, a complete permutation is ready.
            # Append the current permutation (string representation of chars) to 'permutations'.
            permutations.append(''.join(chars))
            return

        for i in range(start, len(chars)):
            # Swap the characters at the 'start' and 'i' indices to explore diff. choices
            chars[start], chars[i] = chars[i], chars[start] 
            # Recur with the next character fixed at the 'start' index
            StringPermutation.backtrack(chars, start + 1, permutations)
            # Revert the swap after the recursive call to backtrack
            chars[start], chars[i] = chars[i], chars[start]

# Driver Code
s = "abc"
permutations = StringPermutation.find_permutations(s)
print(permutations)
