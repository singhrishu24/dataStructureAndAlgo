class HeapSort:
    @staticmethod
    def heapSort(array):
        n = len(array)

        # Build Max Heap
        for i in range(n // 2 - 1, -1, -1):
            HeapSort.heapify(array, n, i)

        # Extract elements from the heap one by one.
        for i in range(n - 1, 0, -1):
            # Move the current root(max element) to the end
            array[0], array[i] = array[i], array[0]

            # Heapify the reduced heap
            HeapSort.heapify(array, i, 0)

    @staticmethod
    def heapify(array, n, i):
        largest = i  # Initialize the largest element as the root.
        leftChild = 2 * i + 1
        rightChild = 2 * i + 2

        # If the left child is larger than the root.
        if leftChild < n and array[leftChild] > array[largest]:
            largest = leftChild

        # If the rightChild is larger than the root.
        if rightChild < n and array[rightChild] > array[largest]:
            largest = rightChild

        # If the largest element is not the root, swap them and heapify the affected sub-tree
        if largest != i:
            array[i], array[largest] = array[largest], array[i]
            HeapSort.heapify(array, n, largest)

    @staticmethod
    def printArray(array):
        for num in array:
            print(num, end=" ")
        print()


# Driver code
array = [5, 2, 8, 12, 1, 6, 3, 5]
print("Array before sorting:")
HeapSort.printArray(array)

HeapSort.heapSort(array)

print("Array after sorting:")
HeapSort.printArray(array)
