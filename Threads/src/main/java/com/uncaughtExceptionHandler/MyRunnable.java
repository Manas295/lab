package com.uncaughtExceptionHandler;
class MyRunnable implements Runnable {
    
    String str;
           
           /*
            * method will terminate due to an uncaught unchecked(runtime) exception.
            */
       public void run() {
              /* String wasn't initialized, so performing any operation
            * on it will throw NullPointerException and it will caught by
            * default handler defined in main method.
            */
              str.equals("abc");
       }     
}