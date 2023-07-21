# String Permutation using Pyhton

class StringPermutation:
    @staticmethod
    def find_permutations(s):
        permutations = []
        chars = list(s)
        StringPermutation.backtrack(chars, 0, permutations)
        return permutations
    
    @staticmethod
    def backtrack(chars, start, permutations):
        if start == len(chars) - 1:
            permutations.append(''.join(chars))
            return
        
        for i in range(start, len(chars)):
            StringPermutation.swap(chars, start, i)
            StringPermutation.backtrack(chars, start+1, permutations)
            StringPermutation.swap(chars, start, i)

    @staticmethod
    def swap(chars, i, j):
        chars[i], chars[j] = chars[j], chars[i]

#Driver Code
str = "abc"
permutations = StringPermutation.find_permutations(str)
print(permutations)
