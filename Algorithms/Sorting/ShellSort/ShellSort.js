function shellSort(arr) {
  let temp, i, j, gap;
  const length = arr.length;

  for (gap = Math.floor(length / 2); gap > 0; gap = Math.floor(gap / 2)) {
    for (i = gap; i < length; i++) {
      temp = arr[i];

      for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
        arr[j] = arr[j - gap];

      arr[j] = temp;
    }
  }
}

module.exports = shellSort;
