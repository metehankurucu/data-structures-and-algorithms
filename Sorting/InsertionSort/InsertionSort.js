
function insertion_sort(data){
    for(let i = 0; i < data.length; i++){
        let index = i;
        while(index > 0 && data[index] < data[index - 1]){
            let temp = data[index];
            data[index] = data[index - 1];
            data[index - 1] = temp;
            index--;
        }
    }
    return data;
}

//This algorithm works better
function insertionSort(arr){
    for(let i = 1;i < arr.length;i++){
        item = arr[i];
        j = i - 1;
        while(j >= 0 && item < arr[j]){
            arr[j+1] = arr[j];
            j -= 1;
        }
        arr[j+1] = item;
    }
    return arr
}

module.exports = insertionSort;