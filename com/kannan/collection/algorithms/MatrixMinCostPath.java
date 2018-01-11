package com.kannan.collection.algorithms;

/**
 * @author Kannan Dharmalingam
 */
public class MatrixMinCostPath {

    private static int find(int[][] arr) {
        int[][] solution = new int[arr.length][arr.length];

        solution[0][0] = arr[0][0];
        // fill the first row
        for (int i = 1; i < arr.length; i++) {
            solution[0][i] = arr[0][i] + solution[0][i - 1];
        }

        // fill the first column
        for (int i = 1; i < arr.length; i++) {
            solution[i][0] = arr[i][0] + solution[i - 1][0];
        }

        // path will be either from top or left, choose which ever is minimum
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                solution[i][j] = arr[i][j]
                        + Math.min(solution[i - 1][j], solution[i][j - 1]);
            }
        }
        return solution[arr.length - 1][arr.length - 1];
    }

    public static void main(String[] args) {
        /*int[][] arr = {
                {1, 7, 9, 2},
                {8, 6, 3, 2},
                {1, 6, 7, 8},
                {2, 9, 8, 2}
        };*/

        int[][] arr = {
                {1, 2, 1},
                {3, 1, 0},
                {2, 4, 1}
        };
        System.out.println("Minimum Cost Path " + find(arr));
    }
}
