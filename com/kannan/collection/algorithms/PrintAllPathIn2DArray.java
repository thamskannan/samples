package com.kannan.collection.algorithms;

/**
 * @author Kannan Dharmalingam
 */
public class PrintAllPathIn2DArray {
    private int rowCount;
    private int colCount;
    private int[][] arrA;

    private PrintAllPathIn2DArray(int arrA[][]) {
        this.arrA = arrA;
        rowCount = arrA.length;
        colCount = arrA[0].length;
    }

    private void printAll(int currentRow, int currentColumn, String path) {
        if (currentRow == rowCount - 1) {
            StringBuilder pathBuilder = new StringBuilder(path);
            for (int i = currentColumn; i < colCount; i++) {
                pathBuilder.append("-").append(arrA[currentRow][i]);
            }
            path = pathBuilder.toString();
            System.out.println(path);
            return;
        }
        if (currentColumn == colCount - 1) {
            StringBuilder pathBuilder = new StringBuilder(path);
            for (int i = currentRow; i <= rowCount - 1; i++) {
                pathBuilder.append("-").append(arrA[i][currentColumn]);
            }
            path = pathBuilder.toString();
            System.out.println(path);
            return;
        }
        path = path + "-" + arrA[currentRow][currentColumn];
        printAll(currentRow + 1, currentColumn, path);
        printAll(currentRow, currentColumn + 1, path);
        //	printAll(currentRow + 1, currentColumn + 1, path);
    }

    public static void main(String args[]) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        PrintAllPathIn2DArray p = new PrintAllPathIn2DArray(a);
        p.printAll(0, 0, "");
    }
}
