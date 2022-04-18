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

public class ReverseThread extends Thread {
    private int counter = 0;

    // one arg constructor
    public ReverseThread(int counter) {
        super("Thread " + counter);
        this.counter = counter;
    }

    // overloading the run function
    public void run() {
        counter++;

        if (counter <= 51) {
            ReverseThread thread = new ReverseThread(counter);
            thread.start();

            try {
                thread.join();
                System.out.println("Hello from " + getName());
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    }
}
