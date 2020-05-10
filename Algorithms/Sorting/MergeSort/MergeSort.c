#include <stdio.h>

void merge(int arr[], int left, int middle, int right)
{
    int leftArrLength = middle - left + 1;
    int rightArrLength = right - middle;

    int leftArr[leftArrLength];
    for (int i = 0; i < leftArrLength; i++)
        leftArr[i] = arr[i + left];

    int rightArr[rightArrLength];
    for (int j = 0; j < rightArrLength; j++)
        rightArr[j] = arr[middle + j + 1];

    int leftArrIndex = 0, rightArrIndex = 0;
    int index = left;

    while (leftArrIndex < leftArrLength && rightArrIndex < rightArrLength)
    {
        if (leftArr[leftArrIndex] <= rightArr[rightArrIndex])
            arr[index] = leftArr[leftArrIndex++];
        else
            arr[index] = rightArr[rightArrIndex++];
        index++;
    }

    while (leftArrIndex < leftArrLength)
        arr[index++] = leftArr[leftArrIndex++];

    while (rightArrIndex < rightArrLength)
        arr[index++] = rightArr[rightArrIndex++];
}

void mergeSort(int arr[], int left, int right)
{
    if (left < right)
    {
        int middle = (left + right) / 2;

        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);

        merge(arr, left, middle, right);
    }
}

int main()
{
    // Example Usage
    int arr[] = {1, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5, 0, 7, 3, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    mergeSort(arr, 0, n - 1);

    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}
