package com.blockingqueue.customImpl;

import java.util.LinkedList;
import java.util.List;

class LinkedBlockingQueueCustom<E> implements BlockingQueueCustom<E>{
 
      private List<E> queue;
      private int  maxSize ; //maximum number of elements queue can hold at a time.
 
      public LinkedBlockingQueueCustom(int maxSize){
           this.maxSize = maxSize;
           queue = new LinkedList<E>();
      }
 
 
      /**
       * Inserts the specified element into this queue
       * only if space is available else
       * waits for space to become available.
       * After inserting element it notifies all waiting threads.
       */
      public synchronized void put(E item)  throws InterruptedException  {
         
            //check space is available or not.
               if (queue.size() == maxSize) {
           this.wait();
               }
               
               //space is available, insert element and notify all waiting threads.
           queue.add(item);
           this.notifyAll();
      }
 
 
      /**
       * Retrieves and removes the head of this queue
       * only if elements are available else
       * waits for element to become available.
       * After removing element it notifies all waiting threads.
       */
      public synchronized E take()  throws InterruptedException{
 
          //waits element is available or not.
              if (queue.size() == 0) {
                  this.wait();
              }
 
              //element is available, remove element and notify all waiting threads.
              this.notifyAll();
        return queue.remove(0);
           
      }
 
}