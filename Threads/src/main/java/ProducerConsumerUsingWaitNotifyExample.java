import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final int capacity;
    private final Queue<Integer> queue = new LinkedList<>();

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(item);
        System.out.println("Produced: " + item);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int item = queue.poll();
        System.out.println("Consumed: " + item);
        notifyAll();
        return item;
    }
}

class MyProducer implements Runnable {
    private final Buffer buffer;

    public MyProducer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyConsumer implements Runnable {
    private final Buffer buffer;

    public MyConsumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerUsingWaitNotifyExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(1);
        Thread producerThread = new Thread(new MyProducer(buffer));
        Thread consumerThread = new Thread(new MyConsumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
