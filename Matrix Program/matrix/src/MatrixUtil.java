
/**********************************************
Workshop 8
Course: JAC444 - Semester 4
Last Name: Abdi
First Name: Tareq
ID: 123809196
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature - TA
Date: 02/04/2022
**********************************************/

import java.util.stream.IntStream;

public class MatrixUtil {

    // parallel matrix addition using streams
    private static double[][] parallelAddMatrix(double[][] a, double[][] b) {
        return IntStream.range(0, a.length).parallel()
                .mapToObj(i -> IntStream.range(0, b[i].length)
                        .mapToDouble(j -> a[i][j] + b[i][j])
                        .toArray())
                .toArray(double[][]::new);
    }

    // sequential matrix addition using streams
    private static double[][] sequentialAddMatrix(double[][] c, double[][] d) {
        return IntStream.range(0, c.length)
                .mapToObj(i -> IntStream.range(0, d[i].length)
                        .mapToDouble(j -> c[i][j] + d[i][j])
                        .toArray())
                .toArray(double[][]::new);
    }

    // generating a matrix with randomized numbers using streams
    private double[][] generateMatrix(int rows, int columns) {
        return IntStream.range(0, rows)
                .mapToObj(i -> IntStream.range(0, columns)
                        .mapToDouble(j -> Math.random() * 100)
                        .toArray())
                .toArray(double[][]::new);
    }

    //
    double[][] getMatrix(int rows, int columns) {
        return generateMatrix(rows, columns);
    }

    //
    double[][] createParallelMatrix(double[][] a, double[][] b) {
        return parallelAddMatrix(a, b);
    }

    //
    double[][] createSequentialMatrix(double[][] c, double[][] d) {
        return sequentialAddMatrix(c, d);
    }
}
