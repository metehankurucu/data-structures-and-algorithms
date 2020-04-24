
class TernarySearch {
    public int search(int[] arr, int x, int left, int right){
        if(right > 0){
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;
    
            if(arr[mid1] == x)
                return mid1;
            if(arr[mid2] == x)
                return mid2;
    
          if(x < arr[mid1])
                return search(arr, x, left, mid1 - 1);
            else if(x > arr[mid2])
                return search(arr, x, mid2 + 1, right);
            else
                return search(arr, x, mid1 + 1, mid2 - 1);
        }
        return -1;
    }
  
} 
