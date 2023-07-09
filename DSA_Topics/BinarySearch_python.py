def binary_search_iterative(arr, target):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high)//2

        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1

def binary_search_recursive(arr, target, low, high):

    if low > high:
        return -1
    mid = low + (high-low)//2

    if arr[mid] == target:
        return mid
    elif arr[mid] < target:
        return binary_search_recursive(arr, target, mid+1, high)
    else:
        return binary_search_recursive(arr, target, low, mid-1)


    
#Driver Code 
arr = [2,4,6,8,10,12,14,16,18,20]
target = 12

#result = binary_search_iterative(arr, target)
result = binary_search_recursive(arr, target, 0, len(arr)-1)
if result != -1 :
    print("Element found at index :", result)
else:
    print("Element not found in the array.")    