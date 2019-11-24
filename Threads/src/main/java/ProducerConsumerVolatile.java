import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerVolatile {
	public static void main(String[] args) {
		Queue<Integer> sharedListObj = new LinkedList<Integer>();
		ProducerConsumer producerConsumer = new ProducerConsumer();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 5; i++){
					producerConsumer.produce(sharedListObj);
				}
			}
		}, "ProducerThread").start();

		new Thread(()-> {
			for(int i = 0; i < 5; i++){
				producerConsumer.consume(sharedListObj);
			}

		}, "ConsumerThread").start();        

	}
}

class ProducerConsumer{

	private int value=0;
	private volatile boolean flag = false;

	public void produce(Queue<Integer> sharedListObj) {

		while(flag) {
			try {
				Thread.sleep(3000);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		sharedListObj.add(++value);
		System.out.println("Thread " + Thread.currentThread().getName() + 
				" putting " + value);
		flag = true;		
	}
	public int consume(Queue<Integer> sharedListObj) {
		int j=0;
		while(!flag) j++;

		System.out.println("Getting from queue ");
		int value = sharedListObj.remove();
		flag = false;
		System.out.println("Thread " + Thread.currentThread().getName() + 
				" Consuming " + value);
		return value;		
	}



}