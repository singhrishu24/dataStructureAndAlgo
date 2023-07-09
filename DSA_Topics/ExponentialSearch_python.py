import bisect

def exponential_search(arr, x):
    if arr[0] == x:
        return 0
    
    n = len(arr)
    i = 1
    while i < n and arr[i] <= x:
        i *= 2
    low = i//2
    high = min(i , n-1)
    return bisect.bisect_left(arr, x, low, high)

arr = [11,22,32,45,52,67,73,83,96,100]
x = 52
result = exponential_search(arr, x)
if result != len(arr) and arr[result] == x:
    print(f"{x} is at index {result}")
else:
    print(f"{x} is not found in the array.")     