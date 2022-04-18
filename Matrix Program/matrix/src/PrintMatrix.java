/**********************************************
 * Workshop 8
 * Course: JAC444 - Semester 4
 * Last Name: Abdi
 * First Name: Tareq
 * ID: 123809196
 * This assignment represents my own work in accordance with Seneca Academic
 * Policy.
 * Signature - TA
 * Date: 02/04/2022
 **********************************************/

public class PrintMatrix extends MatrixUtil {
    private int rows = 2000;
    private int columns = 2000;
    private double[][] mx1 = getMatrix(rows, columns);
    private double[][] mx2 = getMatrix(rows, columns);

    PrintMatrix() {
    }

    // print sequential matrix and time it
    void printSequalMx() {
        int cnt = 0;
        long time = System.currentTimeMillis();
        time = System.currentTimeMillis();

        double[][] d = createSequentialMatrix(mx1, mx2);

        System.out.println(
                "Time taken for Sequential Matrix Addition: " +
                        (System.currentTimeMillis() - time)
                        + "ms");

        System.out.print("Five records from the Sequentially Added Matrix:");
        for (double[] es : d) {
            for (double es2 : es) {
                // show five records from the matrix
                if (cnt == 5) {
                    break;
                } else {
                    System.out.print(" " + (int) es2);
                    cnt++;
                }
            }
            if (cnt == 5) {
                break;
            }
        }
        System.out.println();
    }

    // print parallel matrix using a thread and time it
    void printParallelMxThreads() {
        long time = System.currentTimeMillis();
        time = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int cnt = 0;
                double[][] d = createParallelMatrix(mx1, mx2);
                System.out.print("Five records from the Parallelly Added Matrix:");
                for (double[] es : d) {
                    for (double es2 : es) {
                        // show five records from the matrix
                        if (cnt == 5) {
                            break;
                        } else {
                            System.out.print(" " + (int) es2);
                            cnt++;
                        }
                    }
                    if (cnt == 5) {
                        System.out.println();
                        break;
                    }
                }

            }
        });
        t1.start();

        System.out.println(
                "Time taken for Parallel Matrix Addition with threads: "
                        + (System.currentTimeMillis() - time) + "ms");
    }
}
