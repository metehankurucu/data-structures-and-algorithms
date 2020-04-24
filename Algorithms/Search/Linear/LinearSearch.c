#include <stdio.h>

int linearSearch(int arr[], int x){
    int length = sizeof(arr) / sizeof(arr[0]), i;

    for(i = 0; i < length; i++){
        if(arr[i] == x)
            return i;
    }
    return -1;
}

int main() 
{ 
    return 0; 
} 

