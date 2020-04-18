#include <stdio.h>

void insertionSort(int arr[], int n){
    int i,item,j;
    for(i = 0;i < n;i++){
        item = arr[i];
        j = i - 1;
        while(j >= 0 && item < arr[j]){
            arr[j+1] = arr[j];
            j -= 1;
        }
        arr[j+1] = item;
    }
}

int main() 
{ 
    /** Example Usage
    int arr[] = { 1, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5 ,0 ,7 ,3 ,5 }; 
    int n = sizeof(arr) / sizeof(arr[0]); 
  
    insertionSort(arr, n); 
    
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]); 
    */

    return 0; 
} 
