#include <stdio.h>

void selectionSort(int arr[], int n){
    int i, j, min, temp;
    for(i = 0; i < n - 1; i++){
        min = i;
        for(j = i + 1; j < n; j++){
            if(arr[j] < arr[min])
                min = j;
        }

        if(min != i){
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}

int main() 
{ 
    // Example Usage
    int arr[] = { 1, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5, 0, 7, 3, 5 }; 
    int n = sizeof(arr) / sizeof(arr[0]); 
  
    selectionSort(arr, n); 
    
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]); 

    return 0; 
} 
