package com.thread.synchronization;
class MyClass implements Runnable{
  Thread t;
  Message msg;
  String message;
  MyClass(Message msg, String str){ 
    this.msg = msg;
    this.message = str;
    // creating threads, 4 threads will be created 
    // all sharing the same object msg
    t = new Thread(this);
    t.start();
  }
  @Override
  public void run() {
     msg.displayMsg(message);
  }
}
