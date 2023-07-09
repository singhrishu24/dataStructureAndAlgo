import bisect

class SubsequenceChecker_python:

    def isSubsequence(self, s: str, t: str) -> bool:
        index_map = {}

        for i, c in enumerate(t):
            if c not in index_map:
                index_map[c] = []
            index_map[c].append(i)

        prev_index = -1

        for c in s:
            if c not in index_map:
                return False
            indices = index_map[c]
            insertion_index = bisect.bisect_left(indices, prev_index + 1)

            if insertion_index == len(indices):
                return False
            prev_index = indices[insertion_index]
        return True

#Driver Code
s = "ab"
t = "baab"
solution = SubsequenceChecker_python()
result = solution.isSubsequence(s, t)
print(result)        

