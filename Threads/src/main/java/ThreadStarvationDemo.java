/*Output can be seen that Thread-0 has to invoke displayValues() method only once but that invocation 
 * is delayed by the threads of maximum priority.
*/
public class ThreadStarvationDemo {
	synchronized void displayValues(){
        System.out.println("In ThreadStarveDemo For thread " + 
             Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("For thread " + Thread.currentThread().getName());
        for(int i = 0; i < 3; i++){
            System.out.println("Value of i " + i);
        }        
    }
	 public static void main(String[] args) {
		 ThreadStarvationDemo td1 = new ThreadStarvationDemo();
         // Creating 3 threads
         Thread thread0 = new Thread(new Display1(td1));
         Thread thread1 = new Thread(new Display(td1));
         Thread thread2 = new Thread(new Display(td1));
        
         // Setting priorities
         thread1.setPriority(Thread.MAX_PRIORITY);
         thread2.setPriority(Thread.MAX_PRIORITY);
         thread0.setPriority(Thread.MIN_PRIORITY);
          
         thread0.start();
         thread1.start();
         thread2.start();
        
     }
}

class Display implements Runnable{
    private ThreadStarvationDemo td;
    Display(ThreadStarvationDemo td){
        this.td = td;
    }
    @Override
    public void run() {
        td.displayValues();
        System.out.println("Calling again");
        td.displayValues();
        System.out.println("Calling again");
        td.displayValues();
        //System.out.println("Calling again");       
    }    
}

/**
 * 
 */
class Display1 implements Runnable{
    private ThreadStarvationDemo td;
    Display1(ThreadStarvationDemo td){
        this.td = td;
    }
    @Override
    public void run() {
        try {
            // introducing some delay
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        td.displayValues();
        //System.out.println("Calling again");       
    }    
}
