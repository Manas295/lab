
public class SynchronizedBlocks_Static_NonStatic {

	public static void main(String[] args) {

		SharedObject otherSharedObject	= new SharedObject();
		SharedObject sharedObject	= new SharedObject();



		Thread thread1	= new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						sharedObject.m1();
						//Thread.sleep(100);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread thread2	= new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						sharedObject.m2();
						Thread.sleep(100);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread thread3	= new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					sharedObject.m3();
				}
			}
		});

		Thread thread4	= new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						sharedObject.m4();
						Thread.sleep(100);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread thread5	= new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						try {
							sharedObject.m5();
							Thread.sleep(100);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		});


		Thread thread6	= new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						try {
							otherSharedObject.m6();
							Thread.sleep(100);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		});


		//Q - Can two threads access synchronized methods at the same time , with same object reference.
		//A - No
		/*
		thread4.start();
		thread1.start();
		 */


		//Q - Can two threads access static synchronized methods at the same time, with the same object reference.
		//A - No
		
		/*thread2.start();
		thread5.start();*/
		 


		//Q - Can two threads access synchronized and static synchronized method at the same time. with same object reference
		//A - Yes
		//R	- static synchronized and non static synchronized method lock on two different object. 
		//	  Static will lock on ClassName.class and non static will lock on "this".
		
	/*	thread1.start();
		thread4.start();*/
		 


		//Q - Can two threads work simultaneously one with access to non synchronized method and other with synchronized method  at the same time with same object reference.
		//A - Yes
		
		thread1.start();
		thread3.start();
		 


		//Q - Can two threads access static synchronized methods at the same time, with DIFFERENT object reference.
		//A - No
		/*
		thread6.start();
		thread5.start();
		*/


	}
}

class SharedObject{

	public synchronized void m1() {
		System.out.println("m1 is called..sleeping for 15 seconds ");

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static synchronized void m2() {
		System.out.println("m2 is called..sleeping for 2 seconds ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void m3() {
		System.out.println("m3 is called..sleeping for 1 seconds ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void m4() {
		System.out.println("m4 is called..sleeping for 10 seconds ");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static synchronized void m5() {
		System.out.println("m5 is called..sleeping for 10 seconds ");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static synchronized void m6() {
		System.out.println("m6 is called..sleeping for 1 seconds ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
