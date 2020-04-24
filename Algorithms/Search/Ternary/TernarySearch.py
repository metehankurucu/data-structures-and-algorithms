
def ternarySearch(arr, x, left, right): 
    if (right > 0): 
        mid1 = left + (right - left) // 3
        mid2 = right - (right - left) // 3

        if (arr[mid1] == x):  
            return mid1 
        if (arr[mid2] == x):  
            return mid2 

        if (x < arr[mid1]):  
            return ternarySearch(arr, x, left, mid1 - 1) 
        elif (x > arr[mid2]):  
            return ternarySearch(arr, x, mid2 + 1, right) 
        else:  
            return ternarySearch(arr, x, mid1 + 1, mid2 - 1) 
    #not found
    return -1
