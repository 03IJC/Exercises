# Description
Multiple different sorting algorithms


# SelectionSort
This sorting algorithm conceptually breaks an array into 2 parts, a sorted part and an unsorted part. 
To the left of the current element is sorted; the current element and what is to the right of it is unsorted.
Selection sort sorts by looking for the minimum (or maximum) in the unsorted part of the array then it swaps it with current element.
This algorithm has a Big-Oh of O(n^2) in all cases.

# InsertionSort
This sorting algorithm also conceptually breaks an array into 2 parts, a sorted part and an unsorted part.
To the left of the current element is sorted; the current element and what is to the right of it is unsorted.
Insertion sort sorts by comparing the current element with each element of the sorted part until it finds its place.
The ones larger (or smaller) are moved one space to its right and the element is placed in the correct spot of the sorted array.
This algorithm has a Big-Oh of O(n^2) in its worst case and O(n) in its best case