# Quicksort
# Select pivot first element of arr


class QuickSort():

    def sort(self, arr, low, high):
        if(low < high):
            j = self.partition(arr, low, high)
            self.sort(arr, low, j-1)
            self.sort(arr, j+1, high)

    def partition(self, arr, low, high):
        pivot = arr[low]
        i = low
        j = high
        while(i < j):
            while(len(arr) - 1 != i and arr[i] <= pivot):
                i += 1
            while(arr[j] > pivot):
                j -= 1

            if(i < j):
                arr[j], arr[i] = arr[i], arr[j]

        arr[j], arr[low] = pivot, arr[j]

        return j
