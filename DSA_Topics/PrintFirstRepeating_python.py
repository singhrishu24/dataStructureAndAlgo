def print_first_repeating(arr):
    min_index = -1
    num_set = set()

    #Traverse the input array from right to left 
    for i in range(len(arr) - 1, -1, -1):
        if arr[i] in num_set:
            min_index = 1
        else:
            num_set.add(arr[i])

    if min_index != -1:
        print("The first repeating element is ", arr[min_index])
    else:
        print("There are no repeating elements.")

arr = [10,5,3,4,3,5,6]
print_first_repeating(arr)