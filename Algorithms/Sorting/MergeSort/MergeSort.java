public class MergeSort {

    void sort(int arr[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    private void merge(int arr[], int left, int middle, int right) {
        int leftArrLength = middle - left + 1;
        int rightArrLength = right - middle;

        int[] leftArr = new int[leftArrLength];
        for (int i = 0; i < leftArrLength; i++)
            leftArr[i] = arr[i + left];

        int[] rightArr = new int[rightArrLength];
        for (int j = 0; j < rightArrLength; j++)
            rightArr[j] = arr[middle + j + 1];

        int leftArrIndex = 0, rightArrIndex = 0;
        int index = left;

        while (leftArrIndex < leftArrLength && rightArrIndex < rightArrLength) {
            if (leftArr[leftArrIndex] <= rightArr[rightArrIndex])
                arr[index] = leftArr[leftArrIndex++];
            else
                arr[index] = rightArr[rightArrIndex++];
            index++;
        }

        while (leftArrIndex < leftArrLength)
            arr[index++] = leftArr[leftArrIndex++];

        while (rightArrIndex < rightArrLength)
            arr[index++] = rightArr[rightArrIndex++];
    }

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 20, 19, 18, 16, 11, 15, 12, 14, 13, 17, 10, 2, 3, 8, 4, 6, 1, 0, 7, 3, 9, 4, 8, 10, 2, 3, 8, 4, 6,
                1, 0, 7, 3, 9, 4, 8, 10, 2, 3, 8, 4, 6, 1, 0, 7, 3, 9, 4, 8, 10, 2, 3, 8, 4, 6, 1, 0, 7, 3, 9, 4, 8 };

        MergeSort mergeSort = new MergeSort();

        mergeSort.sort(arr, 0, arr.length - 1);
        mergeSort.print(arr);
    }
}