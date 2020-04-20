
function bubbleSort(array){
    let swapped;
    for (let i = 0; i < array.length; i += 1) {
      swapped = false;
      
      for (let j = 0; j < array.length - i - 1; j += 1) {
        if (array[j + 1] < array[j]) {
          //Swap items with array destruction
          [array[j], array[j + 1]] = [array[j + 1], array[j]];
          swapped = true;
        }
      }
      if (!swapped) 
        return array;
    }
    return array;
}

module.exports = bubbleSort;