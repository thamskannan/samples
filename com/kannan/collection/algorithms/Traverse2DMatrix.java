package com.kannan.collection.algorithms;

public class Traverse2DMatrix {
    public static void main(String[] args) {
        int m = 2, n = 3;
        /*int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i + j;
            }
        }

        System.out.println(a);*/

        //System.out.println(findPossibleMoves(m, n));
        System.out.println(countPossibilities(4));
    }

    public static int countPossibilities(int n) {
        System.out.println(n);
        if (n == 1 || n == 2) {
            return n;
        }
        return countPossibilities(n - 1) + countPossibilities(n - 2);
    }

    private static int findPossibleMoves(int m, int n) {

        System.out.println(m + ", " + n);
        if (m == 1 || n == 1) {
            return 1;
        }

        return findPossibleMoves(m - 1, n) + findPossibleMoves(m, n - 1);
    }
}
