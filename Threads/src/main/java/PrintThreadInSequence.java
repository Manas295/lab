import java.util.concurrent.Semaphore;

public class PrintThreadInSequence {


    private static final Object lock = new Object();
	Semaphore semaphore=new Semaphore(1); 


    private static boolean printNumber = true;


    public static void main(String[] args) {

        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) { // Adjust the range as needed
                synchronized (lock) {
                    while (!printNumber) {
                        try {
                            lock.wait(); // Wait if it's not this thread's turn
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(i + " ");
                    printNumber = false; // Signal the other thread to print letters
                    lock.notify(); // Notify the other thread
                }
            }
        });

        Thread letterThread = new Thread(() -> {
            for (char ch = 'A'; ch < 'A' + 10; ch++) { // Adjust the range as needed
                synchronized (lock) {
                    while (printNumber) {
                        try {
                            lock.wait(); // Wait if it's not this thread's turn
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(ch + " ");
                    printNumber = true; // Signal the other thread to print numbers
                    lock.notify(); // Notify the other thread
                }
            }
        });

        // Start both threads

        numberThread.start();

        letterThread.start();

    }

}