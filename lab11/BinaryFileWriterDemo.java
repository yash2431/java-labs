import java.io.FileOutputStream;
import java.io.IOException;

class BinaryFileWriter extends Thread {
    private final int start;
    private final int end;
    private final byte[] data;

    public BinaryFileWriter(byte[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try (FileOutputStream fos = new FileOutputStream("output.bin", true)) {
            fos.write(data, start, end - start);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class BinaryFileWriterDemo {
    public static void main(String[] args) {
        byte[] data = generateData(1000); // Generating some sample data

        // Creating multiple threads for writing to file
        int numThreads = 5;
        Thread[] threads = new Thread[numThreads];

        // Each thread writes a portion of data to the file
        int blockSize = data.length / numThreads;
        int remainingBytes = data.length % numThreads;

        int start = 0;
        int end;
        for (int i = 0; i < numThreads; i++) {
            end = start + blockSize + (i < remainingBytes ? 1 : 0);
            threads[i] = new BinaryFileWriter(data, start, end);
            start = end;
        }

        // Start all threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Demonstrate join(), yield(), and interrupt() on one of the threads
        try {
            Thread.sleep(1000); // Let threads start writing

            // Demonstrate join()
            System.out.println("Waiting for threads to finish...");
            for (Thread thread : threads) {
                thread.join(); // Wait for each thread to finish
            }
            System.out.println("All threads finished writing.");

            // Demonstrate yield() and interrupt()
            Thread t = threads[0];
            t.yield(); // Yield the CPU to another thread
            System.out.println("Yielded the CPU to another thread.");

            Thread.sleep(1000); // Let the thread run for a while

            t.interrupt(); // Interrupt the thread
            System.out.println("Interrupted the thread.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }

    // Helper method to generate some sample data
    private static byte[] generateData(int size) {
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) {
            data[i] = (byte) (i % 256); // Filling with some dummy data
        }
        return data;
    }
}
