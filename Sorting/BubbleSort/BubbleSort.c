#include <stdio.h>

void bubbleSort(int arr[], int n){
    int i,j,swapped,temp;
    for(i = 0; i < n; i++){
        swapped = 0;
        for(j = 0; j < n - i - 1; j++){
            if(arr[j] > arr[j + 1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = 1;
            }
        }
        if(!swapped)
            break;
    }
}

int main() 
{ 
    /*/ Example Usage
    int arr[] = { 1, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5 ,0 ,7 ,3 ,5 }; 
    int n = sizeof(arr) / sizeof(arr[0]); 
  
    bubbleSort(arr, n); 
    
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]); 
    
    */
    return 0; 
} 
