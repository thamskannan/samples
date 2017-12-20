package com.kannan.collection.algorithms;

/**
 * This is utility class for operations on rotated one-d array.
 * <p>
 * Note: a sorted array, reverse-sorted or a single element is array is not considered rotated sorted.
 * Eg:
 * [4, 5, 1, 2, 3] is considered rotated.
 * While.
 * [1, 2, 3, 4, 5] is not considered rotated
 * <p>
 * <p>
 * Complexity: O (log n)
 *
 * @author Kannan Dharmalingam
 */
public class SearchRotatedSortedArray {
    /**
     * Searches for the value provided in the rotated sorted array.
     * If found, returns the index, of provided array, else returns -1.
     * If array is not rotated and sorted, then results are unpredictable
     * <p>
     * Throws an exception if array is null.
     *
     * @param arr   the rotated sorted array
     * @param value the element to be searched
     * @return the index at which the element is found, else returns -1
     */
    private static int binarySearchForRotatedArray(int[] arr, int value) {
        int partitionIndex = findPartition(arr);

        if (partitionIndex == -1) return -1;

        if (value >= arr[0] && value <= arr[partitionIndex]) {
            return binarySearch(arr, 0, partitionIndex, value);
        } else {
            return binarySearch(arr, partitionIndex + 1, arr.length - 1, value);
        }
    }

    private static int binarySearch(int[] arr, int lowerBound, int higherBound, int value) {
        assert arr != null;

        while (lowerBound <= higherBound) {
            int mid = (lowerBound + higherBound) / 2;
            int midValue = arr[mid];
            if (midValue < value) {
                lowerBound = mid + 1;
            } else if (midValue > value) {
                higherBound = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Returns the index of greatest element of the rotated sorted array.
     * if array is not rotated sorted, results are unpredictable
     *
     * @param arr the input array
     * @return the index of the highest element in the array.
     */
    private static int findPartition(int[] arr) {
        assert arr != null;

        int lb = 0;
        int hb = arr.length - 1;

        // Check if rotation is 0
        if (arr[lb] < arr[hb])
            return hb;

        while (lb != hb) {
            int mid = (lb + hb) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[hb]) {
                // go right.
                lb = mid + 1;
            } else {
                // go left.
                hb = mid; // note i cannot do mid - 1
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // even length of the array.
        int[] a1 = {6, 7, 8, 1, 2, 3};
        int actual = binarySearchForRotatedArray(a1, -1);
        assertTest(-1, actual);
        int[] a2 = {6, 7, 8, 1, 2, 3};
        actual = binarySearchForRotatedArray(a2, 7);
        assertTest(1, actual);
        int[] a3 = {6, 7, 8, 1, 2, 3};
        actual = binarySearchForRotatedArray(a3, 3);
        assertTest(5, actual);
        int[] a4 = {6, 7, 8, 1, 2, 3};
        actual = binarySearchForRotatedArray(a4, 8);
        assertTest(2, actual);
        int[] a5 = {6, 7, 8, 1, 2, 3};
        actual = binarySearchForRotatedArray(a5, 1);
        assertTest(3, actual);

        // odd length of the array.
        int[] a6 = {4, 6, 7, 8, 1, 2, 3};
        actual = binarySearchForRotatedArray(a6, -1);
        assertTest(-1, actual);
        int[] a7 = {4, 6, 7, 8, 1, 2, 3};
        actual = binarySearchForRotatedArray(a7, 7);
        assertTest(2, actual);
        int[] a8 = {4, 6, 7, 8, 1, 2, 3};
        actual = binarySearchForRotatedArray(a8, 3);
        assertTest(6, actual);
        int[] a9 = {4, 6, 7, 8, 1, 2, 3};
        actual = binarySearchForRotatedArray(a9, 8);
        assertTest(3, actual);
        int[] a10 = {4, 6, 7, 8, 1, 2, 3};
        actual = binarySearchForRotatedArray(a10, 1);
        assertTest(4, actual);

        // properly sorted
        int[] a11 = {1, 2, 3, 4, 5, 6, 7};
        actual = binarySearchForRotatedArray(a11, 0);
        assertTest(-1, actual);
        actual = binarySearchForRotatedArray(a11, 1);
        assertTest(0, actual);
        actual = binarySearchForRotatedArray(a11, 2);
        assertTest(1, actual);
        actual = binarySearchForRotatedArray(a11, 3);
        assertTest(2, actual);
        actual = binarySearchForRotatedArray(a11, 4);
        assertTest(3, actual);
        actual = binarySearchForRotatedArray(a11, 5);
        assertTest(4, actual);
        actual = binarySearchForRotatedArray(a11, 6);
        assertTest(5, actual);
        actual = binarySearchForRotatedArray(a11, 7);
        assertTest(6, actual);
        actual = binarySearchForRotatedArray(a11, 8);
        assertTest(-1, actual);

    }

    private static void assertTest(int expected, int actual) {
        if (expected != actual) System.out.println("Expected " + expected + " , Actual : " + actual);
    }
}
