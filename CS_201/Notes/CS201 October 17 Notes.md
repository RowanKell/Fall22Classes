# CS201 October 17 Notes

### Sorting algorithms

#### MergeSort

High level idea: recursion

1. Base case: size 1
   1. return list
2. Recursive case:
   1. MergeSort(first half)
   2. MergeSort(second half);
   3. merge the sorted halves
   4. return sorted