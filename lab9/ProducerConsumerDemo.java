class Buffer {
     int data;
     boolean empty = true;

    public synchronized int get() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        empty = true;
        notifyAll();
        return data;
    }

    public synchronized void put(int data) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        empty = false;
        this.data = data;
        notifyAll();
    }
}

class ProducerConsumerThread extends Thread {
    private Buffer buffer;
    private boolean producer;

    public ProducerConsumerThread(Buffer buffer, boolean producer) {
        this.buffer = buffer;
        this.producer = producer;
    }

    public void run() {
        if (producer) {
            for (int i = 1; i <= 3; i++) {
                buffer.put(i);
                System.out.println("Producer sent: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = 1; i <= 3; i++) {
                int data = buffer.get();
                System.out.println("Consumer received: " + data);
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        ProducerConsumerThread producerThread = new ProducerConsumerThread(buffer, true);
        ProducerConsumerThread consumerThread = new ProducerConsumerThread(buffer, false);

        producerThread.start();
        consumerThread.start();
    }
}
