#include <stdio.h>

// QuickSort
// Pivot selected from high index

void swap(int *i, int *j)
{
    int temp = *i;
    *i = *j;
    *j = temp;
}

int partition(int arr[], int low, int high)
{
    int pivot = arr[high];

    int i = low - 1;
    int j;

    for (j = low; j < high; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    //Now i index of last element smaller than pivot
    swap(&arr[i + 1], &arr[high]);
    return i + 1;
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pivotPosition = partition(arr, low, high);
        quickSort(arr, low, pivotPosition - 1);
        quickSort(arr, pivotPosition + 1, high);
    }
}

int main()
{
    // Example Usage
    int arr[] = {50, 6, 1, 3, -10, 8, 2, 59, 2, 3, 67, 9, 25, 5, 60, 73, 3, 5, 0, 50, 6, 1, 3, -10, 8, 2, 59, 2, 3, 67, 9, 25, 5, 60, 73, 3, 5, 0, 50, 6, 1, 3, -10, 8, 2, 59};
    int n = sizeof(arr) / sizeof(arr[0]);

    quickSort(arr, 0, n - 1);

    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}
