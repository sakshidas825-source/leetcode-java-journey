# 167. Two Sum II - Input Array Is Sorted

## 🔗 Problem
LeetCode 167 - Two Sum II (Input Array Is Sorted)

**Difficulty:** Medium

---

## 💡 Intuition

Since the array is already sorted, we don't need to check every possible pair.

Instead, we place:
- One pointer at the beginning.
- One pointer at the end.

Depending on the sum, we move only one pointer:
- If the sum is too small, move the left pointer.
- If the sum is too large, move the right pointer.
- If the sum equals the target, return the indices.

---

## 🚀 Approach

1. Initialize two pointers:
   - `i = 0`
   - `j = numbers.length - 1`

2. While `i < j`:
   - Calculate `sum = numbers[i] + numbers[j]`
   - If `sum == target`, return the required indices.
   - If `sum < target`, increment `i`.
   - Otherwise, decrement `j`.

---

## 🧪 Dry Run

```text
numbers = [2, 7, 11, 15]
target = 9

2 + 15 = 17 > 9 → move j

2 + 11 = 13 > 9 → move j

2 + 7 = 9 ✅ Found
```

---

## ⏱️ Complexity

**Time:** `O(n)`

**Space:** `O(1)`

---

## 📚 Key Learnings

- Two Pointer works because the array is sorted.
- Java arrays are 0-indexed, but this problem expects 1-indexed output.
- `return i, j;` is invalid in Java.
- Returning an `int[]` requires `return new int[]{...};`.

---

## 💻 Solution

See `Solution.java`.
