class SelectionSort:
    @staticmethod
    def selection_sort(array):
        n = len(array)
        for i in range(n-1):
            min_index = i
            for j in range(i+1, n):
                if array[j] < array[min_index]:
                    min_index = j

            # Swap array[i] and array[min_index]   
            array[i], array[min_index] = array[min_index], array[i]
    @staticmethod
    def print_array(array):
        for num in array:
            print(num, end=" ")
        print()

# Driver Code
array = [5,2,8,12,1,6,3,8,4]
print("Array before Sorting:")
SelectionSort.print_array(array)

SelectionSort.selection_sort(array)

print("Array after Sorting:")
SelectionSort.print_array(array)
