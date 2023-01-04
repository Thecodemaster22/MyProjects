import java.util.Scanner;
import java.util.Random;
class squareMatrix {//make a class
    private int[][] matrix;
    public squareMatrix(int rows, int columns) {//display the rows and columns
        if (rows > 0 && columns > 0) {
            Random rand = new Random();
            matrix = new int[rows][columns];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = rand.nextInt(21);
                }
            }
        }else{
            System.out.println("Use positive Values");
        }
    }
    public void displaySquareMatrix(){//display square Matrix
        String dim2Array = "{";
        for (int i = 0; i < matrix.length; i++) {
           String row = "{";
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == (matrix[i].length - 1)) {
                    if (i == (matrix.length - 1)) {
                        row += matrix[i][j] + "}";
                    } else {
                        row += matrix[i][j] + "}, ";
                    }
                } else {
                    row += matrix[i][j] + ", ";
                       }
            }
            dim2Array += row;
        }
        System.out.println(dim2Array + "}");
    }
    public int[] getGreatestSumRow() {
        int greatestSum = matrix[0][0];
        int currentGreatestRow = 0;
        int currentRowSum;
        for (int i = 0; i < matrix.length; i++) {
            currentRowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                currentRowSum += matrix[i][j];
            }
           if (currentRowSum > greatestSum) {
                greatestSum = currentRowSum;
                currentGreatestRow = i;
            }
        }
          // display1DArray(matrix[currentGreatestRow]);
        return matrix[currentGreatestRow];
    }
    public int[] getLeastSumColumn() {
        // Sum all column values - add to a 1D array
        int[] columnSums = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                columnSums[j] += matrix[i][j];
            }
        }

        // determine which columns sum is the smallest
          int leastSum = columnSums[0];
        int leastSumColumn = 0;
        for (int i = 0; i < columnSums.length; i++) {
            if (columnSums[i] < leastSum) {
                leastSum = columnSums[i];
                leastSumColumn = i;
            }
        }
        // get the column values in a 1d array
        // number of column values = num rows
        int[] columnArray = new int[matrix.length];
         for (int rows = 0; rows < matrix.length; rows++) {
            columnArray[rows] = matrix[rows][leastSumColumn];}
        return columnArray;}}
