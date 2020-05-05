#include <stdio.h>

void shellSort(int arr[], int n)
{
    int i, j, gap, temp;

    for (gap = n / 2; gap > 0; gap /= 2)
    {
        for (i = gap; i < n; i++)
        {
            temp = arr[i];

            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                arr[j] = arr[j - gap];

            arr[j] = temp;
        }
    }
}

int main()
{
    /* Example Usage
    int arr[] = {1, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5, 0, 7, 3, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    shellSort(arr, n);

    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    */
    return 0;
}
