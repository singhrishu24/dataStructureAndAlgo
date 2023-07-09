def linear_search(arr, x):
    for i in range(len(arr)):
        if arr[i] == x:
            return i
    return -1

def sentinel_linear_search(arr, x):
    n = len(arr)
    last_element = arr[n-1]
    arr[n-1] = x

    i = 0
    while arr[i] != x:
        i += 1

    arr[n-1] = last_element #Restore the original last element.

    if i < n - 1 or arr[n-1] == x:
        return i
    return -1    

#Driver Code
arr = [4, 2, 7, 1, 9, 5]
x = 7
index = sentinel_linear_search(arr, x) #Use Sentinel function call.

if index != -1:
    print(x, "is found at index", index)
else:
    print(x, "is not found in the array.")    