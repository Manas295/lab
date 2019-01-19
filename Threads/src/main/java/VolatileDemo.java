
public class VolatileDemo {
	public  static volatile int count=0;
	//public  static  int count=0;

	public static void main(String[] args) {

		Thread t1 =  new Thread(new Runnable() {

			@Override
			public void run() {
				int local = count;
				while(count<5)	
				{
					System.out.println("Incrementing count to : "+(local+1));
					count = ++local;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				int local = count;
				while(local<5)
				{
					if(local!=count)
					{
						System.out.println("Got Change for count :  "+count);
						local = count;
					}
				}
			}
		});

		t2.start();
		t1.start();

	}

}

