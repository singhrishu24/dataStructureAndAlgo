import numpy as np

def ubiquitous_binary_search(arrays, x):
    num_arrays = len(arrays)
    left = 0
    right = float('inf')
    lengths = [len(arr) for arr in arrays]

    for i in range(num_arrays):
        lengths[i] = len(arrays[i])
        right = min(right, lengths[i])

    while left <= right:
        mid = (left + right) // 2
        compare_result = compare(arrays, lengths, x, mid)

        if compare_result == 0:
            return mid
        elif compare_result < 0:
            right = mid - 1
        else:
            left = mid + 1

    return -1

def compare(arrays, lengths, x, mid):
    num_arrays = len(arrays)
    num_less = 0
    num_equal = 0

    for i in range(num_arrays):
        arr = arrays[i]
        length = lengths[i]
        index = binary_search_left(arr, x, 0, min(length, mid+1))

        if index < lengths[i] and arrays[i][index] == x:
            num_equal += 1
        elif index == 0:
            num_less += 1
        else:
            num_less += index

    if num_equal > 0:
        return 0
    elif num_less < num_arrays:
        return -1
    else:
        return 1

arrays = [[1, 3, 5], [2, 4, 6], [7, 8, 9]]
x = 4
result = ubiquitous_binary_search(arrays, x)

if result == -1:
    print("Element not found in the arrays")
else:
    print("Element is present at index", result)
