/**
 * Min heap sort
 */
public class HeapSort {

    public void sort(int[] arr){
        //MinHeap in ../../../DataStructures/Heap/MinHeap.java
        MinHeap heap = new MinHeap(arr.length);
        //Insert all items to heap
        for (int i = 0; i < arr.length; i++)
            heap.insert(arr[i]);
        
        int index = 0;
        while(!heap.isEmpty()){
            //Extract smallest item in heap and move to next index of array
            arr[index++] = heap.extractMin();
        }
    }

    public static void main(String[] args) {
        //Example
        int[] arr = { 10, 2, 3, 8, 4, 6, 1, 0, 7, 3, 9, 4, 8 };

        HeapSort heapSort = new HeapSort();

        heapSort.sort(arr);

        //Sorted
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}