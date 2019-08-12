import java.util.concurrent.Semaphore;

public class PrintEvenOddBySemaphore {
	public static void main(String[] args) {

		SharedPrinter s =  new SharedPrinter();
		// Producer and Consumer threads
		Thread t1 = new Thread(new EvenNumProducer(s,10), "Even");
		Thread t2 = new Thread(new OddNumProducer(s,10), "Odd");
		t1.start();
		t2.start();

	}
}
//Shared class used by threads
class SharedPrinter{
	int i;
	// 2 semaphores
	// sc initialized with 0 permits 
	// to ensure put() executes first
	Semaphore semEven = new Semaphore(0);
	Semaphore semOdd = new Semaphore(1);

	public void printEvenNum(int i){
		try {
			// acquiring consumer semaphore
			semEven.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
		// releasing producer semaphore
		semOdd.release();
	}

	public void printOddNum(int i){
		try {
			// acquiring producer semaphore
			semOdd.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.i = i;
		System.out.println(i);
		// releasing consumer semaphore
		semEven.release();
	}
}

//Producer thread
class EvenNumProducer implements Runnable{

	int index;
	SharedPrinter s;
	EvenNumProducer(SharedPrinter s,int index){
		this.s = s;
		this.index = index;
	}
	@Override
	public void run() {
		for(int i = 2; i <=index ; i= i+2){
			s.printEvenNum(i);
		}
	}            
}

//Consumer thread
class OddNumProducer  implements Runnable{
	SharedPrinter s;
	int index;
	OddNumProducer(SharedPrinter s,int index){
		this.s = s;
		this.index = index;
	}

	@Override
	public void run() {    
		for(int i = 1; i <=index; i=i+2){
			s.printOddNum(i);                
		}
	}
}
