import bisect

def is_subsequence(s, t):
    s_length = len(s)
    t_length = len(t)
    s_index  = 0
    t_index  = 0

    while s_index < s_length and t_index < t_length:
        if s[s_index] == t[t_index]:
            s_index += 1
        t_index += 1
    return s_index == s_index

def is_subsequence_hash_map(s, t):
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
        insertion_index = bisect.bisect_left(indices, prev_index+1)

        if insertion_index == len(indices):
            return False
        prev_index = indices[insertion_index]
    return True

#Driver Code
s = "abc"
t = "ahbgce"
result = is_subsequence_hash_map(s, t)
print(result)        

