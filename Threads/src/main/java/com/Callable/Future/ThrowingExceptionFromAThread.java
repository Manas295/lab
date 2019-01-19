package com.Callable.Future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThrowingExceptionFromAThread {
    public static void main(String[] args) {

        FutureTask<String> callablefutureTask   = new FutureTask<>(new CallableTask());
        FutureTask<String> runnableFutureTaks   = new FutureTask<String>(new RunnableTask(),"Done");
        
        RunnableTask simpleRunnableTask         = new RunnableTask();

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.execute(simpleRunnableTask); //Main method will not knw abt the exception that is thrown by this task
        
        Future<String> future   = executorService.submit(new CallableTask()); // This will return future

        executorService.execute(new RunnableTask()); //This is executing runnable task to pool.

        executorService.execute(runnableFutureTaks); // Here we convert runnable to callable internally

        executorService.execute(callablefutureTask); // We executing callable taks to pool.



        try {
            //System.out.println(runnableFutureTaks.get());
            executorService.shutdown();
            System.out.println("END>......................");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}