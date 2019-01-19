package com.Callable.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /*
         * FutureTask implemets RunnableFuture implements Runnable and Callable.
         */
        
        FutureTask<String> futureTask   = new FutureTask<>(new SomeCallableTask());
        
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<?> future                = executorService.submit(futureTask,"Piyush");
        
        
        if(futureTask.isDone()) {
            System.out.println("From FutureTask "+futureTask.get());
            System.out.println("From Future "+future.get());
        }else {
            System.out.println("Future task is not done");
        }
    }
}

class SomeCallableTask implements Callable<String>{

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(10000);
        }catch(Exception e) {
            
        }
        return "Callabel completed";
    }
}
