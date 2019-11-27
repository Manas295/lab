import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MyDeadlock {

	String str1 = "Java";
	String str2 = "UNIX";

	Thread trd1 = new Thread("My Thread 1"){
		public void run(){
			while(true){
				synchronized(str1){
					System.out.println("Thread 1 got the lock on string 1");
					synchronized(str2){
						System.out.println("Thread 1 got the lock on string 2");
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};

	Thread trd2 = new Thread("My Thread 2"){
		public void run(){
			while(true){
				synchronized(str2){
					System.out.println("Thread 2 got the lock on string 2");
					synchronized(str1){
						System.out.println("Thread 2 got the lock on string 1");
						System.out.println(str2 + str1);
					}
				}
			}
		}
	};

	public static void main(String a[]){
		MyDeadlock mdl = new MyDeadlock();
		mdl.trd1.start();
		mdl.trd2.start();

		ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
		long threadId[] = mxBean.findMonitorDeadlockedThreads();
		if(threadId != null)
		{
			ThreadInfo info[] = mxBean.getThreadInfo(threadId);

			for (ThreadInfo threadInfo : info)
			{
				System.out.println("\nDeadlock Thread details.");
				System.out.println(threadInfo.getThreadId());    
				System.out.println(threadInfo.getThreadName());  
				System.out.println(threadInfo.getLockName());

				System.out.println(threadInfo.getLockOwnerId());
				System.out.println(threadInfo.getLockOwnerName());             
			}
		}

		System.out.println("\nGeneral Thread details");
		System.out.println(("Current number of live threads :"+ mxBean.getThreadCount()));
		System.out.println("Total CPU time for the current thread: "+mxBean.getCurrentThreadCpuTime());
		System.out.println("Current number of live daemon threads:"+mxBean.getDaemonThreadCount());
		System.out.println("Peak live thread count :"+mxBean.getPeakThreadCount());
		System.out.println("Total number of threads created and started"
				+mxBean.getTotalStartedThreadCount());
	}

}