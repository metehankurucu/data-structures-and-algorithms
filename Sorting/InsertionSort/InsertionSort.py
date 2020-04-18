
# This algorithm works worse
def insertion_sort(array):
    indexes = range(len(array))
    for i in indexes:
        currentIndex = i
        while(currentIndex > 0 and array[currentIndex] < array[currentIndex-1]):
            array[currentIndex], array[currentIndex - 1] = array[currentIndex - 1], array[currentIndex]
            currentIndex -= 1
    return array

# This algorithm works better
def insertionSort(arr): 
    for i in range(1, len(arr)): 
        item = arr[i] 
        j = i-1
        while j >= 0 and item < arr[j] : 
            arr[j+1] = arr[j] 
            j -= 1
        arr[j+1] = item 
    return arr
