# Valid Palindrome

## Problem
Check whether a given string is a palindrome after converting uppercase letters to lowercase and removing non-alphanumeric characters.

## Approach
1. Convert the string to lowercase.
2. Remove all non-alphanumeric characters.
3. Use two pointers from both ends.
4. If characters don't match, return `false`.
5. If all characters match, return `true`.

## Complexity
- Time: O(n)
- Space: O(n)

## Concepts Learned
- String methods in Java
- `length()`
- `charAt()`
- Two-pointer technique
- Regular expressions with `replaceAll()`
