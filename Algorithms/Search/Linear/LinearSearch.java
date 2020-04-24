
public class LinearSearch {
    public static int search(int[] arr, int x){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
}