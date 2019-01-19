package com.Callable.Future;

public class RunnableTask implements Runnable {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        throw new RuntimeException("Runnable task ecception");
    }
}
