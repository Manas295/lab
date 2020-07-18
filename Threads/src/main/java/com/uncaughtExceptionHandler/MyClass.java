package com.uncaughtExceptionHandler;
public class MyClass {
       public static void main(String[] args) {
     
      Thread thread1 = new Thread(new MyRunnable(),"thread-1");
     
      /*
       * setDefaultUncaughtExceptionHandler method sets the default handler
       * which is called when a thread terminates due to an
       * uncaught unchecked(runtime) exception.
       *          
       */
      Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
          public void uncaughtException(Thread thread, Throwable throwable) {
            System.out.println(thread.getName() + " has thrown " + throwable);
          }
      });
      
      thread1.start();
       }
}