
def bubbleSort(arr):
    n = len(arr)
    for i in range(n):
        swapped = False
        #Every iteration, last i items sorted
        for j in range(n-i-1):
            if(arr[j] > arr[j+1]):
                swapped = True
                arr[j], arr[j+1] = arr[j+1],arr[j]
        # One loop without swapping means that array already sorted
        if(not swapped):
            break
        