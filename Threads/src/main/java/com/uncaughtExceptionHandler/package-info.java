package com.uncaughtExceptionHandler;

/*

What is setDefaultUncaughtExceptionHandler method?
setDefaultUncaughtExceptionHandler method sets the default handler which is 
called when a thread terminates due to an uncaught unchecked(runtime) exception.


setDefaultUncaughtExceptionHandler method features >
setDefaultUncaughtExceptionHandler method sets the default handler which is called when a 
thread terminates due to an uncaught unchecked(runtime) exception.

setDefaultUncaughtExceptionHandler is a static method method, so we can directly call  
Thread.setDefaultUncaughtExceptionHandler to set the default handler to handle uncaught unchecked(runtime) exception. 
It avoids abrupt termination of thread caused by uncaught runtime exceptions.

       
Defining setDefaultUncaughtExceptionHandler method >
   Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
    public void uncaughtException(Thread thread, Throwable throwable) {
     System.out.println(thread.getName() + " has thrown " + throwable);
    }
   });
*/