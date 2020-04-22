
public class MinHeap {
    int size;
    int capacity;
    int[] heap;

    public MinHeap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    //Returns index of parent of given index
    public int parent(int index){
        return (index - 1) / 2;
    }

    //Returns index of right child of given index
    public int rightChild(int index){
        return 2 * index + 2;
    }

    //Returns index of left child of given index
    public int leftChild(int index){
        return 2 * index + 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void swap(int index1, int index2){
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    public void insert(int item){
        if(isFull()) throw new IndexOutOfBoundsException("Heap is full");
        //Add end of heap
        heap[size] = item;
        size++;
        //Then heapify that branch to up
        siftUp(size - 1);
    }

    public int extractMin(){
        if(size == 0) throw new IllegalStateException();
        int item = heap[0];
        //Last item to root
        heap[0] = heap[size - 1];
        size--;
        //Then heapify root to down
        siftDown(0);
        return item;
    }

    public int getMin(){
        if(size == 0) throw new IllegalStateException();
        return heap[0];
    }

    public void siftUp(int index){
        //change items who violate the heap upwards from the given index
        while(index > 0 && heap[parent(index)] > heap[index]){
           swap(parent(index),index);
           index = parent(index); 
        }
    }

    public void siftDown(int index){
        int smallest = index;
        int left = leftChild(index);
        //if left child exist and left child smaller than its parent
        if(left <= size - 1 && heap[left] < heap[smallest])
            smallest = left;
        int right = rightChild(index);
        //if right child exist and right child smaller than its parent or left child
        if(right <= size - 1 && heap[right] < heap[smallest])
            smallest = right;
        //If smallest one left or right child, swap and siftDown with smallest one
        if(index != smallest){
            swap(index, smallest);
            siftDown(smallest);
        }
    }

    //For see heap
    public void print(){
        System.out.println("\nMinHeap: with size " + size);
        for (int i = 0; i < heap.length; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(32);

        heap.insert(2);
        heap.insert(1);
        heap.insert(4);
        heap.print();
        heap.insert(-1);
        heap.insert(-2);
        heap.print();
        heap.extractMin();
        heap.extractMin();
        heap.extractMin();
        heap.print();
    }

}