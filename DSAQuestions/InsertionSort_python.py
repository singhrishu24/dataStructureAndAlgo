class InsertionSort:
    @staticmethod
    def insertion_sort(array):
        n = len(array)
        for i in range(1, n):
            key = array[i]
            j = i-1
            while j >= 0 and array[j] > key:
                array[j+1] = array[j]
                j -= 1
            array[j+1] = key

    @staticmethod
    def print_array(array):
        for num in array:
            print(num, end=" ")
        print()

# Driver Code 
array = [5,2,8,12,1,6,3,8,4]
print("Array before sorting:")
InsertionSort.print_array(array)

InsertionSort.insertion_sort(array)

print("Array after sorting:")
InsertionSort.print_array(array)