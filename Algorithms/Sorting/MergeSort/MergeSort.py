
def mergeSort(arr):
    if len(arr) > 1:

        middle = len(arr) // 2
        leftArr = arr[:middle]
        rightArr = arr[middle:]

        mergeSort(leftArr)
        mergeSort(rightArr)

        merge(arr, leftArr, rightArr)

def merge(arr,leftArr, rightArr):
    index = leftIndex = rightIndex = 0
    while leftIndex < len(leftArr) and rightIndex < len(rightArr):
        if(leftArr[leftIndex] <= rightArr[rightIndex]):
            arr[index] = leftArr[leftIndex]
            leftIndex += 1
        else:
            arr[index] = rightArr[rightIndex]
            rightIndex += 1
        index += 1

    #fill remaining items
    while leftIndex < len(leftArr):
        arr[index] = leftArr[leftIndex]
        leftIndex += 1
        index += 1

    while rightIndex < len(rightArr):
        arr[index] = rightArr[rightIndex]
        rightIndex += 1
        index += 1
