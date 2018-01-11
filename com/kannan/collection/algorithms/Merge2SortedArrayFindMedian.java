package com.kannan.collection.algorithms;

public class Merge2SortedArrayFindMedian {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6};
        int[] b = {2, 3, 5, 6};

        getMergeWithoutDuplicate(a, b);
    }

    private static void getMergeWithoutDuplicate(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else if (a[i] > b[j]) {
                c[k++] = b[j++];
            } else {
                c[k++] = b[j++];
                i++;
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

        for (int val : c) {
            if (val != 0)
                System.out.print(val + ", ");
        }

        System.out.println();
        int len = c.length;
        if (len % 2 == 0) {
            double d = (double) (c[len / 2] + c[(len / 2) - 1]) / 2;
            System.out.println(d);
        } else {
            System.out.println(c[len / 2]);
        }
    }
}
