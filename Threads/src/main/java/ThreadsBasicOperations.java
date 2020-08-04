import java.util.LinkedList;

public class ThreadsBasicOperations {

	public static void main(String[] args) {

		TestWaitNotify testWaitNotify	= new TestWaitNotify();
		testWaitNotify.testWaitNotify();

		TestJoin testJoin = new TestJoin();
		//testJoin.testJoin();

		TestDemonThreads testDemonThreads	= new TestDemonThreads();
		//testDemonThreads.testDemonThreads();

		TestYieldMethod testYieldMethod	= new TestYieldMethod();
		//testYieldMethod.testYield();
	}
}



class TestWaitNotify{
	/*
	 * Producer consumer problem.
	 */

	public void testWaitNotify(){
		Resource resource	= new Resource();

		Producer producer	= new Producer();
		Consumer consumer	= new Consumer();

		producer.setResource(resource);
		consumer.setResource(resource);


		consumer.start();
		producer.start();

	}

	class Resource{
		LinkedList<Integer> list = new LinkedList<Integer>();
	}

	class Producer extends Thread{
		Resource resource;
		public void setResource(Resource resource) {
			this.resource	=  resource;
		}

		public void run() {
			produce();
		}

		public void produce(){
			try {
				for(int i=0;i<10;i++) {
					synchronized (resource) {
						resource.list.add(i);
						resource.notify();
					}
					Thread.sleep(2000);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Nothing to produce.");
			System.exit(0);
		}
	}

	class Consumer extends Thread{
		Resource resource;
		public void setResource(Resource resource) {
			this.resource	=  resource;
		}

		public void run() {
			consume();
		}

		public void consume() {
			try {
				while(true) {
					synchronized (resource) {
						if(resource.list.isEmpty()) {
							System.out.println("Waiting for producer to produce.");
							resource.wait();
						}else {
							System.out.println("Polled item is :: " + resource.list.poll());
						}
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}


class TestJoin{

	Thread printEvenNumbers	= new Thread(new Runnable() {

		public void run() {
			for(int i=0;i<20;i++) {
				try {
					if(i%2==0)
						System.out.println(i);
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	});


	Thread printOddNumbers	= new Thread(new Runnable() {

		public void run() {
			try {
				for(int i=0;i<20;i++) {
					if(i%2!=0)
						System.out.println(i);
					Thread.sleep(10);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	});

	public void testJoin() {
		try {
			printEvenNumbers.start();

			printEvenNumbers.join(); // This join will stop the current thread to move forward.
			
			System.out.println("This will line will be printed after the even numbers printing thread completes execution.");

			printOddNumbers.start();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


/*
 * Next class starts 
 */


class TestDemonThreads{

	Thread demonThread	= new Thread(new Runnable() {

		public void run() {
			try {
				while(true) {
					System.out.println("Demon thread is running in while(true) ..");
					Thread.sleep(5000);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			// We will not get these prints.
			System.out.println("Demon thread is no more.");
		}
	});

	Thread someNormalThread = new Thread(new Runnable() {

		public void run() {
			try {
				System.out.println("Normal thread is running .. ");
				for(int i=0;i<10;i++) {
					System.out.println("Prossing by normal thread :: "+i);
					Thread.sleep(2000);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Normal thread is no more.");
		}
	});

	public void testDemonThreads() {
		demonThread.setDaemon(true);
		demonThread.start();
		someNormalThread.start();
	}
}


/*
 * Next class starts 
 */


class TestYieldMethod{
	Thread longRunningLowPriorityThread	= new Thread(new Runnable() {

		public void run() {
			try {
				for(int i=0;i<20;i++) {
					System.out.println("long running thread count is " + i);
					Thread.sleep(100);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	});
	
	Thread shortRunningThread	= new Thread(new Runnable() {
		
		public void run() {
			try {
				for(int i=0;i<20;i++) {
					System.out.println("Short running count is " + i);
					Thread.sleep(100);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	});
	
	public void testYield() {
		//The java.lang.Thread.yield() method causes the currently executing thread object to 
		//temporarily pause and allow other threads to execute.
		
		shortRunningThread.start();
		Thread.yield();
		longRunningLowPriorityThread.start();
	}
}
