# Longest Common Prefix code in Python

class LongestCommonPrefix:
    @staticmethod
    def longest_common_prefix(strs):
        if not strs:
            return ""
        
        prefix = strs[0]

        for s in strs[1:]:
            while s.find(prefix) != 0:
                prefix = prefix[:-1]
        return prefix        

# Driver Code
strs1 = ["flower", "flow", "flight"]
strs2 = ["dog", "racecar", "car"]
strs3 = ["apple", "apricot", "appetizer"]

print("Longest Common Prefix 1:", LongestCommonPrefix.longest_common_prefix(strs1))
print("Longest Common Prefix 2:", LongestCommonPrefix.longest_common_prefix(strs2))
print("Longest Common Prefix 3:", LongestCommonPrefix.longest_common_prefix(strs3))