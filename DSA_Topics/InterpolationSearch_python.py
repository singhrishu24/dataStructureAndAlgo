def interpolation_search(arr, lo, hi, x):
    if lo <= hi and x >= arr[lo] and x <= arr[hi]:
        pos = lo + ((hi-lo) // (arr[hi] - arr[lo])) * (x - arr[lo])

        #Probing the position with keeping uniform distribution.
        if arr[pos] == x:
            return pos
        if arr[pos] < x:
            return interpolation_search(arr, pos+1, hi, x)
        if arr[pos] > x:
            return interpolation_search(arr, lo, pos-1, x)
    return -1

arr = [11, 22, 32, 45, 51, 58, 64, 78, 90, 100]
x = 51
index = interpolation_search(arr, 0, len(arr)-1, x)
if index != -1:
    print("Element found at the index", index)
else:
    print("Element not found in the array.")        