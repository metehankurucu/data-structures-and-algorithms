class MergeSort {
  sort(arr) {
    if (arr.length > 1) {
      const middle = Math.floor(arr.length / 2);
      const leftArr = arr.slice(0, middle);
      const rightArr = arr.slice(middle, arr.length);

      this.sort(leftArr);
      this.sort(rightArr);

      this.merge(arr, leftArr, rightArr);
    }
  }

  merge(arr, leftArr, rightArr) {
    let index = 0,
      leftIndex = 0,
      rightIndex = 0;
    while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
      if (leftArr[leftIndex] <= rightArr[rightIndex])
        arr[index] = leftArr[leftIndex++];
      else arr[index] = rightArr[rightIndex++];
      index++;
    }

    while (leftIndex < leftArr.length) arr[index++] = leftArr[leftIndex++];

    while (rightIndex < rightArr.length) arr[index++] = rightArr[rightIndex++];
  }
}

module.exports = MergeSort;
