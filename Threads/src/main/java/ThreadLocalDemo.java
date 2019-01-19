import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalDemo {
	
	/*
	 *The ThreadLocal class in Java enables you to create variables that can only be read and written by the same thread.
	 *Thus, even if two threads are executing the same code, and the code has a reference to a ThreadLocal variable, 
	 *then the two threads cannot see each other's ThreadLocal variables.
	 * 
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread(new Task("YYYY/MM/dd"));
		Thread t2 = new Thread(new Task("MM-dd-YY"));
		t1.start();
		t2.start();

	}
	public static String threadSafeFormat(Date date){
		DateFormat formatter = perThreadValue.getValue();
		return formatter.format(date);
	}
	public static void setFormatPerThread(String date){
		SimpleDateFormat formatter = new SimpleDateFormat(date);
		perThreadValue.setValue(formatter);
	}
}
class perThreadValue
{

	private static final ThreadLocal<SimpleDateFormat> threadlocal = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println("Creating SimpleDateFormat for Thread : " + Thread.currentThread().getName());
			return new SimpleDateFormat("dd/MM/yyyy");
		}	

	};

	public static SimpleDateFormat getValue()
	{
		System.out.println("Thread Local Object Hashcode "+threadlocal.hashCode());
		return	threadlocal.get();
	}

	public static void setValue(SimpleDateFormat dateFormat)
	{

		threadlocal.set(dateFormat);
	}
}
class Task implements Runnable
{
	String format=null;
	Task(String format)
	{
		this.format = format;
	}

	@Override
	public void run() {

		ThreadLocalDemo.setFormatPerThread(format);
		System.out.println("Thread "+Thread.currentThread().getName()+" Formatted Date "+ThreadLocalDemo.threadSafeFormat(new Date())+"");
	}

}



