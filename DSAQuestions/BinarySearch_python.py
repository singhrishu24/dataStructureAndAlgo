class BinarySearch:
    @staticmethod
    def binary_search(array, target):
        left = 0
        right = len(array)-1

        while left <= right:
            mid = left + (right - left)//2
            if array[mid] == target:
                return mid
            elif array[mid] < target:
                left = mid+1
            else:
                right = mid - 1
        return -1

array = [1,3,5,7,9,11,12]    
target = 7

result = BinarySearch.binary_search(array, target)
if result != -1:
    print("Target found at index :", result)
else:
    print("Target nout found in the array.")    
