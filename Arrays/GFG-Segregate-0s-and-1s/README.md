# GFG - Segregate 0s and 1s

## Problem

Given an array consisting only of 0s and 1s, modify the array in-place so that all 0s appear on the left and all 1s appear on the right.

## Initial Thought

My first idea was to use a bubble-like swapping approach, but I realized it performs unnecessary swaps.

## Optimized Approach

Use the Two Pointer technique.

- Place one pointer at the beginning (`i`) and another at the end (`j`).
- If `arr[i]` is `0`, move `i` forward.
- If `arr[j]` is `1`, move `j` backward.
- Otherwise, swap `arr[i]` and `arr[j]`, then move both pointers.

This rearranges the array in a single traversal.

## Time Complexity

- O(n)

## Space Complexity

- O(1)

## Concepts Learned

- Two Pointers
- In-place Array Modification
- Swapping Elements
