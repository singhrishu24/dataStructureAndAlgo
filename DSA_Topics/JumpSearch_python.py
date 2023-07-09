import math 

def jump_search(arr, x):
    n = len(arr)
    step = int(math.floor(math.sqrt(n)))
    prev = 0
    min_step = min(step, n) -1

    #Find the block where the element is present
    while arr[min(min_step, n-1)] < x:
        prev = min_step
        min_step += step 
        if prev >= n:
            return -1
        
    # Linear search in the block
    while arr[prev] < x:
        prev += 1
        if prev ==min(min_step, n):
            return -1

    if arr[prev] == x:
        return prev
    else:
        return -1

arr = [11, 22, 32, 45, 51, 58, 64, 78, 90, 100]
x = 51
index = jump_search(arr, x)
if index != -1:
    print(x, "is at index", index)
else:
    print("Element not found.")    
