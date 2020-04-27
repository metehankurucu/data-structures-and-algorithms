
class SelectionSort {
    void sort(int arr[]) 
    { 
        int n = arr.length;
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
  
    public static void main(String args[]) 
    { 
        /* Example Usage
        int arr[] = { 1, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5 ,0 ,7 ,3 ,5 }; 
  
        SelectionSort selectionSort = new SelectionSort(); 
        
        selectionSort.sort(arr); 

        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
  
        */
    } 
} 