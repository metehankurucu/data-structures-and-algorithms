
def selectionSort(arr): 
    for i in range(0, len(arr)): 
        minIndex = i
        for j in range(i + 1,len(arr)):
            if(arr[j] < arr[minIndex]):
                minIndex = j
        if(minIndex != i):
            arr[minIndex], arr[i] = arr[i], arr[minIndex]
    return arr
