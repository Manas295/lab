public class SynchronizedDemo {
	public static void main(String[] args) {
		Message msg = new Message();
		MyClass mc1 = new MyClass(msg, "I");
		MyClass mc2 = new MyClass(msg, "am");
		MyClass mc3 = new MyClass(msg, "not");
		MyClass mc4 = new MyClass(msg, "synchronized");
	}
}
/*
WITHOUT SYNCHRONIZED BELOW WILL BE OUTPUT
Inside displayMsg method Thread-0
 **I
Inside displayMsg method Thread-3
 **synchronized
Inside displayMsg method Thread-2
 **not
Inside displayMsg method Thread-1
 **am
 *
 *
 *

 */
class Message{
	public void displayMsg(String msg){
		//	public synchronized void displayMsg(String msg){
		System.out.println("Inside displayMsg method " + Thread.currentThread().getName());
		synchronized (this) {
			System.out.print("**" + msg); 
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("*");
		}
	}

}

class MyClass implements Runnable{

	Thread t;
	Message msg;
	String message;
	MyClass(Message msg , String str){
		this.msg = msg;
		this.message = str;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		msg.displayMsg(message);
	}
}