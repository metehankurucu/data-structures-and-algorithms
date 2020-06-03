/**
 * Pivot selected first element
 */
class QuickSort {
  sort(arr) {
    this.sortRecursive(arr, 0, arr.length - 1);
  }

  sortRecursive(arr, low, high) {
    if (low < high) {
      const pivotPosition = this.partition(arr, low, high);
      this.sortRecursive(arr, low, pivotPosition - 1);
      this.sortRecursive(arr, pivotPosition + 1, high);
    }
  }

  partition(arr, low, high) {
    let i = low,
      j = high;
    const pivot = arr[low];

    while (i < j) {
      while (arr.length - 1 != i && arr[i] <= pivot) i++;
      while (arr[j] > pivot) j--;

      if (i < j) [arr[i], arr[j]] = [arr[j], arr[i]];
    }
    [arr[j], arr[low]] = [arr[low], arr[j]];
    return j;
  }
}
