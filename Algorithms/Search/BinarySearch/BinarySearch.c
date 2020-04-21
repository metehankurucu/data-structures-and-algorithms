
#include <stdio.h>

//Recursive version
int binarySearch(int arr[], int x, int left, int right){
    if(right > 0){
        int mid = left + (right - left) / 2;
        if(arr[mid] == x)
            return mid;
        else if(arr[mid] > x)
            return binarySearch(arr, x, left, mid - 1);
        else
            return binarySearch(arr, x, mid + 1, right);
    }
    return -1;
}

int main() 
{ 


    return 0; 
} 

