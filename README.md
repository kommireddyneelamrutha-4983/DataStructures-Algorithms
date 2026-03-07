# Data Structures and Algorithms – Arrays Practice 🚀

This repository contains my implementations of fundamental **Array algorithms** in Java.
These problems help in understanding **array manipulation, prefix sum techniques, and Kadane’s algorithm**.


Arrays
│
├── Basic Array Operations
│   ├── Maximum Element in Array
│   ├── Count Frequency of a Number
│   ├── Insert at Beginning
│   ├── Insert at Position
│   ├── Insert in Sorted Array
│   ├── Delete at Position
│   ├── Delete by Value
│   └── Delete All Occurrences
│
├── Prefix Sum
│   ├── Range Sum Query
│   ├── Subarray Sum Equals K
│   └── Pivot Index
│
└── Kadane's Algorithm
    └── Maximum Subarray Sum

#  Basic Array Operations

These programs cover fundamental array manipulation techniques.

#Maximum Element in Array

Finds the largest element present in the array.

Time Complexity: O(n)
Space Complexity: O(1)
# Count Frequency of a Number

Counts how many times a specific number appears in the array.

Time Complexity:O(n)
Space Complexity: O(1)

#Insert at Beginning

Inserts an element at the start of the array by shifting all elements to the right.

Time Complexity:O(n)

# Insert at Position

Inserts an element at a given index by shifting elements.

Time Complexity:O(n)

#Insert in Sorted Array

Inserts an element in the correct position while maintaining sorted order.

Time Complexity:O(n)

#Delete at Position

Deletes an element from a specific index by shifting elements left.

Time Complexity: O(n)

#Delete by Value

Finds a value in the array and removes it.

Time Complexity:O(n)

# Delete All Occurrences

Removes all occurrences of a specific element.

Time Complexity: O(n)

##Prefix Sum Problems

Prefix sum is an important technique used to answer range queries efficiently.

#Range Sum Query

Calculates the sum of elements between two indices using prefix sum.

Formula:
sum(L, R) = prefix[R] - prefix[L-1]

Time Complexity:

* Prefix Creation → O(n)
* Query → O(1)

#Subarray Sum Equals K

Counts the number of subarrays whose sum equals **K** using **Prefix Sum + HashMap**.

Time Complexity: O(n)
Space Complexity: O(n)

#Pivot Index

Finds the index where the sum of elements on the left equals the sum of elements on the right.

Time Complexity: O(n)
Space Complexity: O(1)

##Kadane's Algorithm

#Maximum Subarray Sum

Kadane's algorithm finds the **maximum possible sum of a contiguous subarray**.

Example:
Input:  [2, -1, -2, 3, 5]
Output: 8

Time Complexity: O(n)
Space Complexity:O(1)


# Concepts Covered

* Array Traversal
* Element Insertion
* Element Deletion
* Prefix Sum Technique
* HashMap Optimization
* Kadane's Algorithm
* Time and Space Complexity Analysis

# Goal

The goal of this repository is to build strong foundations in **Data Structures and Algorithms.

