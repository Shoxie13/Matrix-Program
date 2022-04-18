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

public class App extends PrintMatrix {
    public static void main(String[] args) throws Exception {
        // PrintMatrix mx = new PrintMatrix();s
        // mx.printSequalMx();
        // System.out.println();
        // mx.printParallelMxThreads();

        ReverseThread th1 = new ReverseThread(1);
        th1.start();
        th1.join();
    }
}
