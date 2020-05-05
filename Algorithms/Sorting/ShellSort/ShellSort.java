public class ShellSort {

    void sort(int arr[]) {
        int length = arr.length;
        int i, j, temp, gap;

        for (gap = length / 2; gap > 0; gap /= 2) {
            for (i = gap; i < length; i++) {
                temp = arr[i];

                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        /*
         * int arr[] = { 1, 6, 1, 3, 6, 8, 2, 4, 2, 3, 6, 9, 2, 5, 0, 7, 3, 5 };
         * 
         * ShellSort shellSort = new ShellSort();
         * 
         * shellSort.sort(arr);
         * 
         * for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
         */
    }
}