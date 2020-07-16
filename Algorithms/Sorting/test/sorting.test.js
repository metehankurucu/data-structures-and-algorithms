module.exports = (sortingFunction, number = 10000, maxNumber = 1000) => {

    const arr = [];

    for (let i = 0; i < number; i++) {
        arr.push(Math.floor(Math.random() * maxNumber))
    }

    const customSorted = sortingFunction(arr) || [...arr];

    const sorted = arr.sort((a, b) => {
        if (a < b) return -1
        else 1;
    });

    for (let j = 0; j < sorted.length; j++) {
        if (sorted[j] !== customSorted[j]) {
            console.error('Test Result: Failed ❌')
            console.warn({ yourSorting: customSorted, expectedSorting: sorted, number: customSorted[j], expectedNumber: sorted[j] })
            return false;
        }
    }

    console.log('Test Result: Success ✅')
    return true;
}