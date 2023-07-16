class BubbleSort:
    @staticmethod
    def bubble_sort(array):
        n = len(array)
        swapped = False

        for i in range(n-1):
            swapped = False
            for j in range(n - i - 1):
                if array[j] > array[j+1]:
                    #Swap array[j] and array[j+1]
                    array[j], array[j+1] = array[j+1], array[j]
                    swapped = True

            # If no elements were swapped, the array is aleardy sorted.
            if not swapped:
                break

    @staticmethod
    def print_array(array):
        for num in array:
            print(num, end=" ")
        print()

#Driver Code
array = [5,2,6,15,3,6,9]
print("Array before Sorting:")
BubbleSort.print_array(array)

BubbleSort.bubble_sort(array)

print("Array after Sorting:")
BubbleSort.print_array(array)
