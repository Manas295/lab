
public class TestSynch {
	public static void main(String[] args) {

		Mythread obj = new Mythread();
		Thread ob1= new Thread(obj);
		ob1.start();
		Mythread obj1 = new Mythread();
		Thread ob2= new Thread(obj);
		ob2.start();
	}

}

class Mythread implements Runnable
{

	public void run() {
		Display();
	}

	public void Display()
	{
		synchronized (this) {
			System.out.println("Hi inside display");
			Display2();

		}
	}
	public void Display2()
	{
		synchronized (this) {
			System.out.println("Hi inside display2");

		}
	}

}