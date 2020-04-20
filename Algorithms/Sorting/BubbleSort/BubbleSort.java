package BubbleSort;

class BubbleSort {
    void sort(int arr[]) 
    { 
        int i,j,temp;
        int n = arr.length;
        boolean swapped;

        for(i = 0; i < n; i++){
            swapped = false;
            for(j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    } 
  
    public static void main(String args[]) 
    { 
        /* Example Usage
        int arr[] = { 1, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5 ,0 ,7 ,3 ,5 }; 
  
        BubbleSort bubbleSort = new BubbleSort(); 
        
        bubbleSort.sort(arr); 

        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
        */
        
    } 
} 
