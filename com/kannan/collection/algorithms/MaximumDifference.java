package com.kannan.collection.algorithms;

/**
 * @author Kannan Dharmalingam
 */
public class MaximumDifference {
    // Driver program to test above functions
    public static void main(String[] args) {
        //int arr[] = {80, 2, 6, 3, 100}; //Output: 98
        int arr[] = {2, 3, 10, 6, 4, 8, 1}; //Output: 8
        //int arr[] = { 7, 9, 5, 6, 3, 2}; //Output: 2

        System.out.println(maxDiff(arr));
    }

    private static int maxDiff(int arr[]) {
        // Initialize diff, current sum and max sum
        int size = arr.length;
        int diff = arr[1] - arr[0];
        int curr_sum = diff;
        int max_sum = curr_sum;

        for (int i = 1; i < size - 1; i++) {
            // Calculate current diff
            diff = arr[i + 1] - arr[i];

            // Calculate current sum
            if (curr_sum > 0)
                curr_sum += diff;
            else
                curr_sum = diff;

            // Update max sum, if needed
            if (curr_sum > max_sum)
                max_sum = curr_sum;
        }

        return max_sum;
    }
}
