package com.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class MyRunnable implements Runnable{
    
    public void run(){
           for(int i=0;i<2;i++){
                  System.out.println("ThreadName="+Thread.currentThread().getName()
                        +" > "+ AtomicIntegerExample.sharedAtomicInteger.incrementAndGet());
           }          
           
    }
}
/**
 * Main class
 */
public class AtomicIntegerExample {
    
    //Create a new AtomicInteger and is initialized to 0.
    static AtomicInteger sharedAtomicInteger =new AtomicInteger();
    
    public static void main(String...args) throws InterruptedException{
           MyRunnable runnable=new MyRunnable();
           Thread thread1=new Thread(runnable,"Thread-1");
           Thread thread2=new Thread(runnable,"Thread-2");
           thread1.start();
           thread2.start();
           
           Thread.sleep(1000); //delay to ensure Thread-1 and Thread-2 finish
           System.out.println("After completion of both threads, "
                        + "sharedAtomicInteger = "+sharedAtomicInteger);
    }
}