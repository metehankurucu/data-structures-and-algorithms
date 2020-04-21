
//Iterative 
function binarySearch(arr, x){
    let left = 0, mid;
    let right = arr.length - 1;

    while(right >= left){
        //mid index
        mid = Math.floor((left + right) / 2);
        if(arr[mid] == x)
            return mid;
        else if(arr[mid] > x)
            right = mid - 1;
        else
            left = mid + 1;
    }
    return -1;
}
