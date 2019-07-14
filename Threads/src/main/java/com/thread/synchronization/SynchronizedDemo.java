package com.thread.synchronization;
public class SynchronizedDemo {
  public static void main(String[] args) {
    Message msg = new Message();
    MyClass mc1 = new MyClass(msg, "I");
    MyClass mc2 = new MyClass(msg, "am");
    MyClass mc3 = new MyClass(msg, "not");
    MyClass mc4 = new MyClass(msg, "synchronized");
  }
}