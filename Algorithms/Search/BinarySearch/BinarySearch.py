
#Recursive version
def binarySearch(arr,x,left,right):
    if(right > 0):
        #find mid of arr
        mid = left + (right - left) // 2
        if(arr[mid] == x):
            return mid;
        elif(x > arr[mid]):
            return binarySearch(arr, x, mid + 1, right)
        else:
            #x < arr[mid]
            return binarySearch(arr, x, left, mid - 1)
    return -1
