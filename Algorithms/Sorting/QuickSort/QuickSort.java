/**
 * Pivot selected from middle
 */
class QuickSort {
    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int arr[], int low, int high) {

        int pivot = arr[(low + high) / 2];

        int i = low;
        int j = high;

        while (i <= j) {
            while (arr[i] < pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    public void sort(int arr[], int low, int high) {
        if (low < high) {
            int i = partition(arr, low, high);

            sort(arr, low, i - 1);
            sort(arr, i, high);
        }

    }

    public static void main(String[] args) {
        // * Example Usage
        int arr[] = { 50, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5, 0, 7, 3, 5, 1 };

        QuickSort quickSort = new QuickSort();

        quickSort.sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}