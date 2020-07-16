const sortingTest = require("../test/sorting.test");

class CountingSort {
    sort(arr) {
        let min = arr[0], max = arr[0]
        for (const item of arr) {
            if (item < min) min = item
            if (item > max) max = item
        }

        const countLength = max - min + 1

        const count = new Array(countLength).fill(0);

        for (const item of arr) {
            count[item - min]++;
        }

        let itemCount, currentCount;
        for (let i = 0; i < count.length; i) {
            currentCount = 1;
            itemCount = count[i];
            if (itemCount > 0) {

                for (currentCount; currentCount <= itemCount; currentCount++) {
                    arr[i] = i + min;
                }

                i += itemCount;
            } else {
                i++;
            }
        }
        return arr
    }
}

module.exports = CountingSort;