
function selectionSort(arr){
    let min, temp;
    const length = arr.length;
    for(let i = 0; i < length - 1; i++){
        min = i;
        for(let j = i + 1; j < length; j++){
            if(arr[j] < arr[min])
                min = j;
        }

        if(min != i){
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    return arr
}

module.exports = selectionSort;
