# 977. Squares of a Sorted Array

## Problem
Given an integer array sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

## Approach

### Initial Thought
- Square every element.
- Sort the array again.
- Time Complexity: O(n log n)

### Optimized Approach
Use the Two Pointer technique.

- Place one pointer at the beginning.
- Place another pointer at the end.
- Compare absolute values.
- Insert the larger square at the end of the answer array.
- Move the corresponding pointer.
- Continue until both pointers meet.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Concepts Learned
- Two Pointers
- Absolute Value Comparison
- Sorted Arrays
