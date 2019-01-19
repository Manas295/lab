import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args) throws InterruptedException {

		final CountDownLatch countDownLatch = new CountDownLatch(3);
		Service service  = new Service("Service-A", countDownLatch,2000);
		Service service1 = new Service("Service-B", countDownLatch,4000);
		Service service2 = new Service("Service-C", countDownLatch,5000);
		service.start();
		service1.start();
		service2.start();

		System.out.println("All Service has been started ");
		countDownLatch.await();

		System.out.println("Main Thread Started");

	}
}


class Service extends Thread
{
	String servicetype;
	CountDownLatch countDownLatch;
	int timetostat;

	Service(String service, CountDownLatch countDownLatch,int timetostart)
	{
		this.servicetype = service;
		this.countDownLatch = countDownLatch;
		this.timetostat =  timetostart;
	}

	@Override
	public void run() {


		try {
			Thread.sleep(timetostat);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(servicetype+" counts down");
		countDownLatch.countDown();
		System.out.println(servicetype+" Service is Running ");
		
	}

}
