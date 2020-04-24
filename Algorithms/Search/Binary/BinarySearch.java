
class BinarySearch {
    //Iterative version
    int search(int arr[], int x){
        int left = 0, mid;
        int right = arr.length - 1;

        while(right >= left){
            mid = (left + right) / 2;

            if(arr[mid] == x)
                return mid;
            else if(arr[mid] > x)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
  
} 
