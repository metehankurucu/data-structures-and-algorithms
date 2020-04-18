package InsertionSort;

class InsertionSort {
    void sort(int arr[]) 
    { 
        int n = arr.length;
        int item, j;
        for (int i = 1; i < n; i++) { 
            item = arr[i]; 
            j = i - 1; 

            while (j >= 0 && arr[j] > item) { 
                arr[j+1] = arr[j]; 
                j -= 1; 
            } 
            arr[j+1] = item; 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        /* Example Usage
        int arr[] = { 1, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5 ,0 ,7 ,3 ,5 }; 
  
        InsertionSort insertionSort = new InsertionSort(); 
        
        insertionSort.sort(arr); 

        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
  
        */
    } 
} 