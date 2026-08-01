# Remove Duplicates from Sorted Array (LeetCode 26)

## Problem Statement
Given a sorted integer array `nums`, remove the duplicates **in-place** such that each unique element appears only once.

Return the number of unique elements (`k`). The first `k` elements of the array should contain the unique elements.

---

## Approach (Two Pointers)

This problem is solved using the **Two Pointer** technique.

- `i` points to the last unique element.
- `j` traverses the array.
- If the current element is a duplicate, move `j` forward.
- Otherwise, place the unique element at `i + 1`, increment `i`, and continue.

Since we modify the same array without creating another array, the solution is **in-place**.

---

## Dry Run

Input:
```
nums = [1,1,2,2,3]
```

| i | j | Action | Array |
|---|---|--------|-------|
|0|1|Duplicate, move `j`|[1,1,2,2,3]|
|0|2|Unique → `nums[1]=2`|[1,2,2,2,3]|
|1|3|Duplicate, move `j`|[1,2,2,2,3]|
|1|4|Unique → `nums[2]=3`|[1,2,3,2,3]|

Unique elements = **3**

Output:
```
[1,2,3]
```

---

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)` (In-place)

## Key Takeaways

- Uses the **Two Pointer** technique.
- Solves the problem **in-place**.
- Maintains the sorted order of unique elements.
- Runs in linear time with constant extra space.
